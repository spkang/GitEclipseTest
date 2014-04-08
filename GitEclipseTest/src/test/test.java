package test;

public class test {
	public void testOne (String sentence ) {
		System.out.println ("the input is " + sentence);
		
	}
	
	public static void main (String [] args) {
		System.out.println("Hello world!");
		System.out.println ("Hello GitHub");
		test t = new test();
		t.testOne("It looks good!");
	}
}
