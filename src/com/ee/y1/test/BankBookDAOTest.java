package com.ee.y1.test;

import java.sql.ResultSet;

import com.ee.y1.bankbook.BankBookDAO;
import com.ee.y1.bankbook.BankBookDTO;

public class BankBookDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankBookDTO = new BankBookDTO();
		
		ResultSet rs;
		
		try {
			
			rs = bankBookDAO.getList(bankBookDTO);
			System.out.println(rs != null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
