package de.demmer.dennis;

public class Aufgabe2 {
	
	
	static void countdown(int countdown) {
		
		for(int i = countdown  ; i >= 0 ; i = i - 1 ) {
			System.out.println(i);
		}
	}
	
	
	
	static void reverse(String string) {
		
		char[] rev = string.toCharArray();
		
		for( int i = rev.length-1 ; i >= 0 ; i--) {
			System.out.print(rev[i]);
		}

	}
	
	
	
	
	public static void main(String[] args) {
		
		reverse("Apfelkuchen");
		
		
		
	}
	
	

}
