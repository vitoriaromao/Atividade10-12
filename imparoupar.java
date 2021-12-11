package fami41;

import java.util.Scanner;

public class imparoupar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
	
		int num=0, x, par=0,imp = 0;
		
		 for (x=1;x<=10;x++)
		 
		 {  System.out.println("Informe o número:");
		 num = leia.nextInt();
		
		 }
		 
		 if (num%2==0)
		 {
			 
			 
			 par++; 
		 }
		 
		 else
		 {
		      imp++;  
		 }

		 System.out.printf("Foram digitados "+par+" numeros pares e " +imp+ " ímpares!");
		  
	}

}
