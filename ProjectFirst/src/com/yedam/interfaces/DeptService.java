package com.yedam.interfaces;

public interface DeptService {
	// 기능정의만. 구현x
	
	// 한건 생성.
	public void createDept(Department dept); // public abstract void createEmp
	
	// 전체 조회.
	public void getDeptList();
	
	// 한건 수정.
	public void changeDept(Department dept);
	
	// 한건 삭제.
	public void removeDept(int deptId);
}
