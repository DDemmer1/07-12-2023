package de.demmer.dennis;

public class Aufgabe1 {
	
	//main -> STRG + LEERTASTE
	public static void main(String[] args) {
		
		
		int[] iArr = new int[10];
		
		iArr[0] = 0;
		iArr[1] = 1;
		//[...]
		
		//gibt die Länge des Arrays an
		int l = iArr.length;
		
		for( int i = 0 ;  i < iArr.length  ; i = i + 1) {
			
			iArr[i] = i;
			
			
		}
		
		
	}
	

	

}
