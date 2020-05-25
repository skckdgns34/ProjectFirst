package com.yedam.collection.list;

import java.util.List;

public interface BoardService {

	public void insertBoard(List<Board> list, Board board);
	public void getBoardList(List<Board> list, Board board);
	public void changeBoard(List<Board> list, Board board);
	public void removeBoard(List<Board> list, Board board);
	
//	// 한건 생성.
//	public void createBoard();
//	// 조회
//	public void getBoardList();
//	// 한건 수정.
//	public void changeBoard();
//
//	// 한건 삭제.
//	public void removeBoard();
//	// 실행
//	public void execute();

}
