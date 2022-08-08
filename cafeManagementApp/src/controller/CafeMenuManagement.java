package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.CafeMenu;
import view.EndView;
import controller.SelectModel;

public class CafeMenuManagement {

	Scanner s = new Scanner(System.in);
	SearchModel instance = SearchModel.getInstance();
	ArrayList<CafeMenu> allCafeMenuList = instance.getCafeMenuList();	

	public void reqResMenu(int reqNo) {

		
		if (reqNo == 1) {
			System.out.println("수정할 메뉴의 이름을 입력해주세요");
			String updateMenu = s.next();
			System.out.println("변경할 가격을 입력해주세요");
			int updatePrice = s.nextInt();
			instance.cafeMenuUpdate(updateMenu, updatePrice);
			EndView.MenuListView(allCafeMenuList);
		
		}else if (reqNo == 2) {
			System.out.println("추가할 메뉴의 카테고리를 입력해주세요");
			String appendCategory = s.next();
			System.out.println("추가할 메뉴의 이름을 입력해주세요");
			String appendMenu =  s.next();
			System.out.println("추가할 메뉴의 가격을 입력해주세요");
			int appendPrice = s.nextInt();
			System.out.println("추가할 메뉴의 칼로리를 입력해주세요");
			String appendCalorie = s.next();	
			CafeMenu menu = new CafeMenu(appendCategory,appendMenu, appendPrice, appendCalorie);
			instance.cafeMenuInsert(menu);
			EndView.MenuListView(allCafeMenuList);
		
		}else if (reqNo == 3) {
			System.out.println("삭제할 메뉴의 이름을 입력해주세요");
			String deleteMenu = s.next();
			instance.cafeMenuDelete(deleteMenu);
			EndView.MenuListView(allCafeMenuList);
		}else if (reqNo == 4) {
			System.out.println("홈으로 돌아갑니다.");
			
		
		}else {
			System.out.println("*** 무효한 검색 요청 *****\n");
			System.out.println("다시 입력해주세요 \n");
			System.out.println("*****************************\n");
		}
	}
}
