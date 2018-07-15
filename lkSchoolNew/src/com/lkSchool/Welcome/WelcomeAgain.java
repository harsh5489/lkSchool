package com.lkSchool.Welcome;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeAgain {

	@RequestMapping("/")
	protected ModelAndView welcome() 
	{
		ModelAndView modelandview =new ModelAndView("Welcome");
		modelandview.addObject("welcomeMessage", "welcome to the school of dreams");
		return modelandview;
	}
	@RequestMapping("/welcome/{username}")
	protected ModelAndView welcomeAgain(@PathVariable("username") String name) 
	{
		ModelAndView modelandview =new ModelAndView("Welcome");
		modelandview.addObject("welcomeMessage", "welcome to the school of "+name);
		return modelandview;
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	protected ModelAndView studentAdmission()
	{
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
		
	}
	
	@RequestMapping(value="/submitForm", method= RequestMethod.POST)
	public ModelAndView submitForm(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby)
	{
		ModelAndView model=new ModelAndView("SubmitForm");
		model.addObject("msg", "Details submitted by you :: Name: "+name+ ", Hobby: " +hobby);
		return model;
	}
	
}
