package com.yedam.interfaces;

public class DeptServiceImpl implements DeptService{
	DeptDao dao = new DeptDao();
	
	@Override
	public void createDept(Department dept) {
		dao.insertDept(dept);

	}

	@Override
	public void getDeptList() {
		for(Department dept : dao.getdeptList()) {
			if(dept != null)
				System.out.println(dept.toString());
		}
	}

	@Override
	public void changeDept(Department dept) {
		dao.updateDept(dept);
	}

	@Override
	public void removeDept(int deptId) {
		dao.deleteDept(deptId);
	}


}
