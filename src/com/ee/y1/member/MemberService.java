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
		
		if(method.toUpperCase().equals("POST")) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(request.getParameter("id"));
			memberDTO.setPw(request.getParameter("pw"));
			memberDTO.setName(request.getParameter("name"));
			memberDTO.setPhone(request.getParameter("phone"));
			memberDTO.setEmail(request.getParameter("email"));
					
			int result = memberDAO.memberJoin(memberDTO);
			
			actionFoward.setPath("../index.jsp");
			
		}
		
		return actionFoward;
		
	}
	
	//memberLogin
	
	public ActionFoward memberLogin(HttpServletRequest request) throws Exception{
		
		ActionFoward actionFoward = new ActionFoward();
		String method = request.getMethod();
		
		actionFoward.setPath("../WEB-INF/member/memberLogin.jsp");
		
		if(method.toUpperCase().equals("POST")) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(request.getParameter("id"));
			memberDTO.setPw(request.getParameter("pw"));
			
			memberDTO = memberDAO.login(memberDTO);
			
			actionFoward.setPath("../index.jsp");

		}
		
		return actionFoward;
		
	}

}
