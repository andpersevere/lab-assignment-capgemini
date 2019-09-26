package com.cg.labnine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ExerciseOne {
	public List<Integer> sortMapToList(Map<Integer, Integer> map){
		List<Integer> list = new ArrayList<Integer>(map.values());
		Collections.sort(list);
		return list;
	}
}
