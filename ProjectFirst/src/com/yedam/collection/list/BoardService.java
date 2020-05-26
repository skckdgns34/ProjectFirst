package com.yedam.collection.list;

import java.util.List;

public interface BoardService {

	void insertBoard(List<Board> list, Board board);
	void getBoardList(List<Board> list);
	void changeBoard(List<Board> list, Board board);
	void removeBoard(List<Board> list, String title);
	
}
