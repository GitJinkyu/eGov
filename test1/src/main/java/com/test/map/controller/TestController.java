package com.test.map.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.map.service.TestService;
import com.test.map.vo.MapVO;



@Controller
@RequestMapping("/test/*")
public class TestController {

	@Autowired
	TestService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getList(Model model) {
		
		List<MapVO> list = service.getList();
		
		model.addAttribute("list",list);
		
		

		return "map";
	}

}
