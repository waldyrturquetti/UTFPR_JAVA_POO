package lista1;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.nome  = "João";
		pessoa1.idade = 25;
		pessoa1.peso = 68.5;
		
		pessoa2.nome  = "Maria";
		pessoa2.idade = 30;
		pessoa2.peso = 55.6;
		
		pessoa3.nome  = "José";
		pessoa3.idade = 32;
		pessoa3.peso = 62.4;
		
		System.out.println("Pessoa 1 - nome:"+pessoa1.nome+" idade:"+pessoa1.idade+" peso:"+pessoa1.peso);
		System.out.println("Pessoa 2 - nome:"+pessoa2.nome+" idade:"+pessoa2.idade+" peso:"+pessoa2.peso);
		System.out.println("Pessoa 3 - nome:"+pessoa3.nome+" idade:"+pessoa3.idade+" peso:"+pessoa3.peso);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		
		System.out.println("------------------------------------------------------");
		
		pessoa1.andar();
		pessoa2.correr();
		pessoa3.falar();
		pessoa1.dormir();
	}
}
