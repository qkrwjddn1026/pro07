package kr.go.me.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.go.me.dto.MemberDTO;
import kr.go.me.model.MemberDAO;

@Service
public class MemberSerivceImpl implements MemberService{
	@Autowired
	MemberDAO memberDao;

	@Inject
	BCryptPasswordEncoder pwdEncoder;
	
	//회원목록
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return memberDao.memberList();
	}

	//회원정보 조회
	@Override
	public MemberDTO getMember(String id) throws Exception {	
		return memberDao.getMember(id);
	}

	//회원가입
	@Override
	public void memberInsert(MemberDTO dto) throws Exception {
		memberDao.memberInsert(dto);
	}
	
	//컨트롤러에서 로그인 처리
	@Override
	public MemberDTO signIn(MemberDTO dto) throws Exception {
		return memberDao.signIn(dto);
	}
	
	//서비스에서 로그인 처리
	@Override
	public boolean login(HttpServletRequest request) throws Exception {	
		HttpSession session = request.getSession();
		boolean loginSuccess = false;
		MemberDTO dto = new MemberDTO();
		
		dto.setId(request.getParameter("id"));
		dto.setPw(request.getParameter("pw"));
		
		MemberDTO login = memberDao.login(dto);
		
		loginSuccess =  pwdEncoder.matches(dto.getPw(), login.getPw());
		if(login != null && loginSuccess==true) {
			session.setAttribute("member", login);
			session.setAttribute("sid", login.getId());
			loginSuccess = true;
		}
		return loginSuccess;
	}
	
	@Override
	public MemberDTO loginCheck(MemberDTO dto) throws Exception {
		return memberDao.loginCheck(dto);
	}

	@Override
	public void memberUpdate(MemberDTO dto) throws Exception {
		memberDao.memberUpdate(dto);
	}

	@Override
	public void memberDelete(String id) throws Exception {
		memberDao.memberDelete(id);
	}

}
