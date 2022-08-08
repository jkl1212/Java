package model;



import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class CafeMenu {

	
	/** 메뉴 이름 **/
	private String cafeMenuName; 
	
	/** 가격 **/
	private int menuPrice;
		
	public CafeMenu() {}
	public CafeMenu(String cafeMenuName, int menuPrice) {
		
		this.cafeMenuName = cafeMenuName;
		this.menuPrice = menuPrice;
	}
	
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(" 메뉴이름 : ");
		builder.append(cafeMenuName);
		builder.append(" 가격 : ");
		builder.append(menuPrice);
		
		return builder.toString();
	}
}
