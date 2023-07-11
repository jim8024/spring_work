package com.example.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.example.aop.utill.MemberDto;

@Aspect
@Component
public class MemberAspect {

	@Around("execution(com.example.aop.utill.MemberDto get*(..))")
	public Object test(ProceedingJoinPoint joinPoint) throws Throwable {
		
		Object obj=joinPoint.proceed();
		
		MemberDto dto=(MemberDto)obj;
		
		dto.setNum(1);
		dto.setName("김구라");
		dto.setAddr("노량진");
		return dto;
	}
}


