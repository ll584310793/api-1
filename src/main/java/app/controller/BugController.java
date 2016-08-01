package app.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import app.domain.Bug;
import app.jdbc.JdbcService;

@Controller
@RequestMapping("/bugs")
public class BugController {

	@Autowired
	JdbcService jdbcService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public Object index(HttpServletRequest request, HttpServletResponse response) {
		List<Map<String, Object>> maps = jdbcService.jdbcDao
				.queryForList("select * From bug where ProjectID=104 AND BugID=31");
		return maps;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public ModelAndView show(@PathVariable Long id, HttpServletRequest request, HttpServletResponse response) {
		return null;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	@ResponseBody
	public ModelAndView create(@ModelAttribute("bug") Bug bug, HttpServletResponse response) {
		return null;
	}

	@RequestMapping(value = "/{id}/eval", method = { RequestMethod.PUT, RequestMethod.GET })
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public ModelAndView eval(HttpServletRequest request, HttpServletResponse response) {
		return null;
	}

}
