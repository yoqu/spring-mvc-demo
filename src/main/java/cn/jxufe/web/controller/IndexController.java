package cn.jxufe.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class IndexController {

	@RequestMapping("/index")
	public String list(HttpServletRequest request, Model model){
		model.addAttribute("test","hello World");
		return "index";
	}
	
}