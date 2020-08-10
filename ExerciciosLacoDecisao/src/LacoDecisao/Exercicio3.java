package LacoDecisao;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args)
	{
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
		 * 10-14 infantil
		 * 15-17 juvenil
		 * 18-25 adulto */
		
		Scanner ler = new Scanner(System.in);
		
		int I; // I representa idade
		
		System.out.printf("Entre com a sua idade: ");
		I = ler.nextInt();
		
		if(I < 0)
		{
			System.out.println("Idade invalida");
		}
		else if(I >= 0 && I < 10)
		{
			System.out.println("Não há categoria, espere um tempinho");
		}
		else if(I >= 10 && I <= 14)
		{
			System.out.println("Categoria: Infantil");
		}
		else if(I >= 15 && I <= 17)
		{
			System.out.println("Categoria: Juvenil");
		}
		else if(I >= 18 && I <= 25)
		{
			System.out.println("Categoria: Adulto");
		}
		else if(I >= 25 && I <= 117)
		{
			System.out.println("Idade acima das categorias aqui existêntes");
		}
		else if(I > 177)
		{
			System.out.println("Você é a nova pessoa mais velha do mundo? \nEntre em contato com o Guinness Book!");
		}
	}

}
