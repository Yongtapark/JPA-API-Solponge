package com.example.demo.entity.member.login.interceptor;

import com.example.demo.entity.member.login.session.SessionConst;
import com.example.demo.entity.member.Grade;
import com.example.demo.entity.member.Member;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
public class AdminLoginCheckInterceptor extends LoginCheckInterceptor {
    /**
     * 어드민 여부 체크 인터셉터
     * @param request current HTTP request
     * @param response current HTTP response
     * @param handler chosen handler to execute, for type and/or instance evaluation
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        log.info("인증 체크 인터셉터 실행{}", requestURI);
        HttpSession session = request.getSession(false);
        // 세션이 null 인지 확인합니다. 여기서 null 이면 LoginCheckInterceptor로 검증이 가기 전에
        // 예외가 터져서 끝나버립니다.
        if (session == null) {
            response.sendRedirect("/com.solponge/login");
            return false;
        }

        Member loginMember = (Member) session.getAttribute(SessionConst.LOGIN_MEMBER);
        if (loginMember.getMemberGrade() != Grade.ADMIN) {
            log.info("미인증 사용자 요청 id={}", loginMember.getMemberId());
            response.sendRedirect("/com.solponge/login");
            return false;
        }
        session.setAttribute("member",loginMember);
        return true;
    }
}
