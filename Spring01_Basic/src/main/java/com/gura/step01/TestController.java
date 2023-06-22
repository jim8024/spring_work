package com.gura.step01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gura.step01.member.MemberDto;

@Controller
public class TestController {
	
	@ResponseBody
	@RequestMapping("/test/json1")
	public String json1() {
		
		return "{\"num\":1,\"name\":\"김구라\",\"addr\":\"노량진\"}";
	}
	@ResponseBody
	@RequestMapping("/test/json2")
	public MemberDto json2() {
		MemberDto dto =new MemberDto();
		dto.setNum(2);
		dto.setName("kim");
		dto.setAddr("paris");
		
		return dto;
	}
	@ResponseBody
	@RequestMapping("/test/json3")
	public Map<String,Object> json3(){
		Map<String,Object> map=new HashMap<>();
		map.put("num",3);
		map.put("name","원숭이");
		map.put("addr","동물원");
		
		return map;
	}
	@ResponseBody
	@RequestMapping("/test/json4")
	public List<String> json4(){
		List<String> names=new ArrayList<>();
		names.add("kim");
		names.add("lee");
		names.add("park");
		
		return names;
	}
	@ResponseBody
	@RequestMapping("/test/json5")
	public List<MemberDto> json5(){
		List<MemberDto> list = new ArrayList<>();
		list.add(new MemberDto(1,"kim","napoli"));
		list.add(new MemberDto(2,"lee","paris"));
		list.add(new MemberDto(3,"park","london"));
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/test/json6")
	public List<Map<String,Object>> json6(){
		List<Map<String,Object>> list = new ArrayList<>();
		Map<String,Object> map1=new HashMap<>();
		map1.put("num",1);
		map1.put("name"," kim");
		map1.put("addr","Napoli");
		
		Map<String,Object> map2=new HashMap<>();
		map2.put("num",2);
		map2.put("name"," lee");
		map2.put("addr","Paris");
		
		Map<String,Object> map3=new HashMap<>();
		map3.put("num",3);
		map3.put("name"," Park");
		map3.put("addr","London");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		return list;
	}
}




