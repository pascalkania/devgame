package de.kania.devgame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class IndexController {

	@RequestMapping(value = "/")
	private String index(){
		return "index";
	}
}
