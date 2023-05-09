package com.example.demo.service;

import com.example.demo.entity.member.Member;
import com.example.demo.repository.member.MemberQueryRepository;
import com.example.demo.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class LoginService {

    private  final MemberRepository memberRepository;
    private final MemberQueryRepository queryRepository;

    /**
     *  return null 이면 실패
     */

    public Member login(String loginId, String loginPwd){
        return queryRepository.findByMemberId(loginId,loginPwd).orElse(null);
    }



}
