package fami41;

import java.util.Scanner;

public class totaldpessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);

		int x,idade,total21=0,total50=0;

		System.out.println("\nInforme sua idade: ");
		idade=leia.nextInt();

		while(idade!=-99)
		{
			if(idade<21)
			{
				total21++;
			}
			else if (idade>50)
			{
				total50++;
			}
			else
			{
				System.out.println("Idade inv�lida!");
			}
			System.out.println("\nInforme sua idade: ");
			idade= leia.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 anos � de "+total21);
		System.out.println("\nO total de pessoas com mais de 50 anos � de "+total50);
	}

}
