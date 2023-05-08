package com.example.demo.entity.companyScrap;

import com.example.demo.utils.Auditing;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CompanyScrap extends Auditing {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyScrapNum;
    private Long memberNum;
    private String companyName;
    private LocalDateTime scrapTime = LocalDateTime.now();
}
