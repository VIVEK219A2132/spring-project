package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class Trial {

		@GetMapping("/")
		public ModelAndView load() {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("index");
			return mav;
		}
	}
		


