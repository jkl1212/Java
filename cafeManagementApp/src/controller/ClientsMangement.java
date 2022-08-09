/**
 * PROJ : 카페 고객 관리 프로그램
 * FILE : ClientsMangement.java
 * DESC : 입력 받은 reqNo를 통해서 로그인 회원가입 아이디/비번 찾기 로직 실행 
 * 
 * @author 
 * @version 1.0
**/
package controller;


import java.util.ArrayList;
import java.util.Scanner;

import model.Clients;

public class ClientsMangement {
	Scanner s = new Scanner(System.in);
	ClientsSearchModel instance = ClientsSearchModel.getInstance();
	ArrayList<Clients> allClientsList = instance.getClientsList();
	
	public void reqResClients(int reqNo) {
		/**
		 * 로그인 로직
		 */
		if (reqNo == 1) { // 로그인 
			
		} else if (reqNo == 2){  // 회원가입 
			
			
		} else if (reqNo == 3){ // 아이디 비밀번호 찾기
			ClientsSearchModel.FindID();
		} else if (reqNo == 4) { // return home
			System.out.println("홈으로 돌아갑니다.");
			
		} else { // 그 외의 번호가 입력되었을 때 출력할 문구
			System.out.println("*** 무효한 검색 요청 *****\n");
			System.out.println("다시 입력해주세요 \n");
			System.out.println("*****************************\n");
		}
		
		
	}
	
}
