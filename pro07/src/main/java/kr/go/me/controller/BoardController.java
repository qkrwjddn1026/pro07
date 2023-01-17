package kr.go.me.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.go.me.dto.BoardDTO;
import kr.go.me.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	// 목록
	@GetMapping("list.do")
	public String getBoardList(Model model) throws Exception {
		List<BoardDTO> boardList = boardService.boardList();
		model.addAttribute("boardList", boardList);
		return "board/boardList";
	} 
	
	//상세
	@GetMapping("detail.do")
	public String getBoardDetail(@RequestParam("seq") int seq, Model model) throws Exception{
		BoardDTO dto = boardService.getBoardDetail(seq);
		model.addAttribute("dto", dto);
		return "board/boardDetail";
	}
	
	//삭제
	@GetMapping("delete.do")
	public String boardDelete(@RequestParam("seq") int seq, Model model) throws Exception{
		boardService.boardDelete(seq);
		
		List<BoardDTO> boardList = boardService.boardList();
		model.addAttribute("boardList", boardList);
		return "board/boardList";
	}
	
	//작성 폼
	@GetMapping("insert.do")
	public String insertForm(HttpServletRequest request, Model model) throws Exception {
		return "board/boardInsert";
	}
	//작성 기능
	@PostMapping("insert.do")
	public String boardInsert(HttpServletRequest request, Model model) throws Exception {
		BoardDTO dto = new BoardDTO();
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		boardService.boardInsert(dto);
		
		return "redirect:list.do";
	}
	
	// 수정 폼
	@GetMapping("edit.do")
	public String editForm(HttpServletRequest request, Model model) throws Exception {
		int seq = Integer.parseInt(request.getParameter("seq"));
		BoardDTO dto = boardService.getBoardDetail(seq);
		model.addAttribute("dto", dto);
		return "board/boardEdit";
	}
	// 수정 기능
	@PostMapping("edit.do")
	public String boardEdit(HttpServletRequest request, Model model) throws Exception {
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		BoardDTO dto = new BoardDTO();
		dto.setSeq(seq);
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		boardService.boardEdit(dto);
		
		return "redirect:list.do";
	}
	

}