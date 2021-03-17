package com.ee.y1.test;

import java.util.List;

import com.ee.y1.bankbook.BankBookDAO;
import com.ee.y1.bankbook.BankBookDTO;

public class BankBookDAOTest {

	public static void main(String[] args) {
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankBookDTO = new BankBookDTO();
		try {
			bankBookDTO = bankBookDAO.getSelect(1L);
			System.out.println(bankBookDTO != null);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
