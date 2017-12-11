package cn.jxufe.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class IndexController {

	@RequestMapping("/index")
	public String list(HttpServletRequest request, Model model){
		model.addAttribute("test","hello World");
		return "index";
	}

	@RequestMapping("/exc")
	public String test(){
		System.out.println("execute exception!");
		throw new NullPointerException();
	}

	@RequestMapping("/exc2")
	public String test2(){
		System.out.println("execute exception 2");
		throw new IllegalArgumentException();
	}
	@RequestMapping("/exc3")
	public String test3(){
		System.out.println("execute exception 3");
		throw new ArrayIndexOutOfBoundsException();
	}

	@ExceptionHandler(value = ArrayIndexOutOfBoundsException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public String excTest(HttpServletRequest request, Exception e) {
		return "ControllerAdvice Exception";
	}
	
}