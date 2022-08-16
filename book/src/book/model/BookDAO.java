package book.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import book.model.dto.BookDTO;
import book.model.util.DBUtil;

public class BookDAO {

	// 책 추가
	// insert into book values(?)
	public static boolean addBook(BookDTO book) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("insert into book values(?,?,?,?,?)");
			pstmt.setInt(1, book.getBookNo());
			pstmt.setString(2, book.getBookName());
			pstmt.setString(3, book.getWriter());
			pstmt.setString(4, book.getPublisher());
			pstmt.setInt(5, book.getInventory());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn, pstmt);
		}

		return false;
	}

	// inventory 수정
	// update book set inventory=? where book_no=?
	public static boolean updateInventory(int bookNo, int inventory) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement("update book set inventory=? where book_no=?");
			pstmt.setInt(1, inventory);
			pstmt.setInt(2, bookNo);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// 책 삭제
	// delete from book where book_no=?
	public static boolean deleteBook(int bookNo) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("delete from book where book_no=?");
			pstmt.setInt(1, bookNo);

			int i = pstmt.executeUpdate();
			if (i == 1) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt);
		}

		return false;

	}

	// id로 해당 책의 모든 정보 반환
	// select * from book where book_no=?
	public static BookDTO getBook(int bookNo) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		BookDTO book = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select * from book where book_no=?");
			pstmt.setInt(1, bookNo);
			rset = pstmt.executeQuery();

			if (rset.next()) {
				book = new BookDTO(rset.getInt("book_no"), rset.getString("book_name"), rset.getString("writer"),
						rset.getString("publisher"), rset.getInt("inventory"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn, pstmt, rset);
		}

		return book;
	}

	// book_name로 해당 책의 모든 정보 반환
	// select * from book where book_name=?
	public static BookDTO getBookId(int bookName) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		BookDTO book = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select * from book where book_name=?");
			pstmt.setInt(1, bookName);
			rset = pstmt.executeQuery();

			if (rset.next()) {
				book = new BookDTO(rset.getInt("book_no"), rset.getString("book_name"), rset.getString("writer"),
						rset.getString("publisher"), rset.getInt("inventory"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn, pstmt, rset);
		}

		return book;
	}

	// 모든 책 검색해서 반환
	// select * from book
	public static ArrayList<BookDTO> getAllBooks() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<BookDTO> all = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from book");
			rset = pstmt.executeQuery();

			all = new ArrayList<BookDTO>();

			while (rset.next()) {
				all.add(new BookDTO(rset.getInt("book_no"), rset.getString("book_name"), rset.getString("writer"),
						rset.getString("publisher"), rset.getInt("inventory")));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}

}
