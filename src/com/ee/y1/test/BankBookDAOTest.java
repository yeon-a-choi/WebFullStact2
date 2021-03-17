package com.ee.y1.test;

import java.util.List;

import com.ee.y1.bankbook.BankBookDAO;
import com.ee.y1.bankbook.BankBookDTO;

public class BankBookDAOTest {

	public static void main(String[] args) {
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankBookDTO = new BankBookDTO();
		
		try {
			int result = bankBookDAO.setWrite(bankBookDTO);
			System.out.println(result != 0);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
