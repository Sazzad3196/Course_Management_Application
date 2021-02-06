package com.luv2code.service;

import java.util.List;
import java.util.Scanner;

import com.luv2code.model.Course;
import com.luv2code.model.Routine;
import com.luv2code.repository.CourseList;
import com.luv2code.repository.RoutineList;

public class CreateRoutine {
	
	public RoutineList createRoutine(Scanner s) {
		
		System.out.println();
		CourseList courseList = new CourseList();
		RoutineList routineList = new RoutineList();
		
		for(Course course : courseList.getCourseList()) {
			System.out.println(course.getId() + ". " + course.getCourseName());
		}
		
		System.out.println();
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				// i and j means Day and Hour
				System.out.print(i + " " + j);
				
				Course course = courseList.getCourseList().get(s.nextInt());
				routineList.getRoutineList()[i].add(new Routine(1, i, j, course.getCourseName()));
			}
			System.out.println();
		}
		
		return routineList;
	}
}
