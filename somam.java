package fami41;
import java.util.Scanner;

public class somam {
	Scanner leia = new Scanner (System.in);

	int num, somaNum=0;
	{
	System.out.println("\nEntre com um n�mero: ") ;
		num=leia.nextInt(); 

	do
	{
		somaNum+=num;
		System.out.println("Entre com um n�mero: ");
		num=leia.nextInt();


	}
	while(num!=0);

	System.out.println("A soma dos n�meros informados � de "+somaNum);
}
}