package com.example.demo.service;

import com.example.demo.api.dto.member.MemberCreatedRequest;
import com.example.demo.api.dto.member.MemberCreatedResponse;
import com.example.demo.api.dto.member.MemberUpdatedRequest;
import com.example.demo.api.dto.member.MemberUpdatedResponse;
import com.example.demo.domain.member.Member;
import com.example.demo.exception.MemberNotFoundException;
import com.example.demo.utils.SearchCond;
import com.example.demo.repository.member.MemberQueryRepository;
import com.example.demo.repository.member.MemberRepository;
import com.example.demo.service.interfaces.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final MemberQueryRepository memberQueryRepository;

    @Override
    public Long join(Member member) {
        return memberRepository.save(member).getMemberNum();
    }

    @Override
    public void update(Long memberNo, Member member) {
        Member findmember = memberRepository.findById(memberNo).orElseThrow();//?
        findmember.setMemberPwd(member.getMemberPwd());
        findmember.setMemberPhone(member.getMemberPhone());
        findmember.setMemberAddress(member.getMemberAddress());
        findmember.setMemberEmail(member.getMemberEmail());
    }


    @Override
    public void delete(Long memberNum) {
        memberQueryRepository.deleteLogical(memberNum);
    }

    @Override
    public Optional<Member> findByNum(Long memberNo) {
        return memberRepository.findById(memberNo);
    }

    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Page<Member> findAll(Pageable pageable) {
        return memberRepository.findAll(pageable);
    }

    @Override

    public Page<Member> search(SearchCond cond, Pageable pageable) {
        return memberQueryRepository.search(cond,pageable);
    }


    public Optional<Member> findByMemberId(String memberId) {
            return memberRepository.findAll().stream()
                    .filter(member -> member.getMemberId().equals(memberId)).findAny();

    }

    /**
     * API SERVICE
     */

    @Override
    public ResponseEntity<MemberCreatedResponse> join(MemberCreatedRequest request) {
        Member member=new Member(
                request.getMemberId(),
                request.getMemberPwd(),
                request.getMemberName(),
                request.getMemberAddress(),
                request.getMemberEmail(),
                request.getMemberPhone()
        );
        Long id = join(member);
        return ResponseEntity.status(HttpStatus.CREATED).body(new MemberCreatedResponse(id));

    }

    @Override
    public ResponseEntity<MemberUpdatedResponse> update(Long memberNum, MemberUpdatedRequest request) {
        Optional<Member> findMember = findByNum(memberNum);
        if (findMember.isPresent()){
            String email = request.getMemberEmail1() + "@" + request.getMemberEmail2();
            String address = request.getMemberAddress1() + "/" + request.getMemberAddress2() + "/" + request.getMemberAddress3();
            String phone = request.getMemberPhone1() + "-" + request.getMemberPhone2() + "-" + request.getMemberPhone3();

            Member updateMember = findMember.orElseThrow(() -> new MemberNotFoundException("회원을 찾을 수 없습니다."));

            updateMember.setMemberPwd(request.getMemberPwd());
            updateMember.setMemberAddress(address);
            updateMember.setMemberEmail(email);
            updateMember.setMemberPhone(phone);
            return ResponseEntity.ok(new MemberUpdatedResponse(updateMember.getMemberNum()));
        }else {
            return ResponseEntity.notFound().build();

        }
    }
}
