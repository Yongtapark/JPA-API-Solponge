package com.example.demo.api.dto.member;

import lombok.Data;

@Data
public class MemberSelectResponse {
    private Long memberNum;
    private String memberId;
    private String memberPwd;
    private String memberAddress;
    private String memberPhone;
    private String memberEmail;

    public MemberSelectResponse(Long memberNum, String memberId, String memberPwd, String memberAddress, String memberPhone, String memberEmail) {
        this.memberNum = memberNum;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberAddress = memberAddress;
        this.memberPhone = memberPhone;
        this.memberEmail = memberEmail;
    }
}
