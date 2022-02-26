package com.rest.sprigrest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rest.sprigrest.entity.Courses;
import com.rest.sprigrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(HttpServletResponse res)
	{
		res.setHeader("content-type", "text/html");
		return "index";
	}
	
	@RequestMapping(value = "/addcourse",method = RequestMethod.POST)
	public String addcourse(HttpServletResponse res)
	{
		res.setHeader("content-type", "text/html");
		return "addcourse";
	}

	
	//get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@RequestMapping(path = "/postCourse", method = RequestMethod.POST)
	public Courses postCourse(HttpServletRequest request)
	{
		String title = 	request.getParameter("title");
		String desciption = request.getParameter("desciption");
		Courses courses = new Courses();
		courses.setTitle(title);
		courses.setDesciption(desciption);
		return this.courseService.addCourse(courses);
	}
}
