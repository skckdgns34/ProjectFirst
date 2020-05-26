package com.yedam.collection.list;

public interface BoardService2 {
	// 한건 생성.
	public void insertBoard(Board board);

	// 한건 수정.
	public void updateBoard(Board board);

	// 한건 삭제.
	public void deleteBoard(String title);

	// 조회
	public void showBoard();

}
