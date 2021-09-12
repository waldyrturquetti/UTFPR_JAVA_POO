package application;

import entities.Locadora;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locadora locadora = new Locadora("Waldyr Locações", "213414234");
		
		locadora.exibirVeiculos();
		
		locadora.realizarLocacao("ERF-1454", "Waldyr", 1, 10);
		System.out.println();
		locadora.exibirVeiculos();
		locadora.devolveCarro("ERF-1454", 12);
	}
}
