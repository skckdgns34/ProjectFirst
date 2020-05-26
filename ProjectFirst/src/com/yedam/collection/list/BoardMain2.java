package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardService2 service = new BoardServiceImpl2();
	
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();scn.nextLine();
			
			//1.입력
			if(menu==1) { 
				System.out.println("제목 입력.");
				String title = scn.nextLine();
				System.out.println("내용 입력.");
				String content = scn.nextLine();
				System.out.println("작성자 입력.");
				String writer = scn.nextLine();
				Board board = new Board(title, content, writer);
				service.insertBoard(board);
				// 2.수정
			}else if(menu==2) { 
				System.out.println("수정할 글 제목 입력하세요.");
				String title = scn.nextLine();
				System.out.println("수정내용 입력하세요");
				String content = scn.nextLine();
				Board board = new Board(title, content, null);
				service.updateBoard(board);
				
				// 3.삭제
			}else if(menu==3) { 
				String title = scn.nextLine();
				service.deleteBoard(title);
				
//				 4.리스트
			}else if(menu==4) { 
				service.showBoard();
				
//				 5.종료
			}else if(menu==5) { 
				System.out.println("종료 선택.");
				break;
			}
		} //end of while\
		System.out.println("프로그램 종료.");
	}
}
