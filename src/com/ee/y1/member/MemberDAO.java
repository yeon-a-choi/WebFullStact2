package com.ee.y1.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	
	
	//memberJoin 데이터를 받아서 DB에 insert 하는 메서드
	public int memberJoin(MemberDTO memberDTO) throws Exception{
		
		// 1. 로그인 정보
		String user = "user02";
		String password = "user02";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		
		// 2. 메모리에 로딩
		Class.forName(driver);
		
		// 3. 로그인 시도
		Connection conn = DriverManager.getConnection(url, user, password);
		
		//4. sql
		String sql = "insert into MEMBER values(?, ?, ?, ?, ?)";
		
		//5. 미리 전송
		PreparedStatement st = conn.prepareStatement(sql);
		
		//6. ? 세팅
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		st.setString(3, memberDTO.getName());
		st.setString(4, memberDTO.getPhone());
		st.setString(5, memberDTO.getEmail());
		
		//7. 최종 전송
		int result = st.executeUpdate();
		
		//8. 닫기
		st.close();
		conn.close();
		
		
		return result;
		
	}
			
			
	
	
	
	//login
	public MemberDTO login(MemberDTO memberDTO)throws Exception{
		
		// 1. 로그인 정보
		String user = "user02";
		String password = "user02";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		
		// 2. 메모리에 로딩
		Class.forName(driver);
		
		// 3. 로그인 시도
		Connection conn = DriverManager.getConnection(url, user, password);
		
		// 4. sql문 생성
		String sql = "SELECT * FROM MEMBER WHERE id = ? and pw = ?";
		
		// 5. 미리 전송
		PreparedStatement st = conn.prepareStatement(sql);

		
		// 6. ? 처리
		//1번째 ?와 2번째 ?
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		
		
		// 7. 최종 전송 후 처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			
			memberDTO.setName(rs.getString("name"));
			memberDTO.setEmail(rs.getString("email"));
			memberDTO.setPhone(rs.getString("phone"));
			
		} else {
			
			memberDTO = null;
			
		}
		
		
		//8. 해제
		rs.close();
		st.close();
		conn.close();
		
		
		return memberDTO;
		
	}

}
