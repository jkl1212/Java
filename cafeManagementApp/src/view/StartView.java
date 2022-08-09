/** 
 * PROJECT  : 카페 관리 프로젝트
 * NAME  :  StartView.java
 * DESC  : 실행 클래스
 * 		     카페명, 카페 메뉴, 고객, 직원 및 실제 진행되는 프로젝트 생성 및 CRUD 로직을 test하는 클래스
 * 
 * @author  
 * @version 1.0
*/

package view;


import controller.MenuSearchModel;
import controller.SelectModel;
import model.Cafe;
import model.CafeMenu;
import model.Clients;
import model.Employee;

public class StartView {
	public static void main(String [] args) {

		//카페
		//카페 이름, 카페 위치, 카페 오픈 시간, 카페 클로즈 시간, 카페 전화번호, 카페 스토어 매니저
		
		Cafe cafe1 = new Cafe("스타벅스 압구정역점", "압구정로 170", "07:00", "21:00", "02-334-1130", "Jessica");
		Cafe cafe2 = new Cafe("스타벅스 더해운재R점", "해운대해변로 197", "08:00", "22:00", "051-124-5593", "Tom");
		Cafe cafe3 = new Cafe("스타벅스 동성로광장", "동성로 4", "08:00", "21:00", "053-799-8812", "Anne");
		Cafe cafe4 = new Cafe("스타벅스 은행동점", "중앙로 164", "09:00", "21:00", "042-043-0416", "Leonardo");
		Cafe cafe5 = new Cafe("스타벅스 부평사거리점", "부평문화로 52", "07:30", "22:00", "032-924-1224", "Olivia");
		Cafe cafe6 = new Cafe("스타벅스 울산간절곶점", "간절곶1길 33", "10:00", "21:00", "052-516-7700", "Ethan");
		Cafe cafe7 = new Cafe("스타벅스 상무역점", "상무중앙로 7", "07:00", "21:00", "062-441-5344", "Kaitlyn");
		Cafe cafe8 = new Cafe("스타벅스 서귀포올레점", "중정로 69", "08:30", "21:00", "064-7991-8291", "David");

		
		//카페 메뉴
		//메뉴 카테고리, 메뉴 이름, 메뉴 가격, 메뉴 칼로리
		
		CafeMenu cafeMenu1 = new CafeMenu("콜드 브루 커피", "돌체 콜드 브루", 6000, "265kcal");
		CafeMenu cafeMenu2 = new CafeMenu("콜드 브루 커피", "콜드 브루", 4900, "5kcal");
		CafeMenu cafeMenu3 = new CafeMenu("콜드 브루 커피", "콜드 브루 오트 라떼", 5800, "120kcal");
		CafeMenu cafeMenu4 = new CafeMenu("콜드 브루 커피", "바닐라 크림 콜드 브루", 5800, "125kcal");
		CafeMenu cafeMenu5 = new CafeMenu("블론드", "아이스 블론드 카페 라떼", 5000, "110kcal");
		CafeMenu cafeMenu6 = new CafeMenu("블론드", "아이스 블론드 카페 아메리카노", 4500, "10kcal");
		CafeMenu cafeMenu7 = new CafeMenu("에스프레소", "아이스 카페 모카", 5500, "250kcal");
		CafeMenu cafeMenu8 = new CafeMenu("에스프레소" , "아이스 카페 아메리카노", 4500, "10kcal");
		CafeMenu cafeMenu9 = new CafeMenu("에스프레소", "아이스 카푸치노", 5000, "115kcal");
		CafeMenu cafeMenu10 = new CafeMenu("프라푸치노", "자바 칩 프라푸치노", 6300, "340kcal");
		CafeMenu cafeMenu11 = new CafeMenu("프라푸치노", "모카 프라푸치노", 5900, "280kcal");
		CafeMenu cafeMenu12 = new CafeMenu("프라푸치노", "카라멜 프라푸치노", 5900, "300kcal");
		CafeMenu cafeMenu13 = new CafeMenu("피지오", "쿨 라임 피지오", 5900, "105kcal");
		CafeMenu cafeMenu14 = new CafeMenu("피지오", "블랙 티 레모네이드 피지오", 5400, "65kcal");
		CafeMenu cafeMenu15 = new CafeMenu("티바나", "아이스 차이 티 라떼", 5500, "190kcal");
		CafeMenu cafeMenu16 = new CafeMenu("티바나", "아이스 자몽 허니 블랙 티", 5700, "125kcal");
		CafeMenu cafeMenu17 = new CafeMenu("티바나", "아이스 얼 그레이 티", 4500, "0kcal");
		CafeMenu cafeMenu18 = new CafeMenu("샌드위치&샐러드", "프렌치 바게트 샌드위치", 5900, "288kcal");
	    CafeMenu cafeMenu19 = new CafeMenu("샌드위치&샐러드", "베이컨 치즈 토스트", 4900, "404kcal");
	    CafeMenu cafeMenu20 = new CafeMenu("아이스크림", "바닐라 아포가토", 5900, "208kcal");
	

		Clients clients1 = new Clients("김현주", 25, "jung@company.com","010-2414-4635","1001","temppw1001","경기 고양시 일산동구 경의로 573 / 4층",'F',"1월3일","A");
		Clients clients2 = new Clients("이지영", 35, "sung@company.com","010-6425-4371","1002","temppw1002","경기 고양시 일산서구 탄중로101번길 41",'F',"5월23일","B");
		Clients clients3 = new Clients("강수호", 32, "shin@company.com","010-6466-2274","1003","temppw1003","경기 고양시 덕양구 행주산성로 117-34",'M',"8월17일","C");
		Clients clients4 = new Clients("하도겸", 28, "kim@company.com","010-7733-3115","1004","temppw1004","경기 고양시 덕양구 행주산성로 141",'M',"11월19일","D");

		// 직원
		Employee employee1 = new Employee("김하준", 22, "khj@conmany.com","010-5262-6735", 201, "서울 서초구 신반포로 176 신세계백화점 강남점 지하 1층","880501-1344525",'M',"5월1일");
		Employee employee2 = new Employee("서은우", 25, "seu@conmany.com","010-6733-1236", 202, "서울특별시 용산구 한강대로50길 25 1층","670428-1256230",'M',"4월28일");
		Employee employee3 = new Employee("황서아", 28, "hsa@conmany.com","010-7735-2427", 203, "서울 서초구 동광로 99 2층","991112-2593963",'F',"11월22일");
		Employee employee4 = new Employee("나서윤", 30, "nsu@conmany.com","010-6612-5523", 204, "서울특별시 종로구 자하문로16길 8","980922-2693843",'F',"9월22일");
	

		MenuSearchModel instance = MenuSearchModel.getInstance();
					
		instance.cafeMenuInsert(cafeMenu1);
		instance.cafeMenuInsert(cafeMenu2);
		instance.cafeMenuInsert(cafeMenu3);
		instance.cafeMenuInsert(cafeMenu4);
		instance.cafeMenuInsert(cafeMenu5);
		instance.cafeMenuInsert(cafeMenu6);
		instance.cafeMenuInsert(cafeMenu7);
		instance.cafeMenuInsert(cafeMenu8);
		instance.cafeMenuInsert(cafeMenu9);
		instance.cafeMenuInsert(cafeMenu10);
//		instance.cafeMenuInsert(cafeMenu11);
//		instance.cafeMenuInsert(cafeMenu12);
//		instance.cafeMenuInsert(cafeMenu13);
//		instance.cafeMenuInsert(cafeMenu14);
//		instance.cafeMenuInsert(cafeMenu15);
//		instance.cafeMenuInsert(cafeMenu16);
//		instance.cafeMenuInsert(cafeMenu17);
//		instance.cafeMenuInsert(cafeMenu18);
//		instance.cafeMenuInsert(cafeMenu19);
//		instance.cafeMenuInsert(cafeMenu20);

		SelectModel s = new SelectModel();
		
		s.reqRes(0);
		
	}
		
	
	
}
