package lista1;

import java.util.Scanner;

public class CarroTeste {

	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		System.out.println("Informe o modelo do carro: ");
		carro1.modelo = entradaTeclado.nextLine();
		System.out.println("Informe a marca do carro: ");
		carro1.marca = entradaTeclado.nextLine();
		System.out.println("Informe a cor do carro: ");
		carro1.cor = entradaTeclado.nextLine();
		System.out.println("Informe o ano do carro: ");
		carro1.ano = entradaTeclado.nextInt();
		System.out.println("Informe o renavam do carro: ");
		carro1.renavam = entradaTeclado.nextInt();
		entradaTeclado.nextLine(); //Limpeza do Buffer
		System.out.println("Informe a chassi do carro: ");
		carro1.chassi = entradaTeclado.nextLine();
		System.out.println("Informe a placa do carro: ");
		carro1.placa = entradaTeclado.nextLine();
		
		System.out.println("Informe o modelo do carro: ");
		carro2.modelo = entradaTeclado.nextLine();
		System.out.println("Informe a marca do carro: ");
		carro2.marca = entradaTeclado.nextLine();
		System.out.println("Informe a cor do carro: ");
		carro2.cor = entradaTeclado.nextLine();
		System.out.println("Informe o ano do carro: ");
		carro2.ano = entradaTeclado.nextInt();
		System.out.println("Informe o renavam do carro: ");
		carro2.renavam = entradaTeclado.nextInt();
		entradaTeclado.nextLine(); //Limpeza do Buffer
		System.out.println("Informe a chassi do carro: ");
		carro2.chassi = entradaTeclado.nextLine();
		System.out.println("Informe a placa do carro: ");
		carro2.placa = entradaTeclado.nextLine();
		
		System.out.println("Informe o modelo do carro: ");
		carro3.modelo = entradaTeclado.nextLine();
		System.out.println("Informe a marca do carro: ");
		carro3.marca = entradaTeclado.nextLine();
		System.out.println("Informe a cor do carro: ");
		carro3.cor = entradaTeclado.nextLine();
		System.out.println("Informe o ano do carro: ");
		carro3.ano = entradaTeclado.nextInt();
		System.out.println("Informe o renavam do carro: ");
		carro3.renavam = entradaTeclado.nextInt();
		entradaTeclado.nextLine(); //Limpeza do Buffer
		System.out.println("Informe a chassi do carro: ");
		carro3.chassi = entradaTeclado.nextLine();
		System.out.println("Informe a placa do carro: ");
		carro3.placa = entradaTeclado.nextLine();
		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
		
		entradaTeclado.close();
	}
}
