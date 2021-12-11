package fami41;

import java.util.Scanner;

public class ordemcrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n1=0,n2=0,n3=0 ;
		
 Scanner leia = new Scanner (System.in);
 
 
 System.out.println("\nInforme o primeiro número: ");
 
 
System.out.println("\nInforme o segundo número: ");
 
 n2 = leia.nextInt();
 
 
System.out.println("\nInforme o terceiro número: ");
 
 n3 = leia.nextInt();
 
 if (n1 < n2 && n2 < n3)
 {
	 System.out.printf("Essa é a ordem crescente dos números informados:" +n1+", "+n2+", "+n3);
 }
 
 else if ((n1 < n2 && n3 < n2) && n1 < n3)
 {
	 System.out.printf("Essa é a ordem crescente dos números informados:" +n1+", "+n3+", "+n2);
 }
 else if(n2 < n1 && n1 < n3)
 {
	 System.out.printf("Essa é a ordem crescente dos números informados:" +n2+", "+n1+", "+n3);
 }
 else if(n2 < n1 && n2 < n3)
 {
	 System.out.printf("Essa é a ordem crescente dos números informados:" +n2+", "+n3+", "+n1);
 }
 else if(n3 < n1 && n1 < n2)
 {
	 System.out.printf("Essa é a ordem crescente dos números informados:" +n3+", "+n1+", "+n2); 
 }
 else 
 {
	 System.out.printf("Essa é a ordem crescente dos números informados:" +n3+", "+n2+", "+n1);
 }
	}

}
