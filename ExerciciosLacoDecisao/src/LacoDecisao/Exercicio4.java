package LacoDecisao;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {
	public static void main(String[] args)
	{
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
		 * Se for par exiba também a raiz quadrada do mesmo; 
		 * se for ímpar exiba o número elevado ao quadrado.*/
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.printf("Escreva um número: ");
		n = ler.nextInt();
		
		if (n%2 == 0)
		{
			System.out.println("O número " + n + " é par e sua raiz quadrada é: " + Math.sqrt(n));
		}
		else if (n%2 != 0)
		{
			System.out.println("O número " + n + " é ímpar e ele elevado ao quadrado é: " + Math.pow(n, 2));
		}
	}
}
