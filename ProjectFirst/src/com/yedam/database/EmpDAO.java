package com.yedam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmpDAO {
	
	// 사원등록 Emp 테이블
	public void insertEmp(Emp emp) {
		Connection conn = null;
		
		//db연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//sql 구문 넣어주는거
		String sql = "insert into emp values("+emp.getEmployeeId()
											+",'"+emp.getLastName()
											+"',"+emp.getSalary()
											+",'"+emp.getHireDate()
											+"')";
		
		try {
			System.out.println(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //end of insertEmp
	
	//employees 테이블데이터 조회 결과.
	public Employee[] getEmpList() {
		Employee[] emps = new Employee[100];
		Connection conn = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "select * from employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int i = 0;
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emps[i++] = emp;//Employee 인스턴스 받는작업
//				System.out.println(rs.getInt("employee_id")+ " " + rs.getString("first_name") +
//							  " "+ rs.getString("last_name") + " " + rs.getString("email") +
//							  " "+ rs.getString("phone_number"));
			} //end of while
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("조회 완료.");
		return emps;
	}//end of getEmpList()
}
