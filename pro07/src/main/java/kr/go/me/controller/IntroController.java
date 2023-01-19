package kr.go.me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/introduce/*")
public class IntroController {
	
	@GetMapping("a")
	public String a() throws Exception{
		return "introduce/a";
	}
}
