package com.acorn.test;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
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
	   
	   @Controller
	   public class AcornController {
	      
	       @RequestMapping("/test/friend")
	       public ModelAndView friends(ModelAndView mView) {
	          
	           List<String> names=new ArrayList<String>();
	           names.add("김구라");
	           names.add("해골");
	           names.add("원숭이");

	           mView.addObject("names", names);
	           mView.setViewName( "test/friend" );
	          
	           return mView ;
	       }
	   }
}
