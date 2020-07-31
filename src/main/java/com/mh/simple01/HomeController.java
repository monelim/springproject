package com.mh.simple01;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mh.simple01.dto.AADto;
import com.mh.simple01.service.AAService;

@Controller
public class HomeController {
	
	@Autowired
	AAService aaService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
			
		model.addAttribute("serverTime", "2020³â 7¿ù 30ÀÏ" );		
		return "home";
	}
	
	@RequestMapping(value = "/aajoin", method = RequestMethod.GET)
	public String aajoin(Locale locale, Model model) {
		
		aaService.join();		
		return "home";
	}
	
	@RequestMapping(value = "/aaselectall", method = RequestMethod.GET)
	public String aaselect(Locale locale, Model model) {
		
		List<AADto> list = aaService.selectAll();
		model.addAttribute("list", list);
				
		return "aaselect";
	}
	
}
