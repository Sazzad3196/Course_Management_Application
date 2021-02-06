package com.luv2code.repository;

import java.util.ArrayList;
import java.util.List;

import com.luv2code.model.Routine;

public class RoutineList {
	private List<Routine> routineList[] = new ArrayList[5];
	
	public RoutineList() {
		for(int i=0; i<5; i++) {
			routineList[i] = new ArrayList<>();
		}
	}

	public List<Routine>[] getRoutineList() {
		return routineList;
	}

	public void setRoutineList(List<Routine>[] routineList) {
		this.routineList = routineList;
	}
	
}
