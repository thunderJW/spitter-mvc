package com.habuma.spitter.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.habuma.spitter.mvc.entity.Spittle;
import com.habuma.spitter.mvc.service.SpitterService;

@Controller
@RequestMapping(value="spitter")
public class SpitterController {
	@Autowired
	private SpitterService spitterService;
	
	@RequestMapping(value="/spittle", method=RequestMethod.GET)
	public String listSpittelsForSpitter(@RequestParam("spitter") String username, @RequestParam("address") String address, 
			Model model) {
		model.addAttribute("changeName", username + " lalal");
		Spittle sp = new Spittle();
		sp.setName(username);
		sp.setAge(29);
		sp.setAddress(address);
		System.out.println("address:" + address);
		model.addAttribute("sp", sp);
		return "spitter/show";
	}
	
	@RequestMapping(value="/showEmail", method=RequestMethod.GET)
	public String testParam(String username, Model model) {
		model.addAttribute("username", username);
		model.addAttribute("email", username + "_0.618@163.com");
		return "spitter/email";
	}

}
