package com.jarorwar.springguide.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@Autowired
	private RedisTemplate redisTemplate;

	@GetMapping("/home")
	public String home(Model model) {
		long pageView = redisTemplate.boundValueOps("page_view").increment(1);
		model.addAttribute("today", new Date ());
		model.addAttribute("pageView",pageView);
		return "home";
	}
}
