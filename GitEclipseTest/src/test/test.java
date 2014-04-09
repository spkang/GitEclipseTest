package test;

public class test {
	public void testOne (String sentence ) {
		System.out.println ("the input is " + sentence);
		sentence = sentence.substring(0, sentence.length() - 2);
		System.out.println ("the output is " + sentence);
	}
	
	public static void main (String [] args) {
		System.out.println("Hello world!");
		System.out.println ("Hello GitHub");
		test t = new test();
		String sentence = "It looks good!";
		t.testOne(sentence);
		System.out.println("out : " + sentence);
	}
}
