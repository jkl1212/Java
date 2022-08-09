/**
 * PROJ : 카페 관리 프로그램
 * FILE : SelectModel.java
 * DESC : 입력 받은 reqNo를 통해서 메뉴관리, 클라이언트 관리 로직 실행 
 * 
 * @author kyuriKim
 * 
 * @version 1.0
**/
package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.CafeMenu;
import model.Clients;
import view.EndView;

public class SelectModel {
	Scanner s = new Scanner(System.in);
	MenuSearchModel instance = MenuSearchModel.getInstance();
	ClientsSearchModel instance2 = ClientsSearchModel.getInstance();
	
	/** 진행중인 Project를 저장하는 배열 */
	private ArrayList <CafeMenu> cafeMenuList = new ArrayList <CafeMenu>();
	
	/** 카페 관리 시스템 */
	public void reqRes(int reqNo) {
		while (true) { // 카페메뉴관리 / 클라이언트관리 / 종료 중 선택 
			System.out.println("안녕하세요 스타벅스입니다\n무엇을 도와드릴까요?\n");
			System.out.println("1. 카페 메뉴 관리 \n2. 클라이언트 관리 \n3. 종료 "); //필요시 직원관리 추가 
			reqNo = s.nextInt(); // Scanner를 통해서 숫자를 입력받아 각각의 서비스 실행
			
			if (reqNo == 1) { // 1을 입력 받았을 경우 카페 메뉴 메니지먼트 실행
				ArrayList<CafeMenu> allCafeMenuList = instance.getCafeMenuList();		
				EndView.MenuListView(allCafeMenuList);
				System.out.println("1. 카페 가격 수정 \n2. 카페 메뉴 추가 \n3. 카페 메뉴 삭제 \n4. 돌아가기 ");
				int reqNo2 = s.nextInt();
				(new CafeMenuManagement()).reqResMenu(reqNo2);
			
			} else if (reqNo == 2) { // 2를 입력 받았을 경우 로그인 메니지먼트 실행 
				ArrayList<Clients>allClienstList = instance2.getClientsList();
				System.out.println("1. 로그인 \n2. 회원가입 \n3. 아이디 비밀번호 찾기 \n4. 돌아가기");
				int reqNo2 = s.nextInt();
				(new ClientsMangement()).reqResClients(reqNo2);
				
			} else if(reqNo == 3){ // 3을 입력 받았을 경우 프로그램을 종료한다.
				s.close();
				System.out.println("종료하겠습니다 \n");
				break;
						
			} else { // 그 외의 숫자를 입력 받은 경우 다시 입력을 요청한다. 
				System.out.println("*** 무효한 검색 요청 *****\n");
				System.out.println("다시 입력해주세요 \n");
				System.out.println("*****************************\n");
				
			}
		
		}
	}
}
