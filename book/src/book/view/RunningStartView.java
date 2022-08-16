package book.view;

import book.controller.BookProjectController;
import book.model.dto.BookDTO;
import book.model.dto.CustomerDTO;
import book.model.dto.RentDTO;

public class RunningStartView {
	public static void main(String[] args) {

		System.out.println("***** 모든 book *****");
		BookProjectController.getAllBooks();

		System.out.println("\n***** book 추가 *****");
		BookProjectController.addBook(new BookDTO(6, "sdf", "dfs", "tgf", 3));
		BookProjectController.getAllBooks();

		System.out.println("\n***** no로 book 삭제 *****");
		BookProjectController.deleteBook(6);

		System.out.println("\n***** no로 book 검색 *****");
		BookProjectController.getBook(2);

		System.out.println("\n***** no로 inventory 수정 *****");
		BookProjectController.updateInventory(5, 2);
		BookProjectController.getAllBooks();

		System.out.println("\n***** 모든 customer *****");
		BookProjectController.getAllCustomers();

		System.out.println("\n***** customer 추가 *****");
		BookProjectController.addCutomer(new CustomerDTO(105, "dsds", "01097777777"));
		BookProjectController.getAllCustomers();

		System.out.println("\n***** customer 삭제 *****");
		BookProjectController.deleteCustomer(105);

		System.out.println("\n***** id로 customer 검색 *****");
		BookProjectController.getCustomer(102);

		System.out.println("\n***** no로 phone num 수정 *****");
		BookProjectController.updatePhoneNum(102, "01011112222");

		System.out.println("\n***** 모든 rent *****");
		BookProjectController.getAllRents();

		System.out.println("\n***** book name으로 rent 검색 *****");
		BookProjectController.getRent("파이썬 철저입문");
		
		System.out.println("\n***** rent 추가 *****");
		BookProjectController.addRent(new RentDTO(1006,"2022-08-16",1,"파이썬 철저입문",102,"김민성"));
		BookProjectController.getAllRents();
		System.out.println("\n");
		BookProjectController.getAllBooks();

	}

}
