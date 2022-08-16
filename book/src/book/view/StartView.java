package book.view;

import java.util.Scanner;

import book.controller.BookProjectController;
import book.model.dto.BookDTO;
import book.model.dto.CustomerDTO;
import book.model.dto.RentDTO;

public class StartView {
	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		boolean run = true;

		LoginView.check();

		while (run) {
			System.out.println("\ninfo");
			System.out.println("\n      1.책 데이터 | 2.고객 데이터 | 3.대여 데이터 | 4.종료       ");
			System.out.println("\n");
			System.out.print("번호 선택 : ");
			int select = input.nextInt();

			switch (select) {
			case 1:
				boolean run1 = true;
				while (run1) {
					System.out.println("\ninfo");
					System.out.println("\n 1.모든 책정보 | 2.책번호 검색 | 3.신규 책정보 입력 | 4.책 재고 변경 | 5.책 정보 삭제 | 6.돌아가기 ");
					System.out.println("\n");
					System.out.print("번호 선택: ");
					int select1 = input.nextInt();

					switch (select1) {

					case 1:
						BookProjectController.getAllBooks();
						break;
					case 2:

						System.out.println("검색하고자 하는 책번호를 입력하세요");
						System.out.print("책번호: ");
						int bookId = 0;
						try {
							bookId = input.nextInt();
						} catch (java.util.InputMismatchException e) {
							System.out.println("숫자로 입력해주세요");
							input.nextLine();
							bookId = input.nextInt();
						}

						BookProjectController.getBook(bookId);
						break;

					case 3:
						input.nextLine();
						System.out.println("새로운 책정보를 입력하세요.");
						System.out.println("책번호: ");
						int nb1 = input.nextInt();
						System.out.println("책이름을 입력하세요.");
						System.out.println("책이름: ");
						String nb2 = input.nextLine();
						System.out.println("저자를 입력하세요.");
						System.out.println("저자: ");
						String nb3 = input.nextLine();
						System.out.println("출판사를 입력하세요.");
						System.out.println("출판사: ");
						String nb4 = input.nextLine();
						System.out.println("재고량을 입력하세요.");
						System.out.println("재고량: ");
						int nb5 = input.nextInt();
						BookProjectController.addBook(new BookDTO(nb1, nb2, nb3, nb4, nb5));
						break;
					case 4:
						System.out.println("재고를 변경할 책정보를 입력하세요");
						System.out.println("책번호: ");
						int bookId2 = input.nextInt();
						System.out.println("재고량: ");
						int inventory = input.nextInt();
						BookProjectController.updateInventory(bookId2, inventory);
						break;
					case 5:
						System.out.println("삭제할 책번호를 입력하세요.");
						System.out.println("책번호: ");
						int db = input.nextInt();
						BookProjectController.deleteBook(db);
						break;
					case 6:
						System.out.println("메뉴로 돌아갑니다.");
						run1 = false;
						break;
					}
				}
				break;
			case 2:
				boolean run2 = true;
				while (run2) {
					System.out.println("\ninfo");
					System.out.println(" 1.모든 고객정보 | 2.고객아이디 검색 | 3.신규 고객 입력 | 4.고객 연락처 변경 | 5.고객 정보 삭제 | 6.돌아가기 ");
					System.out.println("\n");
					System.out.print("번호 선택: ");
					int select2 = input.nextInt();

					switch (select2) {
					case 1:
						BookProjectController.getAllCustomers();
						break;

					case 2:
						System.out.println("검색하고자 하는 고객아이디를 입력하세요");
						System.out.print("고객아이디: ");
						int customerId = input.nextInt();
						BookProjectController.getCustomer(customerId);
						break;

					case 3:
						System.out.println("새로운 고객정보를 입력하세요.");
						System.out.println("고객아이디: ");
						int nc1 = input.nextInt();
						System.out.println("고객이름을 입력하세요.");
						System.out.println("고객이름: ");
						String nc2 = input.next();
						System.out.println("연락처를 입력하세요.");
						System.out.println("연락처: ");
						String nc3 = input.next();
						BookProjectController.addCutomer(new CustomerDTO(nc1, nc2, nc3));
						break;

					case 4:
						System.out.println("연락처를 변경할 고객아이디를 입력하세요");
						System.out.println("고객아이디: ");
						int ac1 = input.nextInt();
						System.out.println("연락처: ");
						String ac2 = input.next();
						BookProjectController.updatePhoneNum(ac1, ac2);
						break;
					case 5:
						System.out.println("삭제할 고객아이디를 입력하세요.");
						System.out.println("고객아이디: ");
						int dc = input.nextInt();
						BookProjectController.deleteCustomer(dc);
						break;
					case 6:
						System.out.println("메뉴로 돌아갑니다.");
						run2 = false;
						break;
					}
				}
				break;
			case 3:
				boolean run3 = true;
				while (run3) {
					System.out.println("\ninfo");
					System.out.println(" 1.모든 대여정보 | 2.책 이름 검색 | 3.대여 가능 확인 | 4.신규 대여정보 입력 | 5.돌아가기 ");
					System.out.println("\n");
					System.out.print("번호 선택: ");
					int select3 = input.nextInt();
					switch (select3) {
					case 1:
						BookProjectController.getAllRents();
						break;

					case 2:
						input.nextLine();
						System.out.println("검색하고자 하는 책 이름을 입력하세요");
						System.out.print("책 이름: ");
						String bookName = input.nextLine();
						BookProjectController.getRent(bookName);
						break;

					case 3:
						System.out.println("확인하고자 하는 책번호를 입력하세요");
						System.out.print("책번호: ");
						int bookNo = input.nextInt();
						BookProjectController.checkRent(bookNo);
						break;

					case 4:
						System.out.println("새로운 대여정보를 입력하세요.");
						System.out.println("대여번호: ");
						int nr1 = input.nextInt();
						System.out.println("대여일자를 입력하세요.");
						System.out.println("대여일자: ");
						String nr2 = input.next();
						System.out.println("책번호를 입력하세요.");
						System.out.println("책번호: ");
						int nr3 = input.nextInt();
						input.nextLine();
						System.out.println("책이름을 입력하세요.");
						System.out.println("책이름: ");
						String nr4 = input.nextLine();
						System.out.println("고객아이디를 입력하세요.");
						System.out.println("고객아이디: ");
						int nr5 = input.nextInt();
						System.out.println("고객이름을 입력하세요.");
						System.out.println("고객이름: ");
						String nr6 = input.next();

						BookProjectController.addRent(new RentDTO(nr1, nr2, nr3, nr4, nr5, nr6));
						break;

					case 5:
						System.out.println("메뉴로 돌아갑니다.");
						run3 = false;
						break;
					}
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}
		}
		input.close();
	}
}
