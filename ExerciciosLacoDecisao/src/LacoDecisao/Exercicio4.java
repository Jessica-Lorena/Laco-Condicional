package LacoDecisao;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {
	public static void main(String[] args)
	{
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
		 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
		 * se for �mpar exiba o n�mero elevado ao quadrado.*/
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.printf("Escreva um n�mero: ");
		n = ler.nextInt();
		
		if (n%2 == 0)
		{
			System.out.println("O n�mero " + n + " � par e sua raiz quadrada �: " + Math.sqrt(n));
		}
		else if (n%2 != 0)
		{
			System.out.println("O n�mero " + n + " � �mpar e ele elevado ao quadrado �: " + Math.pow(n, 2));
		}
	}
}
