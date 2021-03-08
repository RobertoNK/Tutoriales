package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class mergeMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction <String, String, String> mappingFunction =(s1,s2)->
		s1.length()>s2.length()? s1: s2;
		
		Map <String,String> myMap = new HashMap<>(); 
		myMap.put("David Beckham","Soccer");
		myMap.put("Michael Jordan","Basketball");
		
		System.out.println("Original HashMap: "+myMap);
		myMap.merge("David Beckham", "Basketball", mappingFunction);
		myMap.merge("Michael Jordan", "Golf", mappingFunction);
		System.out.println("After first merge example");
		System.out.println(myMap);
		
		// --- 
		myMap.put("Tyler Woods", null);
		myMap.merge("Tyler Woods", "Golf", mappingFunction);
		
		System.out.println("After second merge example");
		System.out.println(myMap);
		// ---
		
		BiFunction <String, String, String> mappingFunction_2 =(s1,s2)-> null;
		myMap.merge("Tyler Woods", "Golf", mappingFunction_2);
		myMap.merge("Zlatan", "Soccer", mappingFunction_2);
		
		System.out.println("After third merge example with mappingFunction_2: ");
		System.out.println(myMap);

	}

}
