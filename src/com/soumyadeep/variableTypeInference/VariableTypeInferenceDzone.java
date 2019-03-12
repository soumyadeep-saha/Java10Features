package com.soumyadeep.variableTypeInference;

import java.util.ArrayList;
import java.util.HashMap;

public class VariableTypeInferenceDzone {

	public static void main(String[] args) {
		
		var list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println(list);
		
		var isValid = true;
		System.out.println(isValid);
		
		if(isValid) {
			System.out.println("valid");
		}
		
		var i = 100;
		i = i+ 10;
		System.out.println(i);
		
		var var  = 10;
		System.out.println(var);
		
		/*
		 * public void var() { System.out.println("valid"); }
		 */
		
		var map = new HashMap<>();
		map.put(list, "1v");
		map.put(1, list);
		//map = list;
		System.out.println(map);
		
		//We cannot use the var on a variable without initializers.
		//var i; 
	
		//Also, var is not allowed in a compound declaration.
		//var i , j =0;
		
		//And we cannot initialize with a null value for var-type variables:
		//var x = null; // invalid
		
	}
}
