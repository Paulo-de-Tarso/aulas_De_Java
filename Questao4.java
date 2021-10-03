package lista01;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int a ;
		
		nome = ler.next();
		System.out.println("Informe o nome da pessoa:" );
		
		System.out.println("Informe a idade da pessoa : ");
		a = ler.nextInt();
		
		System.out.println(nome + " " + "viveu"+ " " + a*365);
		
		ler.close();
		

	}

}
