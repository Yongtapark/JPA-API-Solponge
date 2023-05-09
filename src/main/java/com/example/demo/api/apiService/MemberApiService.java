package com.example.demo.api.apiService;

import com.example.demo.api.dto.Result;
import com.example.demo.api.dto.member.MemberCreatedRequest;
import com.example.demo.api.dto.member.MemberSelectResponse;
import com.example.demo.api.dto.member.MemberUpdatedRequest;
import com.example.demo.entity.member.Member;
import com.example.demo.service.interfaces.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.crypto.SecretKey;
import java.util.List;
import java.util.stream.Collectors;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Component
@Slf4j
public class MemberApiService {

    /**
     * 기본 CRUD
     */
    private final MemberService memberService;
    private final PasswordEncoder passwordEncoder;

    public Result<MemberSelectResponse> findAll(){
        List<Member> all = memberService.findAll();
        List<MemberSelectResponse> collect = all.stream()
                .map(m -> new MemberSelectResponse(m.getMemberNum(),
                        m.getMemberId(),
                        m.getMemberPwd(),
                        m.getMemberAddress(),
                        m.getMemberPhone(),
                        m.getMemberEmail()))
                .collect(Collectors.toList());
        return new Result(collect);
    }

    public Long join(MemberCreatedRequest request){
        String encodePw = passwordEncoder.encode(request.getMemberPwd());

        String email = request.combineEmail();
        String address = request.combineAddress();
        String phone = request.combinePhone();

        Member member=new Member(
                request.getMemberId(),
                encodePw,
                request.getMemberName(),
                address,
                email,
                phone
        );
        return memberService.join(member);

    }

    @Transactional(readOnly = false)
    public Long update(Long memberNum, MemberUpdatedRequest request) {
        Member updateMember = memberService.findByMemberNum(memberNum);
        String email = request.combineEmail();
        String address = request.combineAddress();
        String phone = request.combinePhone();

        updateMember.setMemberPwd(request.getMemberPwd());
        updateMember.setMemberAddress(address);
        updateMember.setMemberEmail(email);
        updateMember.setMemberPhone(phone);

        return memberNum;
    }



}
