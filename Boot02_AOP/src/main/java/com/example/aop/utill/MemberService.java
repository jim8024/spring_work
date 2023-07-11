package com.example.aop.utill;
/*
 * 
 * MemberService 메소드의 getMember() 메소드에 적용할 aspect 클래스를 만들어서
 * getMember 가 리턴해주는 MemberDto 객체에 1,김구라,노량진을 담아서 
 * 리턴하도록 하세요
 */
public class MemberService {
	
	public MemberDto getMember(int num) {
		MemberDto dto=new MemberDto();
		return dto;
	}
}
