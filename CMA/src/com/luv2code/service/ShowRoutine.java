package com.luv2code.service;

import com.luv2code.repository.RoutineList;

public class ShowRoutine {
	
	 public void showRoutine(RoutineList routineList) {
		 
		System.out.println();
		for(int i=0; i<5; i++) {
			if(routineList.getRoutineList()[i].size() > 0) {
				for(int j=0; j<routineList.getRoutineList()[i].size(); j++) {
					System.out.println(routineList.getRoutineList()[i].get(j).getDay() + " " + routineList.getRoutineList()[i].get(j).getHour() + " " + routineList.getRoutineList()[i].get(j).getCourseName());
				}
				
				System.out.println();
				System.out.println();
			}
		}
		
	 }
}
