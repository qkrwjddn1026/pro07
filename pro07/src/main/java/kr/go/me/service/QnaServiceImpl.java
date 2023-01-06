package kr.go.me.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.me.dto.QnaDTO;
import kr.go.me.model.QnaDAO;

@Service
public class QnaServiceImpl implements QnaService{
	@Autowired
	QnaDAO qnaDao;

	@Override
	public List<QnaDTO> qnaList() throws Exception {
		return qnaDao.qnaList();
	}

	@Override
	public QnaDTO qnaDetail(int no) throws Exception {
		return qnaDao.qnaDetail(no);
	}

	@Override
	public void qWrite(QnaDTO qna) throws Exception {
		qnaDao.qWrite(qna);
	}

	@Override
	public void aWrite(QnaDTO qna) throws Exception {
		qnaDao.aWrite(qna);
	}

	@Override
	public void qnaUpdate(QnaDTO qna) throws Exception {
		qnaDao.qnaUpdate(qna);
	}

	@Override
	public void qnaDelete(int no) throws Exception {
		qnaDao.qnaDelete(no);
	}
	
	
}
