package com.beat.day01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beat.day01.model.GuestDao;

@Controller
public class ListController {

	@Autowired
	GuestDao guestDao;
	
	@RequestMapping("/list.do")
	public String list(Model model) throws Exception {
		model.addAttribute("list",guestDao.selectAll());
		return "list";
	}
	
}
