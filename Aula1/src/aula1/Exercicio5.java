package aula1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor da compra:");
		int valor = sc.nextInt();
		
		Double desconto = (valor >= 50) ? valor*0.1 : valor*0.05;
		System.out.println("O desconto eh:"+ desconto);
		
		sc.close();

	}

}
