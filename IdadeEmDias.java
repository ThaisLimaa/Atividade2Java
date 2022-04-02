package Exercícios;

import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int IdadeAnos, IdadeMeses, IdadeDias, IdadeTotalDias;
		
		System.out.print("Calculadora de idade em dias\n\n");

		System.out.print("Digite os anos: ");
		IdadeAnos = scan.nextInt();
		
		System.out.print("Digite os meses: ");
		IdadeMeses = scan.nextInt();

		System.out.print("Digite os dias: ");
		IdadeDias = scan.nextInt();


		IdadeTotalDias = IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias;
		
		System.out.print("Idade total em dias = "+IdadeTotalDias+"\n");		
	}

}
