package com.rest.sprigrest.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.sprigrest.entity.Courses;

public interface CourseDao extends JpaRepository<Courses,Long> {

	


}
