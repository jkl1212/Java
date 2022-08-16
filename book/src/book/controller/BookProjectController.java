package book.controller;

import java.sql.SQLException;

import book.model.BookDAO;
import book.model.CustomerDAO;
import book.model.RentDAO;
import book.model.dto.BookDTO;
import book.model.dto.CustomerDTO;
import book.model.dto.RentDTO;
import book.view.RunningEndView;

public class BookProjectController {

	// 모든 book 검색 로직
	public static void getAllBooks() {
		try {
			RunningEndView.bookListView(BookDAO.getAllBooks());
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("모든 책 검색 에러 발생");
		}
	}

	// 새로운 book 추가 로직
	public static boolean addBook(BookDTO book) {
		boolean result = false;

		try {
			result = BookDAO.addBook(book);
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("새로운 책 저장 에러 발생");
		}
		return result;
	}

	// book no로 inventory수정
	public static boolean updateInventory(int bookNo, int inventory) {
		boolean result = false;
		try {
			result = BookDAO.updateInventory(bookNo, inventory);
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("book no로 inventory 변경 오류");
		}
		return result;
	}

	// book no로 삭제
	public static void deleteBook(int bookNo) {

		try {
			boolean result = BookDAO.deleteBook(bookNo);
			if (result) {
				RunningEndView.bookListView(BookDAO.getAllBooks());
			} else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("book no로 삭제 변경 오류");
		}

	}

	// book no로 검색
	public static void getBook(int bookNo) {
		try {
			RunningEndView.allView(BookDAO.getBook(bookNo));
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("book no로 검색 오류");
		}

	}

	// 모든 회원 검색 로직
	public static void getAllCustomers() {
		try {
			RunningEndView.customerListView(CustomerDAO.getAllCustomers());
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("모든 회원 검색 에러 발생");
		}
	}

	// 새로운 회원 저장 로직
	public static boolean addCutomer(CustomerDTO customer) {
		boolean result = false;

		try {
			result = CustomerDAO.addCustomer(customer);
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("새로운 회원 저장 에러 발생");
		}
		return result;
	}

	// customer id로 삭제
	public static void deleteCustomer(int customerId) {

		try {
			boolean result = CustomerDAO.deleteCustomer(customerId);
			if (result) {
				RunningEndView.customerListView(CustomerDAO.getAllCustomers());
			} else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("customer id로 삭제 실패");
		}

	}

	// customer id로 검색
	public static void getCustomer(int customerId) {
		try {
			RunningEndView.allView(CustomerDAO.getCustomer(customerId));
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("customer id로 검색 오류");
		}

	}

	// customer id로 phone num 수정
	public static boolean updatePhoneNum(int customerId, String phoneNum) {
		boolean result = false;
		try {
			result = CustomerDAO.updatePhoneNum(customerId, phoneNum);
			RunningEndView.customerListView(CustomerDAO.getAllCustomers());
			;
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("customer id로 phone num 변경 오류");
		}
		return result;
	}

	// 모든 rent 검색 로직
	public static void getAllRents() {
		try {
			RunningEndView.rentListView(RentDAO.getAllRent());
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("모든 rent 검색 에러 발생");
		}
	}

	// 새로운 rent 저장 로직
	public static boolean addRent(RentDTO rent) {
		boolean result = false;

		try {
			result = RentDAO.addRent(rent);
		} catch (SQLException s) {
			s.printStackTrace();
			RunningEndView.showError("새로운 rent 저장 에러 발생");
		}
		return result;
	}

	// book name으로 rent 정보 검색
	public static void getRent(String bookName) {
		try {
			RunningEndView.rentListView(RentDAO.getRentInfo(bookName));
		} catch (SQLException e) {
			e.printStackTrace();
			RunningEndView.showError("book name로 해당 rent info 검색 오류 ");
		}
	}
	
	// inventory -> rent
	public static void checkRent(int bookNo) {
		try {
			RunningEndView.RentView(RentDAO.checkRent(bookNo));
		} catch (SQLException e) {
			e.printStackTrace();
			RunningEndView.showError("book no로 해당 rent 가능여부 검색 오류 ");
		}
	}
	
}
