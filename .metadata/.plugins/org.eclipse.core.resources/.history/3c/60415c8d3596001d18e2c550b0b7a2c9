package kr.go.me.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.me.dto.BoardDTO;
import kr.go.me.model.BoardDAO;
@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardDao.boardList();
	}

	@Override
	public BoardDTO boardDetail(int no) throws Exception {
		return boardDao.boardDetail(no);
	}

	@Override
	public void updateBoard(BoardDTO dto) throws Exception {
		boardDao.updateBoard(dto);
	}

	@Override
	public void insertBoard(BoardDTO dto) throws Exception {
		boardDao.insertBoard(dto);
	}

	@Override
	public void deleteBoard(int no) throws Exception {
		boardDao.deleteBoard(no);
	}
	
}
