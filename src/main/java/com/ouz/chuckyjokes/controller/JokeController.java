package com.ouz.chuckyjokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ouz.chuckyjokes.service.JokeService;

/**
 * @author oguz, created on 2018.10.03
 *
 */

@Controller
public class JokeController {
	private JokeService jokeService;

	@Autowired
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/", ""})
	public String showJoke (Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		
		return "chucknorris";
	}
}
