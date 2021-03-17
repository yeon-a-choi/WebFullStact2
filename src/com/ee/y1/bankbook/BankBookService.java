package com.ee.y1.bankbook;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ee.y1.member.MemberDAO;
import com.ee.y1.util.ActionFoward;

public class BankBookService {

private BankBookDAO bankBookDAO;
	
	public void setBankBookDAO(BankBookDAO bankBookDAO) {
		this.bankBookDAO = bankBookDAO;
	}



	//getList dao의 getList 호출 
	public ActionFoward getList(HttpServletRequest request)throws Exception{
		ActionFoward actionFoward = new ActionFoward();
		List<BankBookDTO> ar = bankBookDAO.getList();
		
		//request에 데이터를 담아서 jsp로 보낼거라면 foward사용해야함
		//redirect 사용시 데이터가 날아감
		
		request.setAttribute("list", ar);
		
		actionFoward.setPath("../WEB-INF/bankbook/bankbookList.jsp");
		actionFoward.setCheck(true);		
		
		return actionFoward;
	}
	
	public ActionFoward getSelect(HttpServletRequest request)throws Exception{
		
		ActionFoward actionFoward = new ActionFoward();
		BankBookDTO bankBookDTO = new BankBookDTO();

		long bookNumber = Long.parseLong(request.getParameter("bookNumber"));
		
		bankBookDTO = bankBookDAO.getSelect(bookNumber);
		
		actionFoward.setCheck(true);
		actionFoward.setPath("../WEB-INF/bankbook/bankbookSelect.jsp");		
		request.setAttribute("select", bankBookDTO);

		
		return actionFoward;
	}










	
}
