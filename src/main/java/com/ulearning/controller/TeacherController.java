package com.ulearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ulearning.service.ITeacherService;

@Controller
public class TeacherController {

	@Autowired
	@Qualifier("teacherService")
	private ITeacherService teacherService;
	
	@RequestMapping(value="/getTeacher")
	public String findTeacher(Model input) {
		input.addAttribute("message", "Dummy Teacher");
		return "teacher";
	}
	
	/*@RequestMapping(value="/newTeacher")
	public String createTeacher(@ModelAttribute ("newTeacher") Teacher teacher ) {
		return "newTeacher";
	}
	*/
	/*@RequestMapping(value="/getTeacherByText")
	public ModelAndView findTeacherByText(HttpServletRequest input) {
		ModelAndView view = new ModelAndView();
		HttpServletResponse response = (HttpServletResponse) new HttpServletRequestWrapper(input);
		view.addObject(response);
		
		return view;
	}*/
}
