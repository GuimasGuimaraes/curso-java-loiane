package com.loiane.cursojava.loops;

import java.util.Iterator;

public class For {

	public static void main(String[] args) {
		
		for (int i = 5; i > 0; i--) {
			System.out.println("Contando i pela: " + i + " vez");
		}

		for (int i = 0; i <= 5; i++) {
			System.out.println("Contando i pela: " + i + " vez");
		}
		
		
		for (int i = 0, j = 10; i < j ; i++, j--) {
			System.out.println("valor de i " + i + " valor de j " + j );
		}
		
		int count = 0;
		
		for (;count <= 20 ;) {
			System.out.println("valor de count: " + count);
			count += 2;
		}
		
		for (int cont = 0; cont < 10 ; cont += 2) {
			System.out.println("contando: " + cont);
		}
	
		
	}

}
