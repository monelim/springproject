package com.mh.simple01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.List;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mh.simple01.dto.AADto;
import com.mh.simple01.service.AAService;

@Controller
public class HomeController {
	
	@Autowired
	AAService aaService;
	
	@Autowired
	SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
			
		model.addAttribute("serverTime", "2020년 7월 30일" );		
		return "home";
	}
	
	@RequestMapping(value = "/aajoin", method = RequestMethod.GET)
	public String aajoinget(Locale locale, Model model) {
		
		return "joinform";
	}
	
	@RequestMapping(value = "/aajoin", method = RequestMethod.POST)
	public String aajoinpost(Locale locale, Model model, AADto dto) {
		System.out.print("dto = " + dto);
		
		// aa bb 값 설정해서 insert.
		aaService.join(dto);
		
		return "home";
	}
	
	@RequestMapping(value = "/aaselectall", method = RequestMethod.GET)
	public String aaselect(Locale locale, Model model) {
		
		List<AADto> list = aaService.selectAll();
		model.addAttribute("list", list);
				
		return "aaselect";
	}
	
	@RequestMapping(value = "/aaupdate", method = RequestMethod.GET)
	public String aaupdateget(Model model) {
		return "updateform";
	}
	
	@RequestMapping(value = "/aaupdate", method = RequestMethod.POST)
	public String aaupdatepost(Model model, AADto dto) {
		System.out.println("dto = " + dto);
		aaService.join(dto);
		return "redirect:aaselectall";
	}
	
	@RequestMapping(value = "/aadelete", method = RequestMethod.GET)
	public String aadelete(Model model) {
		sqlSession.delete("aa.deleteaa");
		return "redirect:aaselectall";
	}
	
}
