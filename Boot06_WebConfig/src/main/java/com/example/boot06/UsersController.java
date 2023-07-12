package com.example.boot06;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsersController {
	
	
	
	
	@GetMapping("/users/info")
	public String info(Model model) {
		String address="서울";
		/*
		 * 컨트롤러의 매개변수로 전달된 Model 객체의 addAttribute 메소드를 이용해서
		 * view page에 전달내용을 담으면 알아서 HttpServletRequest 객체가 된다
		 * 또한 컨트롤러의 return type 으로 리턴하지 않아도 동작한다
		 */
		model.addAttribute("address",address);
		return "users/info";
	}
	
	
	@GetMapping("/users/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
	@PostMapping("/users/login")
	public String login(HttpSession session, String id) {
		//session.invalidate(); 초기화후에 세션에 정보를 담을 수 없다.
		session.setAttribute("id", id);
		return "redirect:/";
	}
	
	@GetMapping("users/loginform")
	public String loginform() {
		return "users/loginform";
	}
	
}
