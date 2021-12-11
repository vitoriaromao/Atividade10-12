package fami41;
import java.util.Scanner;

public class somam {
	Scanner leia = new Scanner (System.in);

	int num, somaNum=0;
	{
	System.out.println("\nEntre com um número: ") ;
		num=leia.nextInt(); 

	do
	{
		somaNum+=num;
		System.out.println("Entre com um número: ");
		num=leia.nextInt();


	}
	while(num!=0);

	System.out.println("A soma dos números informados é de "+somaNum);
}
}