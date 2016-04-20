package com.ulearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ulearning.model.Teacher;
import com.ulearning.service.ITeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	@Qualifier("teacherService")
	private ITeacherService teacherService;
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public @ResponseBody Teacher findTeachers() {
		//model.addAttribute("message", "Dummy Teacher");
		
		Teacher teacher = new Teacher();
		teacher.setId(1L);
		teacher.setName("Erol");
		//model.addAttribute("teacher", teacher);
		return teacher;
	}
	
	@RequestMapping(value="/{teacherId}", method = RequestMethod.GET)
	public @ResponseBody Teacher findTeacher(@PathVariable String teacherId) {
		//model.addAttribute("message", "Dummy Teacher");
		
		//Teacher teacher = teacherService.getTeacher(Long.parseLong(teacherId));
		Teacher teacher = new Teacher();
		teacher.setId(Long.parseLong(teacherId));
		teacher.setName("Erol");
		//model.addAttribute("teacher", teacher);
		return teacher;
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
