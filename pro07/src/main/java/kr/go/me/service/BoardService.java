package kr.go.me.service;

import java.util.List;

import kr.go.me.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> boardList() throws Exception;
	public BoardDTO getBoardDetail(int seq) throws Exception;
	public void boardDelete(int seq) throws Exception;
	public void boardInsert(BoardDTO boardDTO) throws Exception;
	public void boardEdit(BoardDTO boardDTO) throws Exception;
}
