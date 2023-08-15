package org.tech.SpringRegisterMvc.controller;

import java.io.IOException;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.tech.SpringRegisterMvc.Model.Register;
import org.tech.SpringRegisterMvc.repository.RegisterRepository;

import java.util.List;
import java.util.Map;
@Controller
public class HomeController {

	@Autowired
	RegisterRepository registerRepository;
	List<Register>list;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("welcome");
	}
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public String master(Register regis,Map map) {
		
		if(regis.getUsername().equals("Admin") && regis.getPassword().equals("Admin")) {
			return "welcome";
			
		}
		else {
			
			map.put("msg","Invalid Username And PassWord");
			
			return "welcome";
		}
	}
	
}
