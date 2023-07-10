package com.example.hello2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.hello2.pc.Computer;
import com.example.hello2.pc.Cpu;
import com.example.hello2.utill.Remocon;
import com.example.hello2.utill.RemoconImpl;
import com.example.hello2.utill.TvRemocon;




/*
 * 스프링이 어떤 객체를 생성해서 관리할지 설정(bean 설정)
 * 
 * xml문서로 하던것을 class로 한다.
 */
@Configuration
public class JavaConfig {
	/*
	 * 이 메소드에서 리턴되는 객체를 spring이 관리하는 bean이 되도록 한다.
	 * 아래 메소드는 xml 문서의 <bean class="com.example.hello.Car"/>와  같다
	 */
	@Bean
	public Car myCar() {//method 이름이 bean의 이름(id) 역할을 한다
		System.out.println("myCar() 메소드 호출됨");
		Car c1=new Car();
		return c1;
	}
	//remocon 인터페이스type이 spring이 관리하는 bean이 되도록 설정(의존 관계 느슨)
	@Bean
	public Remocon myRemocon() {//bean의 이름은 MyRemocon
		System.out.println("myRemocon()호출됨");
		//Remocon r1=new RemoconImpl();
		return new RemoconImpl();
	}
	
	@Bean
	public Remocon TvRemocon() {//bean의 이름은 TvRemocon
		Remocon r1= new TvRemocon();
		return r1;
	}
	@Bean
	public Cpu getCpu() {
		return new Cpu();
	}
	
	@Bean
	public Computer myComputer() {
		//생성장 또다른 Bean의 참조값이 필요하면 메소드를 호출해서 얻어내면 된다.
		Computer c1 = new Computer(getCpu());
		return c1;
	}
	
	
}
