package com.example.demo.repository.infoScrap;

import com.example.demo.entity.infoScrap.InfoScrap;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InfoScrapRepository extends JpaRepository<InfoScrap,Long> {
    List<InfoScrap> findAllByMemberNum(Long memberNum);
    void deleteByMemberNumAndJobInfoNum(Long memberNum,Long jobInfoNum);
    Page<InfoScrap> findAllByMemberNum(Long memberNum, Pageable pageable);

}
