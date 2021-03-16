package com.ee.y1.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankBookDAO {
	
	//getList
	//bankbook table의 모든 데이터 조회 후 리턴
	
	public ResultSet getList(BankBookDTO bankBookDTO) throws Exception{
		
		//1. 로그인 정보
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		
		//2. 메모리에 로딩
		Class.forName(driver);
		
		
		//3. 로그인 시도
		Connection conn = DriverManager.getConnection(url, user, password);
		
		
		//4. sql문
		String sql = "SELECT * FROM BANKBOOK";
		
		
		//5. 미리전송
		PreparedStatement st = conn.prepareStatement(sql);
		
		//6. ?전송
		
		//7. 전송 후 처리
		st.setString(1, bankBookDTO.getBooknum());
		st.setString(2, bankBookDTO.getBookname());
		st.setDouble(3, bankBookDTO.getBookrate());
		st.setBoolean(4, bankBookDTO.isBooksale());
		
		ResultSet rs = st.executeQuery();
		
		//8. 연결 해제
		rs.close();
		st.close();
		conn.close();
		
		
		
		return rs;
		
	}
	
	

}
