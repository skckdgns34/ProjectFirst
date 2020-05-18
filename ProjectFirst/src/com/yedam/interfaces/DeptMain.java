package com.yedam.interfaces;

import java.util.Scanner;

public class DeptMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DeptService service = new DeptServiceImpl();

		while(true)
		{
			System.out.println("==============================================");
			System.out.println("1.입력  2.전체리스트  3.수정  4.삭제  5.종료");
			System.out.println("==============================================");
			System.out.print("선택> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				System.out.print("부서번호 입력: ");
				int deptId = scn.nextInt();
				scn.nextLine();
				System.out.print("부서이름 입력: ");
				String deptName = scn.nextLine();
				System.out.print("상사 입력: ");
				int managerId = scn.nextInt();
				scn.nextLine();
				System.out.print("지역ID: ");
				int locationId = scn.nextInt();
				Department dept = new Department(deptId, deptName, managerId, locationId);
				service.createDept(dept);
			} else if (menu == 2) {
				service.getDeptList();
			} else if (menu == 3) {
				System.out.print("변경 부서번호 입력: ");
				int deptId = scn.nextInt();
				scn.nextLine();
				System.out.print("상사 입력: ");
				int managerId = scn.nextInt();
				scn.nextLine();
				Department Dept = new Department(deptId, "", managerId, 0);
				service.changeDept(Dept);

			} else if (menu == 4) {
				System.out.print("삭제할 부서번호 입력: ");
				int deptId = scn.nextInt();
				service.removeDept(deptId);

			} else if (menu == 5) {
				break;
			}
		} // end of while
		System.out.println("프로그램 종료");
	} // end of main
} // end of class
