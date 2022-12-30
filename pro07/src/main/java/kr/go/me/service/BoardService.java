package kr.go.me.service;

import java.util.List;

import kr.go.me.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> boardList() throws Exception;
	public BoardDTO boardDetail(int no) throws Exception;
	public void updateBoard(BoardDTO dto) throws Exception;
	public void insertBoard(BoardDTO dto) throws Exception;
	public void deleteBoard(int no) throws Exception;
}
