package lista01;

import java.util.Scanner;

public class Quetao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a , b;
		
		System.out.println("digite o numero de eleitores do municipio:");
		a = teclado.nextInt();
		System.out.println("Quantos eleitores votaram?");
		b= teclado.nextInt();
		
		System.out.println("O numero total de eleitores e: " + (a+b));
		//System.out.println("O numerto de eleitores que nao votaram e:" + c);		
	}

}
