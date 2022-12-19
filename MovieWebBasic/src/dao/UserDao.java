package dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.MyConnection;
import mode.User;

public class UserDao {
	Connection con = MyConnection.getConnection();

	// Phương thức insert user đã đăng ký
	public String addUser(User u) {
		try {
			// Thực hiện truy vấn
			PreparedStatement ps = con.prepareStatement("insert into newuser values(?,?)");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.executeUpdate(); // được sử dụng để thực thi câu truy vấn được chỉ định, nó có thể là create, drop, insert, update, delete, ...
			return "User Added";
		} catch (SQLException e) {
			e.printStackTrace();
			return "User Not Added " + e;
		}

	}

	// Phương thức thay đổi password
	public boolean changeUser(User c) {
		boolean ret = false;
		try {
			if (validateUser(c.getUsername(), c.getPassword())) {
				// Thực hiện truy vấn
				PreparedStatement ps = con.prepareStatement("update newuser set password=? where username=? and password=?");
				ps.setString(2, c.getUsername());
				ps.setString(3, c.getPassword());
				ps.setString(1, c.getNewpassword());
				ps.executeUpdate(); // được sử dụng để thực thi câu truy vấn được chỉ định, nó có thể là create, drop, insert, update, delete, ...
				ret = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return ret;
		}
		return ret;
	}

	// Xác thực user
	public boolean validateUser(String username, String password) {
		try {
			// Thực hiện truy vấn
			PreparedStatement ps = con.prepareStatement("select * from newuser where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery(); // Lấy data từ newuser
			// Trả về true nếu resultset còn tồn tại phần tử tiếp theo và di chuyển con trỏ đến phần tử đó
			if (rs.next())
				return true;
			else // Ngược lại trả về false
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
