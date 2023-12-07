package de.demmer.dennis;

public class Wiederholung {
	
	static void testMethode() {
		System.out.println("Testmethode");
	}
	
	

	public static void main(String[] args) {

		int i = 5;

		int y = i + 2;

		String test = "Test String";
		
		testMethode();

		System.out.println(test);
		
		//        0       1      2        3       4
		//   |   'T'  |       |       |       |        |
		char[] cArr = new char[5];
		
		cArr[0] = 'T';
		System.out.println(cArr[0]);
		
		System.out.println(cArr.length);
		
		//for -> STRG + Leertaste -> 2. Option
		for (int j = 0; j < cArr.length; j++) {
			
		}

	}

}
