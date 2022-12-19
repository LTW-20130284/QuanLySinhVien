package dao;

import java.util.*;

import mode.Emp;

import java.sql.*;

public class ProfileDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "123456");
			;
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	// Phương thức lưu thông tin
	public static int save(Emp e) {
		int status = 0;
		try {
			// Thực hiện truy vấn
			Connection con = ProfileDao.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into emp2(name,dept) values (?,?)");
			ps.setString(1, e.getName());
			ps.setString(2, e.getDept());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}

	// Phương thức cập nhật thông tin
	public static int update(Emp e) {
		int status = 0;
		try {
			// Thực hiện truy vấn
			Connection con = ProfileDao.getConnection();
			PreparedStatement ps = con.prepareStatement("update emp2 set name=?,dept=? where id=?");
			ps.setString(1, e.getName());
			ps.setString(2, e.getDept());
			ps.setInt(3, e.getId());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}

	// Phương thức xóa thông tin
	public static int delete(int id) {
		int status = 0;
		try {
			Connection con = ProfileDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from emp2 where id=?");
			ps.setInt(1, id);
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	// Xác thực bằng id tự động trong mySQL
	public static Emp getEmployeeById(int id) {
		Emp e = new Emp();
		try {
			Connection con = ProfileDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from emp2 where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) // được sử dụng để di chuyển con trỏ đến một hàng tiếp theo từ vị trí hiện tại.
			{
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDept(rs.getString(3));
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return e;
	}

	// Tạo list chứa tất cả user
	public static List<Emp> getAllEmployees() {
		List<Emp> list = new ArrayList<Emp>();
		try {
			Connection con = ProfileDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from emp2");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDept(rs.getString(3));
				list.add(e);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}