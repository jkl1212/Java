package view;

import java.util.ArrayList;
import model.CafeMenu;



public class EndView {
	//메뉴 선택 출력 
		public static void menuView(CafeMenu menu){
			if(menu != null) {
				System.out.println(menu);		
			}else {
				System.out.println("해당 메뉴는 존재하지 않습니다.");
			}
		}
		
		// 모든 메뉴 출력
		public static void MenuListView(ArrayList<CafeMenu> allCafeMenu){
			
			int index = 1;
			
			for(CafeMenu menu : allCafeMenu){	
				
				if(menu != null){
					System.out.println("[Menu : " + (index++) + "] " + menu);
					
				}
			}
		}
}
