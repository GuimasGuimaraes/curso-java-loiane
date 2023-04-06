package com.loiane.cursojava.loops;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1; //count ou cont
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while (i <= max) {
			System.out.println("Contando pela " + i + " vez");
			i++;
		}
		
		System.out.println(i);
		
		//do
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		
		} while (i < 11); 
		

	}

}
