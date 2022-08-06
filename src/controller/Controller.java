package controller;

import View.FailView;
import View.SuccessView;
import model.Model;
import model.domain.Menu;

public class Controller {
	private static Model m = Model.getInstance();
	
	public static void reqRes(int no, String name ) {
		if (no == 1) {
			Menu menu01 = m.queryPrice("Americano");
			if (menu01 != null) {
				SuccessView.printPrice(menu01);
			}else {
				FailView.printMsg("해당 메뉴가 존재하지 않습니다.");
			}
			
		}else if (no == 2){
			
			int cu01 = m.queryCustomerAmount("홍길동");
			if (cu01 != 0) {
				SuccessView.printAmount(cu01);
			}else {
				FailView.printMsg("해당 손님은 존재하지 않습니다.");
				
			}
				 
			
		}else {
			FailView.printMsg("who are you Fail!");
		}
	}

}
