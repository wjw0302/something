package org.drill.controller;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.drill.service.DrillApiService;
import org.drill.utils.ResultStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("drill")
public class DrillApiController {

	@Autowired
	public DrillApiService drillApiService;
	public String content;

	@RequestMapping(value = "find", produces = "application/json;charset=UTF-8")
	public String selectUser(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		if (drillApiService.searchUser(username, password)) {
			content = ResultStatus.RESULT_SECCESS.getContent();
			return "content";
		}
		content = ResultStatus.RESULT_FAILD.getContent();
		return content;
	}

	@RequestMapping(value = "undertaker", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String undertakerApi(HttpServletRequest request, HttpServletResponse response) throws ParseException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("queryName");
		String idCard = request.getParameter("queryNo");
		if (drillApiService.searchUser(username, password)) {
			content = ResultStatus.RESULT_SECCESS.getContent();
			String result = drillApiService.undertakerApi(name, idCard);
			if (result != null) {
				request.setAttribute("result", result);
			}
			return content;
		}
		content = ResultStatus.RESULT_FAILD.getContent();
		return content;
	}

	@RequestMapping(value = "disruptinfo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String disruptinfoApi(HttpServletRequest request, HttpServletResponse response) throws ParseException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("queryName");
		String idCard = request.getParameter("queryNo");
		if (drillApiService.searchUser(username, password)) {
			content = ResultStatus.RESULT_SECCESS.getContent();
			String result = drillApiService.disruptinfoApi(name, idCard);
			if (result != null) {
				request.setAttribute("result", result);
			}
			return content;
		}
		content = ResultStatus.RESULT_FAILD.getContent();
		return content;
	}

	@RequestMapping(value = "wenshu", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String wenshuApi(HttpServletRequest request, HttpServletResponse response)
			throws ParseException, IOException {
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String text = request.getParameter("text");
		if (drillApiService.searchUser(username, password)) {
			content = ResultStatus.RESULT_SECCESS.getContent();
			String result = drillApiService.wenshuApi(text);
			if (result != null) {
				request.setAttribute("result", result);
			}
			return content;
		}
		content = ResultStatus.RESULT_FAILD.getContent();
		return content;
	}

	@RequestMapping(value = "court", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String courtApi(HttpServletRequest request, HttpServletResponse response)
			throws ParseException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String text = request.getParameter("text");
		System.out.println(text);
		if (drillApiService.searchUser(username, password)) {
			content = ResultStatus.RESULT_SECCESS.getContent();
			String result = drillApiService.courtApi(text);
			if (result != null) {
				request.setAttribute("result", result);
			}
			return content;
		}
		content = ResultStatus.RESULT_FAILD.getContent();
		return content;
	}

	public DrillApiService getDrillApiService() {
		return drillApiService;
	}

	public void setDrillApiService(DrillApiService drillApiService) {
		this.drillApiService = drillApiService;
	}

}
