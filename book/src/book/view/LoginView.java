package book.view;

import java.util.Scanner;

import org.apache.log4j.Logger;

import book.model.LoginDAO;

public class LoginView {
	static Logger logger = Logger.getLogger("LoginCheck");

	public static void login(String id, String pw) throws Exception {
		LoginDAO ldginDAO = new LoginDAO();
		int result = ldginDAO.loginCheck(id, pw);

		if (result == 1) {
			logger.info("로그인 성공 | " + "ID : " + id + ", " + "PW : " + pw);
			System.out.println("로그인 완료");
		} else if (result == 0) {
			logger.info("로그인 실패 | " + "ID : " + id + ", " + "PW : " + pw);
			throw new Exception("PW가 틀렸습니다");
		} else if (result == -1) {
			logger.info("로그인 실패 | " + "ID : " + id + ", " + "PW : " + pw);
			throw new Exception("없는 ID 입니다");
		} else {
			throw new Exception("DB 연동 오류");
		}
	}
	
	public static void check() throws Exception {
		Scanner input = new Scanner(System.in);

		System.out.println("Id 입력: ");
		String id = input.next();
		System.out.println("Pw 입력: ");
		String pw = input.next();
		try {
			login(id, pw);
		} catch (Exception e) {

			check();
		}

	}
	
}