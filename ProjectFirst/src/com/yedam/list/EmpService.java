package com.yedam.list;
 // 인터페이스 -->EmpServiceImp에서 구현
public interface EmpService {
	// 기능정의만. 구현x
	
	// 한건 생성.
	public void createEmp(Employee emp); // public abstract void createEmp
	
	// 전체 조회.
	public void getEmpList();
	
	// 한건 수정.
	public void changeEmp(Employee emp);
	
	// 한건 삭제.
	public void removeEmp(int empId);
}
