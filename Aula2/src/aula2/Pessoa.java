package aula2;

public class Pessoa {
	
	String nome;
	int idade;
	double peso;
	
	public void andar() {
		
		System.out.println(nome+" est� andando.");
	}
	
	public void correr() {
		
		System.out.println(nome+" est� correndo.");
	}
	
	public void falar() {
		
		System.out.println(nome+" est� falando.");
	}
	
	public void dormir() {
		
		System.out.println(nome+" est� dormindo.");
	}
	
	public String toString() {
		
		return "Nome: "+nome+ "\n"+
				"tem a idade: "+idade+" anos\n"+
				"e pesa: "+peso+" Kg.";
	}
}
