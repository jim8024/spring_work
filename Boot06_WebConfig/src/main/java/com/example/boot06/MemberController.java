package com.example.boot06;

import org.springframework.web.bind.annotation.PostMapping;

public class MemberController {
	
	@PostMapping("/member/insert")
	public String insert(int num,String name,String addr) {
		MemberDto dto=new MemberDto();
		
		MemberDto dto2=MemberDto.builder()
				.num(num)
				.name(name)
				.addr(addr)
				.build();
		
		
	return "ok";
	}
}
