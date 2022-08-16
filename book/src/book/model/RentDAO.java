package book.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import book.model.dto.RentDTO;
import book.model.util.DBUtil;

public class RentDAO {

	// rent 추가
	// insert into rent values(?)
	public static boolean addRent(RentDTO rent) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("insert into rent values(?,?,?,?,?,?)");
			pstmt.setInt(1, rent.getRentNo());
			pstmt.setString(2, rent.getRentDate());
			pstmt.setInt(3, rent.getBookNo());
			pstmt.setString(4, rent.getBookName());
			pstmt.setInt(5, rent.getCustomerId());
			pstmt.setString(6, rent.getCustomerName());

			pstmt2 = conn.prepareStatement("update book set inventory=inventory-1 where book_no=?");
			pstmt2.setInt(1, rent.getBookNo());

			int result = pstmt.executeUpdate();
			int result2 = pstmt2.executeUpdate();
			if (result == 1 && result2 == 1) {
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

	// book name로 해당 rent의 모든 정보 반환
	// select * from rent where book_name=?
	public static ArrayList<RentDTO> getRentInfo(String bookName) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		ArrayList<RentDTO> all = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select * from rent where book_name=?");
			pstmt.setString(1, bookName);
			rset = pstmt.executeQuery();

			all = new ArrayList<RentDTO>();

			while (rset.next()) {
				all.add(new RentDTO(rset.getInt("rent_no"), rset.getString("rent_date"), rset.getInt("book_no"),
						rset.getString("book_name"), rset.getInt("customer_id"), rset.getString("customer_name")));
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn, pstmt, rset);
		}

		return all;
	}

	// 모든 rent 검색해서 반환
	// select * from rent
	public static ArrayList<RentDTO> getAllRent() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		ArrayList<RentDTO> all = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from rent");
			rset = pstmt.executeQuery();

			all = new ArrayList<RentDTO>();

			while (rset.next()) {
				all.add(new RentDTO(rset.getInt("rent_no"), rset.getString("rent_date"), rset.getInt("book_no"),
						rset.getString("book_name"), rset.getInt("customer_id"), rset.getString("customer_name")));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}

	public static boolean checkRent(int bookNo) throws SQLException {
		if (BookDAO.getBook(bookNo).getInventory() >= 1) {
			return true;
		}
		return false;
	}

}
