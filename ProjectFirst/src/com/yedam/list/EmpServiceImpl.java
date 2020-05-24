package com.yedam.list;

public class EmpServiceImpl implements EmpService{
	EmpDao dao = new EmpDao();

	@Override
	public void createEmp(Employee emp) {
		dao.insertEmp(emp);
	}
	@Override
	public void getEmpList() {
		for(Employee emp : dao.getEmpList()) {
			if(emp != null)
				System.out.println(emp.toString());
		}
	}
	@Override
	public void changeEmp(Employee emp) {
		dao.updateEmp(emp);
	}
	@Override
	public void removeEmp(int empId) {
		dao.deleteEmp(empId);
	}
}
