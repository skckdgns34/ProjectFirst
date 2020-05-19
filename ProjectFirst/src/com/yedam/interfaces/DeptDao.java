package com.yedam.interfaces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptDao {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	public Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void insertDept(Department dept) {
		String sql = "insert into dept3 values(?,?,?,?)";
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDepartmentId());
			pstmt.setString(2, dept.getDepartmentName());
			pstmt.setInt(3, dept.getManagerId());
			pstmt.setInt(4, dept.getLocationId());
			
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 입력됨.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Department[] getdeptList() {
		conn = getConnect();
		String sql = "select * from dept3";
		Department[] departments = new Department[100];
		int i = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Department dept = new Department(rs.getInt("department_id")
											,rs.getString("department_name")
											,rs.getInt("manager_id")
											,rs.getInt("location_id")
				);
				departments[i++] = dept;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return departments;
	}
	
	public void updateDept(Department dept) {
		conn = getConnect();
		String sql = "update dept3 set manager_id = ? where department_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getManagerId());
			pstmt.setInt(2, dept.getDepartmentId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 변경됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteDept(int deptId) {
		conn = getConnect();
		String sql = "delete from dept3 where department_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end of delete
}
