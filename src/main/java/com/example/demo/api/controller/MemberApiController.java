package com.example.demo.api.controller;

import com.example.demo.api.apiService.MemberApiService;
import com.example.demo.api.dto.Result;
import com.example.demo.api.dto.member.*;
import com.example.demo.service.interfaces.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api.com.solponge/members")
@Slf4j
public class MemberApiController {
    private final MemberService memberService;
    private final MemberApiService memberApiService;

    @GetMapping
    public ResponseEntity<Result<MemberSelectResponse>> selectMember(){
        Result<MemberSelectResponse> all = memberApiService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(all);
    }

    @PostMapping
    public ResponseEntity<MemberCreatedResponse> saveMember(@RequestBody @Validated MemberCreatedRequest request){
        Long memberNum = memberApiService.join(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(new MemberCreatedResponse(memberNum));
    }

    @PutMapping("/{memberNum}")
    public ResponseEntity<MemberUpdatedResponse> updateMember(@RequestBody @Validated MemberUpdatedRequest request,
                                                              @PathVariable("memberNum") Long memberNum){
        Long update = memberApiService.update(memberNum, request);
        return ResponseEntity.ok(new MemberUpdatedResponse(update));

    }

    @DeleteMapping("/{memberNum}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long memberNum){
        memberService.delete(memberNum);
      return ResponseEntity.noContent().build();
    }


}
