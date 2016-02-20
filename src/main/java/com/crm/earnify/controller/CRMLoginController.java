package com.crm.earnify.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CRMLoginController extends EarnifyController{
	private static final Logger log = LoggerFactory.getLogger(CRMLoginController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView getLoginDefaultPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("login");
		return model;
	}


}
