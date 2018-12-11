package com.habuma.spitter.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.habuma.spitter.mvc.entity.Spittle;
import com.habuma.spitter.mvc.service.SpitterService;

@Controller
public class HomeController {
	public static final int DEFAULT_SPITTELS_PER_PAGE = 25;

	@Autowired
	private SpitterService spitterService;

	@RequestMapping(value="/home")
	public String showHomePage(Map<String, Object> model) {
		model.put("spittles", spitterService.getRecentSpittles(DEFAULT_SPITTELS_PER_PAGE));
		String name = "Mike";
		model.put("name", name);
		Spittle sp = new Spittle();
		sp.setName("Jack");
		sp.setAge(27);
		sp.setAddress("USA");
		model.put("sp", sp);
		return "home";
	}

}
