package com.example.demo.service.interfaces;


import com.example.demo.entity.member.Member;
import com.example.demo.utils.SearchCond;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MemberService {

    Long join(Member member);
    void update(Long memberNum, Member member);
    void delete(Long memberNum);//탈퇴
    Member findByMemberNum(Long memberNum);

    List<Member> findAll();
    Page<Member> findAll(Pageable pageable);

    Page<Member> search(SearchCond cond, Pageable pageable);


}
