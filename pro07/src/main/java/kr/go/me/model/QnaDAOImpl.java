package kr.go.me.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.go.me.dto.QnaDTO;

@Repository
public class QnaDAOImpl implements QnaDAO{
	@Autowired
	SqlSession session;

	@Override
	public List<QnaDTO> list() throws Exception {
		return session.selectList("qna.list");
	}

	@Override
	public QnaDTO detail(int no) throws Exception {
		return session.selectOne("qna.detail",no);
	}

	@Override
	public void qAdd(QnaDTO qnaDTO) throws Exception {
		session.insert("qna.qAdd",qnaDTO);
	}

	@Override
	public void aAdd(QnaDTO qnaDTO) throws Exception {
		session.insert("qna.aAdd",qnaDTO);
	}

	@Override
	public void del(int no) throws Exception {
		session.delete("qna.del",no);
	}

	@Override
	public void edit(QnaDTO qnaDTO) throws Exception {
		session.update("qna.edit",qnaDTO);
	}

	@Override
	public List<QnaDTO> atail(int parno) throws Exception {
		return session.selectList("qna.atail",parno);
	}

	
}
