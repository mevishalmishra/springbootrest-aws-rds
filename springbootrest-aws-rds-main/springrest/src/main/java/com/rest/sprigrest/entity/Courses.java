package com.rest.sprigrest.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.stereotype.Service;

@Entity(name = "courses")
public class Courses {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String title;
	private String description;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesciption() {
		return description;
	}
	public void setDesciption(String desciption) {
		this.description = desciption;
	}
	public Courses(long id, String title, String desciption) {
	
		Id = id;
		this.title = title;
		this.description = desciption;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Courses [Id=" + Id + ", title=" + title + ", desciption=" + description + "]";
	}
	
	
}
