package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Board> list = new ArrayList<>();
//		BoardService service = new BoardServiceImpl();
//		service.execute();

		BoardService service = new BoardServiceImpl();
	
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();scn.nextLine();
			Board board = new Board(null, null, null);
			if(menu==1) { //1.입력
				System.out.println("제목 입력.");
				String title = scn.nextLine();
				System.out.println("내용 입력.");
				String content = scn.nextLine();
				System.out.println("작성자 입력.");
				String writer = scn.nextLine();
				board = new Board(title, content, writer);
				service.insertBoard(list, board);
			}else if(menu==2) { // 2.수정
				service.changeBoard(list, board);
			}else if(menu==3) { // 3.삭제
				service.removeBoard(list, board);
			}else if(menu==4) { // 4.리스트
				service.getBoardList(list, board);
			}else if(menu==5) { // 5.종료
				System.out.println("종료 선택.");
				break;
			}
		} //end of while
	}
}
