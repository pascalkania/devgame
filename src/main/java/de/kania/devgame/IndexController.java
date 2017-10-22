package de.kania.devgame;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class IndexController {

	@GetMapping
	private String getIndexSite(Model model){
		model.addAttribute("message","das ist eine message");
		return "index";
	}
}
