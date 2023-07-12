package com.example.boot04;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		List<String> noticeList=new ArrayList<>();
		noticeList.add("Spring boot 시작입니다");
		noticeList.add("어쩌구...");
		noticeList.add("저쩌구...");
		
		request.setAttribute("noticeList", noticeList);
		
		return "home";
	}
	
	@GetMapping("/fortune")
	public ModelAndView fortune(ModelAndView mView) {
	  String fortuneToday="동쪽으로 가면 귀인을 만나요";
	  mView.addObject("fortuneToday",fortuneToday);
	  mView.setViewName("fortune");
	  
	  return mView;

	}
	 @RequestMapping("/fortune2")
	   public String fortune(HttpServletRequest request) {
	      //오늘의 운세(모델(응답에 필요한 데이터))
	      String fortuneToday="동쪽으로 가면 귀인을 만나요";
	      //request scope에 응답에 필요한 데이터를 담는다.
	      request.setAttribute("fortuneToday",fortuneToday);
	      /// Web-INF/views/fortune.jsp 페이지로 forward이동해서 응답하기
	      return "fortune";
	   }
}
