package aula1;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args)
	{
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome completo: ");
		String nome = entradaTeclado.nextLine();
		System.out.println("Informe seu sexo: ");
		String sexo = entradaTeclado.nextLine();
		System.out.println("Informe seu Estado Civil: ");
		String estado = entradaTeclado.nextLine();
		System.out.println("Quantidade de Filhos: ");
		int nfilhos = entradaTeclado.nextInt();
		System.out.println("Informe sua escolaridade: ");
		entradaTeclado.nextLine(); //Limpeza do Buffer
		String escolaridade = entradaTeclado.nextLine();
		System.out.println("Informe sua renda mensal: ");
		double renda = entradaTeclado.nextDouble();
				
		System.out.println("Ola, " + nome + "\nSeu sexo e: " + sexo + "\nEstado Civil: " + estado + "\nQuantidade de filhos: " + nfilhos + "\nSua escolaridade: " + escolaridade + "\nSua renda e: " + renda);
	
		entradaTeclado.close();
	}
	
}
