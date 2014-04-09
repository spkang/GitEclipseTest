package test;

import java.util.ArrayList;
import java.util.List;


public class test {
	public void testOne (String sentence ) {
		System.out.println ("the input is " + sentence);
		sentence = sentence.substring(0, sentence.length() - 2);
		System.out.println ("the output is " + sentence);
	}
	
	public void testTwo (List<String> obj) {
		if (obj == null )
			return ;
		if (!obj.isEmpty() ) {
			//obj.remove(0);
			System.out.println("remove 0");
		}
		else {
			obj.add("haha test Two add");
			obj.add("one");
		}
	}
	
	public static void main (String [] args) {
//		System.out.println("Hello world!");
//		System.out.println ("Hello GitHub");
//		test t = new test();
//		String sentence = "It looks good!";
//		t.testOne(sentence);
//		System.out.println("out : " + sentence);
		
		
		List<String> objList = new ArrayList<String>();
		
		test t  = new test();
		
		t.testTwo(objList);
		
		System.out.println("list : " + objList.toString());
		
		t.testTwo(objList);
		
		System.out.println("list : " + objList.toString());
		
	}
}
