package com.gura.spring04.cafe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring04.cafe.service.CafeService;
import com.gura.spring04.file.dto.FileDto;

@Controller
public class CafeController {
	@Autowired
	private CafeService service;
	
	@RequestMapping("/cafe/list")
	public String list(HttpServletRequest request) {
		
		service.getList(request);
		
		return "cafe/list";
	}
	@RequestMapping("/cafe/insertform")
	public String uploadForm() {
		
		return "cafe/insertform";
	}
	
}