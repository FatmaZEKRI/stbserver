package fr.univ.rouen.stbserver.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class IndexController {
	   @RequestMapping(value= {"/"}, method=RequestMethod.GET)
	    public ModelAndView getAcceuil() {
		   ModelAndView model = new ModelAndView();
		   model.setViewName("index");;
	        return model;
	    }
	   @RequestMapping(value= {"/help"}, method=RequestMethod.GET)
	    public ModelAndView getHelpl() {
		   ModelAndView model = new ModelAndView();
		   model.setViewName("help");;
	        return model;
	    }

}
