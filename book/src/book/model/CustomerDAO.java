package book.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import book.model.dto.CustomerDTO;
import book.model.util.DBUtil;

public class CustomerDAO {

	// customer 추가
	// insert into customer values(?)
	public static boolean addCustomer(CustomerDTO customer) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("insert into customer values(?,?,?)");
			pstmt.setInt(1, customer.getCustomerId());
			pstmt.setString(2, customer.getCustomerName());
			pstmt.setString(3, customer.getPhoneNum());

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

	// customer id로 phone num 수정하기
	// update customer set phone_num=? where customer_id=?
	public static boolean updatePhoneNum(int customerId, String phoneNum) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement("update customer set phone_num=? where customer_id=?");
			pstmt.setString(1, phoneNum);
			pstmt.setInt(2, customerId);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// customer 삭제
	// delete from customer where customer_id=?
	public static boolean deleteCustomer(int customerId) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("delete from customer where customer_id=?");

			// ?위치에 값 저장
			pstmt.setInt(1, customerId);

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

	@Test
	public void m() throws SQLException {

	}

	// id로 해당 customer의 모든 정보 반환
	// select * from customer where customer_id=?
	public static CustomerDTO getCustomer(int customerId) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		CustomerDTO customer = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select * from customer where customer_id=?");
			pstmt.setInt(1, customerId);
			rset = pstmt.executeQuery();

			if (rset.next()) {
				customer = new CustomerDTO(rset.getInt("customer_id"), rset.getString("customer_name"),
						rset.getString("phone_num"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn, pstmt, rset);
		}

		return customer;
	}

	// 모든 customer 검색해서 반환
	// select * from customer
	public static ArrayList<CustomerDTO> getAllCustomers() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<CustomerDTO> all = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from customer");
			rset = pstmt.executeQuery();

			all = new ArrayList<CustomerDTO>();

			while (rset.next()) {
				all.add(new CustomerDTO(rset.getInt("customer_id"), rset.getString("customer_name"),
						rset.getString("phone_num")));
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}
	

}
