package com.gura.test2;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
   
	//이 프로젝트의 최상위 경로 요청이 오면
   @RequestMapping("/")
   public String home(HttpServletRequest request) {
	   //응답에 필요한 데이터라고 가정하자
	   List<String> noticeList=new ArrayList<String>();
	   noticeList.add("날씨가 많이 더워지고 있어요");
	   noticeList.add("어쩌구...");
	   noticeList.add("저쩌구...");
	   //home.jsp 페이지에 필요한 모델 data를 HttpServletRequest객체에 담아두기
	   request.setAttribute("noticeList", noticeList);
	   
	   // /WEB-INF/views/home.jsp 페이지로 forward 이동해서 응답하겠다는 의미
	   // "home" 이라는 문자열을 리턴하면 앞에 "/WEB-INF/views"뒤에 .jsp가 자동으로 붙는다.
      return "home";
   }
   
   @RequestMapping("/fortune")
   public String fortune(HttpServletRequest request) {
	   //오늘의 운세라고 가정하자
	   String fortuneToday="오늘은 되는게 없어요ㅜㅜ";
	   //fortuneToday라는 키값으로 String type data를 받는다.
	   request.setAttribute("fortuneTodat",fortuneToday);
	   // "/WEB-INF/views/" +"test/fortune" + ".jsp"
	   return "test/fortune";//클라이언트에게 ui를 출력해주는 페이지view 페이지
   }
   
}




