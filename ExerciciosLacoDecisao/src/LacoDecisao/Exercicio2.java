package LacoDecisao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args)
	{
		/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente*/
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.printf("Entre com o primeiro valor: ");
		a = ler.nextInt();
		System.out.printf("Entre com o segundo valor: ");
		b = ler.nextInt();
		System.out.printf("Entre com o terceiro valor: ");
		c = ler.nextInt();
		
		if(a <= b && a <= c)
		{
			if(b <= c)
			{
				System.out.println("A ordem crescente dos valores �: " + a + ", " + b + ", " + c);
			}
			else if(b >= c)
			{
				System.out.println("A ordem crescente dos valores �: " + a + ", " + c + ", " + b);
			}
		}
		else if(b <= a && b <= c)
		{
			if(a <= c)
			{
				System.out.println("A ordem crescente dos valores �: " + b + ", " + a + ", " + c);
			}
			else if(a >= c)
			{
				System.out.println("A ordem crescente dos valores �: " + b + ", " + c + ", " + a);
			}
		}
		else if(c <= a && c <= b)
		{
			if(a <= b)
			{
				System.out.println("A ordem crescente dos valores �: " + c + ", " + a + ", " + b);
			}
			else if(a >= b)
			{
				System.out.println("A ordem crescente dos valores �: " + c + ", " + b + ", " + a);
			}
		}
	}

}
