package View;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		System.out.println("**** 메뉴 가격 검색 ****");
		Controller.reqRes(1,"Americano"); 
		System.out.println("**** 구매 횟수 조회 ****");
		Controller.reqRes(2,"홍동"); 
		System.out.println("****무효한 정보 검색 ****");
		Controller.reqRes(3,"Americano"); 

	}

}

