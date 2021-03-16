package com.ee.y1.test;

import com.ee.y1.member.MemberDAO;
import com.ee.y1.member.MemberDTO;

public class MemberDAOTest {

	public static void main(String[] args) {
		
		//Web 에서 메인 메서드는 테스트 용도로만 사용
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setId("id3");
		memberDTO.setPw("pw3");
		memberDTO.setName("yoona");
		memberDTO.setPhone("010222222222");
		memberDTO.setEmail("yoona@naver.com");
		
		
		try {
			
			
//			memberDTO = memberDAO.login(memberDTO);
			
			int result = memberDAO.memberJoin(memberDTO);
			
//			if(memberDTO != null) {
//				System.out.println("Succeed!");
//			} else {
//				System.out.println("failed!");
//			}
			
			System.out.println(result != 0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
