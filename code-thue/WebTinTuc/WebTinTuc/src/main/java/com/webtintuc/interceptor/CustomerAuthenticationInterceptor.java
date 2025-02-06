package com.webtintuc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
public class CustomerAuthenticationInterceptor implements HandlerInterceptor{

	@Autowired
	HttpSession session;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if(session.getAttribute("accountid")!=null ) {
			return true;
		}
		String ruri=request.getRequestURI();
		if(!ruri.equals("/login"))session.setAttribute("redirect-uri", ruri);
		response.sendRedirect("/login");
		return false;
	}
	
}
