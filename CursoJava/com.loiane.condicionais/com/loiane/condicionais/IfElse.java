package com.loiane.condicionais;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite uma idade: ");
		int idade = scan.nextInt();
		
		if (idade >=18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		*/
		// if else aninhados
		// exemplo de preços
		
		System.out.println("Digite o valor da camisa: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10 ) {
			System.out.println("Barato");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Pedir desconto");
		}else if (valor >= 15 && valor < 17 ) {
			System.out.println("pesquise mais");
		} else {
			System.out.println("Valor está muito alto");
		}
		
		

	}

}
