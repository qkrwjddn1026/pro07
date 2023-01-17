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

	// 공지사항 목록
	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardDao.boardList();
	}

	// 공지사항 상세보기
	@Override
	public BoardDTO getBoardDetail(int seq) throws Exception {
		return boardDao.getBoardDetail(seq);
	}

	// 공지사항 삭제
	@Override
	public void boardDelete(int seq) throws Exception {
		boardDao.boardDelete(seq);
	}

	// 공지사항 글 작성
	@Override
	public void boardInsert(BoardDTO boardDTO) throws Exception {
		boardDao.boardInsert(boardDTO);
	}

	// 공지사항 수정
	@Override
	public void boardEdit(BoardDTO boardDTO) throws Exception {
		boardDao.boardEdit(boardDTO);
	}
	
	
}
