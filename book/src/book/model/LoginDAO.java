package book.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import book.model.util.DBUtil;

public class LoginDAO {

	public int loginCheck(String id, String pw) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("Select pw from login where id=? ");
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString(1).contentEquals(pw)) {
					return 1;
				} else {
					return 0;
				}
			}
			return -1;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return -2;
	}
}
