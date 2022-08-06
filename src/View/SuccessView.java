package View;

import model.domain.Menu;

public class SuccessView {
	public static void printPrice(Menu m) {
		System.out.println("음료 이름: " + m.getBerverageName()+" 가격은 "+ m.getPrice()+"원 입니다.");
		
	}

	public static void printAmount(int cu01) {
		System.out.println("이용 횟수 : " + cu01 + " 회" );
		
	}
}
