package com.gura.step01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {
   @RequestMapping("/fortune")
   public String fortune(HttpServletRequest request) {
      //오늘의 운세(모델(응답에 필요한 데이터))
      String fortuneToday="동쪽으로 가면 귀인을 만나요";
      //request scope에 응답에 필요한 데이터를 담는다.
      request.setAttribute("fortuneToday",fortuneToday);
      /// Web-INF/views/fortune.jsp 페이지로 forward이동해서 응답하기
      return "fortune";
   }
   @RequestMapping("/fortune2")
   public ModelAndView fortune2() {  //모델도 들어있고 view page 정보도 담겨 있어서.
      //오늘의 운세(모델(응답에 필요한 데이터))
      String fortuneToday="동쪽으로 가면 귀인을 만나요";
      //HttpServletRequest 객체 대신에 ModelAndView 객체를 생성해서
      ModelAndView mView=new ModelAndView();
      //view page 의 위치도 담는다
      mView.addObject("fortuneToday",fortuneToday);
      //모델과 view page 정보가 모두 담겨있는 ModelAndView 객체를 리턴해주면 똑같이 작동한다.
      return mView;
   }
   //ModelAndView를 매개 변수로 선언하면 스프링 프레임워크가 알아서 객체 생성후 참조값을 넣어준다.
   @RequestMapping("/fortune3")
   public ModelAndView fortune3(ModelAndView mView) {  //모델도 들어있고 view page 정보도 담겨 있어서.
      //오늘의 운세(모델(응답에 필요한 데이터))
      String fortuneToday="동쪽으로 가면 귀인을 만나요";
      //view page에 전달한 내용을 담는다.
      mView.addObject("fortuneToday",fortuneToday);
      //view page 의 위치도 담는다
      mView.setViewName("fortune");
      //모델과 view page 정보가 모두 담겨있는 ModelAndView 객체를 리턴해주면 똑같이 작동한다.
      return mView;
   }
}