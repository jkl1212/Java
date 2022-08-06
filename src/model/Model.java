package model;

import View.FailView;
import model.domain.Customer;
import model.domain.Menu;


public class Model {
	private static Menu menu01;
	private static Customer cu01;
	private static Model instance = new Model();
	
	private Model (){ }
	
	public static Model getInstance() {
		return instance;
	}
	
	static {
		menu01 = Menu.builder().berverageName("Americano").price(6000).build();
		cu01 = new Customer("홍길동",4);
		
	}
	
	// select * from student where name=?
	public Menu queryPrice(String berverageName){
		if (berverageName.equals(menu01.getBerverageName())) {
			return menu01;
		}else {
			
			
		}
		return null;
		
	}
	
	// select teacher_name from subject where subject_name=?
	public static int queryCustomerAmount(String customerName){
		if (customerName.equals(cu01.getCutomerName())) {
			return cu01.getAmount();
		}else {
			FailView.printMsg("해당 손님은 존재하지 않습니다.");
		}
		return 0;
	}
}
