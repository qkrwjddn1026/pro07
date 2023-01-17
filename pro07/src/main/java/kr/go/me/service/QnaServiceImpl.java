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
	public List<QnaDTO> list() throws Exception {
		return qnaDao.list();
	}

	@Override
	public QnaDTO detail(int no) throws Exception {
		return qnaDao.detail(no);
	}

	@Override
	public void qAdd(QnaDTO qnaDTO) throws Exception {
		qnaDao.qAdd(qnaDTO);
	}

	@Override
	public void aAdd(QnaDTO qnaDTO) throws Exception {
		qnaDao.aAdd(qnaDTO);
	}

	@Override
	public void del(int no) throws Exception {
		qnaDao.del(no);
	}

	@Override
	public void edit(QnaDTO qnaDTO) throws Exception {
		qnaDao.edit(qnaDTO);
	}

	@Override
	public List<QnaDTO> atail(int parno) throws Exception {
		return qnaDao.atail(parno);
	}

		
}
