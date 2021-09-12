package aula1;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args)
	{
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe tres valores: ");
		int n1 = entradaTeclado.nextInt();
		int n2 = entradaTeclado.nextInt();
		int n3 = entradaTeclado.nextInt();
		
		if((n1 >= n2) && (n2 >= n3))
		{
			System.out.println(n1);
		}
		else if((n2 >= n1) && (n2 >= n3))
		{
			System.out.println(n2);
		}
		else
		{
			System.out.println(n3);
		}
		
		entradaTeclado.close();
	}
	
}
