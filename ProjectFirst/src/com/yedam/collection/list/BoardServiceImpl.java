package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BoardServiceImpl implements BoardService {
	Scanner scn = new Scanner(System.in);
//	private List<Board> list = new ArrayList<>();

	//입력
	@Override
	public void insertBoard(List<Board> list, Board board) {
		list.add(board);
	}
	
	//리스트
	@Override
	public void getBoardList(List<Board> list, Board board) {
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	//수정
	@Override
	public void changeBoard(List<Board> list, Board board) {
		System.out.println("수정할 글 제목 입력하세요.");
		String title = scn.nextLine();
		System.out.println("수정내용 입력하세요");
		String content = scn.nextLine();
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setContent(content);
			}
		}
	}
	//사
	@Override
	public void removeBoard(List<Board> list, Board board) {
		String title = scn.nextLine();
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}
	}

	
	
	//입력
//	@Override
//	public void createBoard() {
//		System.out.println("제목 입력.");
//		String title = scn.nextLine();
//		System.out.println("내용 입력.");
//		String content = scn.nextLine();
//		System.out.println("작성자 입력.");
//		String writer = scn.nextLine();
//		list.add(new Board(title, content, writer));
//	}
	// 리스트
//	@Override
//	public void getBoardList() {
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
//	}
//	// 수정
//	@Override
//	public void changeBoard() {
//		System.out.println("수정할 글 제목 입력하세요.");
//		String title = scn.nextLine();
//		System.out.println("수정내용 입력하세요");
//		String content = scn.nextLine();
//		for(int i = 0; i<list.size(); i++) {
//			if(list.get(i).getTitle().equals(title)) {
//				list.get(i).setContent(content);
//			}
//		}
//	}
//	// 삭제
//	@Override
//	public void removeBoard() {
//		System.out.println("삭제할 글 제목 입력.");
//		String title = scn.nextLine();
//		
//		for(int i = 0; i<list.size(); i++) {
//			if(list.get(i).getTitle().equals(title)) {
//				list.remove(i);
//			}
//		}
//		System.out.println("삭제됨");
//	}
//	// 실행
//	@Override
//	public void execute() {
//		while(true) {
//			System.out.println("--------------------------------");
//			System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.종료");
//			System.out.println("--------------------------------");
//			System.out.print("선택> ");
//			int menu = scn.nextInt();scn.nextLine();
//			if(menu==1) { //1.입력
//				createBoard();
//			}else if(menu==2) { // 2.수정
//				changeBoard();
//			}else if(menu==3) { // 3.삭제
//				removeBoard();
//			}else if(menu==4) { // 4.리스트
//				getBoardList();
//			}else if(menu==5) { // 5.종료
//				System.out.println("종료 선택.");
//				break;
//			}
//		} //end of while
//		System.out.println("프로그램 종료.");
//	}

	
}
