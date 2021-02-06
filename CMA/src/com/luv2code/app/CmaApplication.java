package com.luv2code.app;
import java.util.Scanner;

import com.luv2code.repository.RoutineList;
import com.luv2code.service.CreateRoutine;
import com.luv2code.service.ShowCourseswithTeachers;
import com.luv2code.service.ShowRoutine;


public class CmaApplication {

	public static void main(String[] args) {
		
		RoutineList routineList = new RoutineList();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("A. " + "Create Routine");
			System.out.println("B. " + "Show Routine");
			System.out.println("C. " + "List Courses with Teachers Name");
			
			System.out.println();
			System.out.print("Enter key: ");
			char ch = s.next().charAt(0);
			
			
			if(Character.toUpperCase(ch) == 'A') {
				
				CreateRoutine createRoutine = new CreateRoutine();
				routineList = createRoutine.createRoutine(s);
				
			} 
			
			else if(Character.toUpperCase(ch) == 'B') {
				
				ShowRoutine showRoutine = new ShowRoutine();
				showRoutine.showRoutine(routineList);
				
			}
			
			else if(Character.toUpperCase(ch) == 'C') {
				
				ShowCourseswithTeachers showCourseswithTeachers = new ShowCourseswithTeachers();
				showCourseswithTeachers.showCourseswithTeachers();
				
			}
		}

	}

}
