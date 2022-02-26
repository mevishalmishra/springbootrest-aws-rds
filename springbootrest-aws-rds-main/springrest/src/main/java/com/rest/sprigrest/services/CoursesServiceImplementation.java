package com.rest.sprigrest.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.sprigrest.dao.CourseDao;
import com.rest.sprigrest.entity.Courses;


@Service
public class CoursesServiceImplementation implements CourseService {
	
	List<Courses> listCourses;
	
	@Autowired
	private CourseDao courseDao;
	public CoursesServiceImplementation() {
//		listCourses = new ArrayList<>();
//		listCourses.add(new Courses(101, "5 Point Someone","written by Chetan Bhagat"));
//		listCourses.add(new Courses(102, "night out","written by Chetan Bhagat"));
//		listCourses.add(new Courses(103, "day out","written by Chetan Bhagat"));
//		listCourses.add(new Courses(104, "5 hello Someone","written by Chetan Bhagat"));
//		listCourses.add(new Courses(105, "5 there Someone","written by Chetan Bhagat"));
		
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	
	
	@Override
	public Courses getCourse(long courseId)
	{
		
//		Courses v = null;
//		for(Courses courses: listCourses)
//		{
//			if(courses.getId() == courseId)
//				v = courses;
//			break;
//		}
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
//		listCourses.add(course);
		return courseDao.save(course);
	}
	
	


}
