package com.example.demo.service.interfaces;


import com.example.demo.api.dto.member.MemberCreatedRequest;
import com.example.demo.api.dto.member.MemberCreatedResponse;
import com.example.demo.api.dto.member.MemberUpdatedRequest;
import com.example.demo.api.dto.member.MemberUpdatedResponse;
import com.example.demo.domain.member.Member;
import com.example.demo.utils.SearchCond;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface MemberService {

    Long join(Member member);
    void update(Long memberNum, Member member);
    void delete(Long memberNum);//탈퇴
    Member findByMemberNum(Long memberNum);

    List<Member> findAll();
    Page<Member> findAll(Pageable pageable);

    Page<Member> search(SearchCond cond, Pageable pageable);


}
