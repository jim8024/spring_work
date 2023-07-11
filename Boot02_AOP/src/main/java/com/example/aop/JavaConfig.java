package com.example.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.aop.aspect.MessengerAspect;
import com.example.aop.utill.MemberService;
import com.example.aop.utill.Messenger;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
	
	//Messenger 객체를 bean 으로 만들기
	@Bean
	public Messenger myMessenger() {
		return new Messenger();
	}
	//MessengerAspect를 빈으로 만들기
	@Bean
	public MessengerAspect msa() {
		return new MessengerAspect();
	}
	
	@Bean
	public MemberService memberService() {
		return new MemberService();
	}
}
