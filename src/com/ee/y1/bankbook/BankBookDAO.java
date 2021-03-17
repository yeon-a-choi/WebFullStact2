package com.ee.y1.bankbook;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BankBookDAO {
	
		//getList
		//bankbook table의 모든 데이트 조회 후 리턴
		public List<BankBookDTO> getList()throws Exception{
			ArrayList<BankBookDTO> ar = new ArrayList<>();
			
			//1. 로그인 정보 
			String user="user02";
			String password="user02";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String driver = "oracle.jdbc.driver.OracleDriver";
			
			//2. 클래스 로딩
			Class.forName(driver);
			
			//3. 로그인 Connection
			Connection con = DriverManager.getConnection(url, user, password);
			
			String sql ="select * from bankbook";
			
			PreparedStatement st = con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				BankBookDTO bankBookDTO = new BankBookDTO();
				bankBookDTO.setBookNumber(rs.getLong("bookNumber"));
				bankBookDTO.setBookName(rs.getString("bookName"));
				bankBookDTO.setBookRate(rs.getDouble("bookRate"));
				bankBookDTO.setBookSale(rs.getString("bookSale"));
				ar.add(bankBookDTO);
			}
			
			rs.close();
			st.close();
			con.close();
			
			return ar;
		}
	
		// BankBookDTO bankBookDTO
		public BankBookDTO getSelect(Long bookNumber) throws Exception {

			//1. 로그인 정보 
			String user="user02";
			String password="user02";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String driver = "oracle.jdbc.driver.OracleDriver";
			
			//2. 클래스 로딩
			Class.forName(driver);
			
			//3. 로그인 Connection
			Connection con = DriverManager.getConnection(url, user, password);
			
			// 4. sql 문 작성
			String sql ="select * from bankbook where bookNumber = ?";
			
			//5. 미리 전송
			PreparedStatement st = con.prepareStatement(sql);
			
			//6. ?처리
			st.setLong(1, bookNumber);
					
			// 7. 전송 후 처리
			
			ResultSet rs = st.executeQuery();
			
			
			/*
			 * while(rs.next()) { BankBookDTO bankBookDTO = new BankBookDTO();
			 * bankBookDTO.setBookNumber(rs.getLong("bookNumber"));
			 * bankBookDTO.setBookName(rs.getString("bookName"));
			 * bankBookDTO.setBookRate(rs.getDouble("bookRate"));
			 * bankBookDTO.setBookSale(rs.getString("bookSale")); ar.add(bankBookDTO); }
			 */
			
			BankBookDTO bankBookDTO = null;
			
			if(rs.next()) {
				bankBookDTO = new BankBookDTO();
				bankBookDTO.setBookNumber(rs.getLong("bookNumber"));
				bankBookDTO.setBookName(rs.getString("bookName"));
				bankBookDTO.setBookRate(rs.getDouble("bookRate"));
				bankBookDTO.setBookSale(rs.getString("bookSale"));
			} 
			
			rs.close();
			st.close();
			con.close();
			
			return bankBookDTO;
		}
	

}
