package org.drill.controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.drill.service.DrillApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("drill")
public class DrillApiController {
	
	@Autowired
	public DrillApiService drillApiService;

	@RequestMapping("list")
	public String test(){
		return "/index";
	}
	
	@RequestMapping("find")
	public String selectUser(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		if (drillApiService.searchUser(username, password)) {
			return "index";
		}
		return "error";
	}
	
	@RequestMapping(value="undertaker", method = RequestMethod.GET)
	public String undertakerApi(HttpServletRequest request,HttpServletResponse response) throws ParseException{
		String name = request.getParameter("queryName");
		String idCard = request.getParameter("queryNo");
		System.out.println(idCard);
		if (drillApiService.undertakerApi(name, idCard)){
			return "/index";
		}
		return "/error";
	}

	public DrillApiService getDrillApiService() {
		return drillApiService;
	}

	public void setDrillApiService(DrillApiService drillApiService) {
		this.drillApiService = drillApiService;
	}
	
	
}
