package com.ee.y1.member;

import javax.servlet.http.HttpServletRequest;

import com.ee.y1.util.ActionFoward;

public class MemberService {
	
	private MemberDAO memberDAO;
	
	
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}



	public ActionFoward memberJoin(HttpServletRequest request) throws Exception {
		
		ActionFoward actionFoward = new ActionFoward();
		String method = request.getMethod();
		System.out.println(method);
		
		actionFoward.setPath("../WEB-INF/member/memberJoin.jsp");
		actionFoward.setCheck(true);
		
		if(method.toUpperCase().equals("POST")) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(request.getParameter("id"));
			memberDTO.setPw(request.getParameter("pw"));
			memberDTO.setName(request.getParameter("name"));
			memberDTO.setPhone(request.getParameter("phone"));
			memberDTO.setEmail(request.getParameter("email"));
					
			int result = memberDAO.memberJoin(memberDTO);
			
			actionFoward.setPath("../index.do");
			actionFoward.setCheck(false);
			
		}
		
		return actionFoward;
		
	}
	
	//memberLogin
	
	public ActionFoward memberLogin(HttpServletRequest request) throws Exception{
		
		ActionFoward actionFoward = new ActionFoward();
		String method = request.getMethod();
		
		actionFoward.setPath("../WEB-INF/member/memberLogin.jsp");
		actionFoward.setCheck(true);
		
		if(method.toUpperCase().equals("POST")) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(request.getParameter("id"));
			memberDTO.setPw(request.getParameter("pw"));
			
			memberDTO = memberDAO.login(memberDTO);
			
			if(memberDTO != null) {
				
				actionFoward.setPath("../index.do");
				actionFoward.setCheck(false);
				
			} else {
				System.out.println("로그인 실패!");
			}
			
			

		}
		
		return actionFoward;
		
	}

}
