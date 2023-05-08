package com.example.demo.entity.infoScrap;

import com.example.demo.utils.Auditing;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class InfoScrap extends Auditing {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long infoScrapNum;
    private Long jobInfoNum;
    private Long memberNum;
    private String infoName;
    private LocalDateTime scrapTime=LocalDateTime.now();

}
