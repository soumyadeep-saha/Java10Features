package com.soumyadeep.creatingUnmodifiableCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CreatingUnmodifiableCollections {

	public static void main(String[] args) {

		var list = new ArrayList<>();
		list.add("l1");
		list.add("l2");
		list.add("l3");
		list.add("l4");
		var list1 = List.copyOf(list);
		System.out.println(list);
		// list1.add("l5");

		var set = new HashSet<>();
		set.add("s1");
		set.add("s2");
		set.add("s3");
		set.add("s4");
		var set1 = Set.copyOf(set);
		System.out.println(set);
		// set1.add("s5");

		var map = new HashMap<>();
		map.put(1, "s1");
		map.put(2, "s2");
		map.put(3, "s3");
		map.put(4, "s4");
		var map1 = Map.copyOf(map);
		System.out.println(map);
		// map1.put(5,"s5");

	}
}
