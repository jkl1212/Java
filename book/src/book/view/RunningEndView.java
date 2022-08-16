package book.view;

import java.util.ArrayList;

import book.model.dto.BookDTO;
import book.model.dto.CustomerDTO;
import book.model.dto.RentDTO;

public class RunningEndView {

	// 모든 book 출력
	public static void bookListView(ArrayList<BookDTO> BookList) {

		int listSize = BookList.size();

		if (listSize != 0) {
			int count = 1;

			for (BookDTO b : BookList) {
				System.out.println("검색 정보 " + (count++) + " - " + b);
			}

		} else {
			System.out.println("검색 정보 0");
		}
	}

	// 모든 customer
	public static void customerListView(ArrayList<CustomerDTO> customerList) {
		int listSize = customerList.size();

		if (listSize != 0) {
			int count = 1;
			for (CustomerDTO c : customerList) {
				System.out.println("검색 정보 " + (count++) + " - " + c);
			}
		} else {
			System.out.println("검색 정보 0");
		}
	}

	// 모든 rent
	public static void rentListView(ArrayList<RentDTO> rentList) {
		int listSize = rentList.size();

		if (listSize != 0) {
			int count = 1;
			for (RentDTO c : rentList) {
				System.out.println("검색 정보 " + (count++) + " - " + c);
			}
		} else {
			System.out.println("검색 정보 0");
		}
	}

	// 특정 book 출력
	public static void BookView(BookDTO book) {
		System.out.println(book);
	}

	// 특정 customer 출력
	public static void CustomerView(CustomerDTO customer) {
		System.out.println(customer);
	}

	// 특정 rent 출력
	public static void RentView(boolean b) {
		System.out.println(b);
	}

	// ?? 모든 DTO 정보 출력하는 메소드
	// upcasting 활용
	public static void allView(Object object) {
		System.out.println(object);
	}

	// 예외 상황 출력
	public static void showError(String message) {
		System.out.println(message);
	}

}
