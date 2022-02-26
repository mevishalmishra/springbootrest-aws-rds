package com.rest.sprigrest.services;
import java.util.List;

import  com.rest.sprigrest.entity.Courses;

public interface CourseService {
	
	public List<Courses> getCourses();

	public Courses getCourse(long courseId);

	public Courses addCourse(Courses course);

}
