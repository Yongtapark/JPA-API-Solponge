package com.example.demo.api.dto.member;

import com.example.demo.entity.member.Grade;
import com.example.demo.utils.AESUtil;
import lombok.Data;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.security.NoSuchAlgorithmException;

@Data
public class MemberCreatedRequest {


    private Long memberNum;

    private Grade memberGrade = Grade.BASIC;
    @NotEmpty
    private String memberId;
    @NotEmpty
    private String memberPwd;
    @NotEmpty
    private String memberPwdCheck;
    @NotEmpty
    private String memberName;
    /**
     * 주소
     */

    private String memberAddress;
    @NotEmpty
    private String memberAddress1;
    @NotEmpty
    private String memberAddress2;
    @NotEmpty
    private String memberAddress3;
    /**
     * 이메일
     */

    private String memberEmail;
    @NotEmpty
    private String memberEmail1;
    @NotEmpty
    private String memberEmail2;
    /**
     * 휴대폰
     */
    private String memberPhone;
    @NotEmpty
    private String memberPhone1;
    @NotEmpty
    private String memberPhone2;
    @NotEmpty
    private String memberPhone3;

    public MemberCreatedRequest() {
    }

    public MemberCreatedRequest(String memberId, String memberPwd, String memberName, String memberAddress, String memberEmail, String memberPhone) {
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
    }

    @NotNull
    public String combineEmail() {
        return this.getMemberEmail1() + "@" + this.getMemberEmail2();
    }

    @NotNull
    public String combinePhone() {
        return this.getMemberPhone1() + "-" + this.getMemberPhone2() + "-" + this.getMemberPhone3();
    }


    @PrePersist
    @PreUpdate
    public void encryptPwd() throws Exception {
        SecretKey secretKey = AESUtil.generateKey();
        memberPwd = AESUtil.encrypt(memberPwd,secretKey);
    }

    @PostLoad
    public void decryptPwd() throws Exception {
        SecretKey secretKey = AESUtil.generateKey();
        AESUtil.decrypt(memberPwd,secretKey);
    }

    @NotNull
    public String combineAddress() {
        return this.getMemberAddress1() + "/" + this.getMemberAddress2() + "/" + this.getMemberAddress3();
    }
}
