package com.luv2code.service;

import com.luv2code.repository.CourseList;

public class ShowCourseswithTeachers {
	
	public void showCourseswithTeachers() {
		
		System.out.println();
		CourseList list = new CourseList();
		for(int i=0; i<list.getCourseList().size(); i++) {
			System.out.println(list.getCourseList().get(i).getCourseName() + ", " + list.getCourseList().get(i).getTeacherName());
		}
		System.out.println();
		
	}
}
