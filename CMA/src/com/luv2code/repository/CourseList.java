package com.luv2code.repository;

import java.util.ArrayList;
import java.util.List;

import com.luv2code.model.Course;

public class CourseList {
	private List<Course> courseList;
	
	public CourseList() {
		courseList = new ArrayList<>();
		courseList.add(new Course(1, "English Grammar", "John Smith"));
		courseList.add(new Course(2, "Mathematics", "Lara Gilbert"));
		courseList.add(new Course(3, "Physics", "Johanna Kabir"));
		courseList.add(new Course(4, "Chemistry", "Danniel Robertson"));
		courseList.add(new Course(5, "Biology", "Larry Cooper"));
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courselist) {
		this.courseList = courselist;
	}
	
	
}
