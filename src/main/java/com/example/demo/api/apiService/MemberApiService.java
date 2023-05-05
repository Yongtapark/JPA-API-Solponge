package com.example.demo.api.apiService;

import com.example.demo.api.dto.member.MemberCreatedRequest;
import com.example.demo.api.dto.member.MemberUpdatedRequest;
import com.example.demo.domain.member.Member;
import com.example.demo.service.interfaces.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Component
@Slf4j
public class MemberApiService {
    private final MemberService memberService;

    public Long join(MemberCreatedRequest request) {

        String email = request.getMemberEmail1() + "@" + request.getMemberEmail2();
        String address = request.getMemberAddress1() + "/" + request.getMemberAddress2() + "/" + request.getMemberAddress3();
        String phone = request.getMemberPhone1() + "-" + request.getMemberPhone2() + "-" + request.getMemberPhone3();

        Member member=new Member(
                request.getMemberId(),
                request.getMemberPwd(),
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
        String email = request.getMemberEmail1() + "@" + request.getMemberEmail2();
        String address = request.getMemberAddress1() + "/" + request.getMemberAddress2() + "/" + request.getMemberAddress3();
        String phone = request.getMemberPhone1() + "-" + request.getMemberPhone2() + "-" + request.getMemberPhone3();

        updateMember.setMemberPwd(request.getMemberPwd());
        updateMember.setMemberAddress(address);
        updateMember.setMemberEmail(email);
        updateMember.setMemberPhone(phone);

        return memberNum;
    }




}
