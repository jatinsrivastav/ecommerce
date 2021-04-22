package com.onineshopping;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import shoppingbackend.dao.CategoryDAO;

@Controller
public class pagecontroller {
	@Autowired
	//private CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		 ModelAndView mv=new  ModelAndView("page");
		 //passing the list of category
		// mv.addObject("categories" , categoryDAO.list());
		 mv.addObject("title","home");
		 mv.addObject("userclickhome",true);
		 return mv;
		 
	}
	@RequestMapping(value= "/about")
	public ModelAndView about() {
		 ModelAndView mv=new  ModelAndView("page");
		 mv.addObject("title","about us");
		 mv.addObject("userclickabout",true);
		 return mv;
		 
	}
	@RequestMapping(value= "/contact")
	public ModelAndView contact() {
		 ModelAndView mv=new  ModelAndView("page");
		 mv.addObject("title","contactus");
		 mv.addObject("userclickcontact",true);
		 return mv;
		 
	}


}
