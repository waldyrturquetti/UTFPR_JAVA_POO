package lista1;

import java.util.Scanner;

public class NotebooksTeste {

	public static void main(String[] args) {

		int NOTAL_NOTEBOOKS = 3; // add essa variável para ficar mais fácil se quiser alterar a quantidade de notebook que vai usar
		
		Scanner entradaTeclado = new Scanner(System.in);

		// Notebooks[] note1 = new Notebooks[3];					      <<<<<<<<<< seu vetor está sendo declarado e iniciado corretamente, porém EM CADA posição do vetor você precisa instanciar um objeto, neste caso, da classe "Notebooks"
		Notebooks[] notes = new Notebooks[NOTAL_NOTEBOOKS]; // alterei o nome do vetor, pq é um vetor de "notes" e não "note1", faz mais sentido, porém é só questão de nomenclatura

		for (int i = 0; i < NOTAL_NOTEBOOKS; i++) {

			notes[i] = new Notebooks(); //     <<<<<<<<<<< Essa é a linha que eu disse ali em cima. Para cada posição do vetor eu atribuo uma nova instância (objeto) da classe "Notebooks".

			// daqui para baixo estava quase tudo correto.. fiz comentários nas linhas que precisei modificar
			
			System.out.println("Informe a marca do notebook " + i + ":");
			notes[i].marca = entradaTeclado.nextLine();
			System.out.println("Informe o modelo do notebook " + i + ":");
			notes[i].modelo = entradaTeclado.nextLine();
			System.out.println("Informe as polegadas " + i + ":");
			notes[i].polegadas = entradaTeclado.nextInt();
			entradaTeclado.nextLine(); // Limpeza do Buffer
			System.out.println("Informe o modelo do processador " + i + ":");
//			notes[i].modelo = entradaTeclado.nextLine();                  <<<<<<<<<< tem um erro de atribuição nesta linha, refiz na linha abaixo. 
			notes[i].modeloProcessador = entradaTeclado.nextLine();
			System.out.println("Informe a quantidade de ram " + i + ":");
			notes[i].qtdMemoriaRam = entradaTeclado.nextFloat();
			System.out.println("Informe a quantidade de armazenamento " + i + ":");
			notes[i].qtdArmazenamento = entradaTeclado.nextFloat();
			entradaTeclado.nextLine(); // Limpeza do Buffer               <<<<<<<<<< precisei add uma limpeza de buffer aqui, pois pela lógica ele volta a pedir uma marca de um novo notebook. 
		}

//		add esse for para imprimir cada notebook do vetor
		for (int i = 0; i < NOTAL_NOTEBOOKS; i++) {

			System.out.println(notes[i]);
		}

		
		
		
//		daqui para baixo o código é seu, não mexi. 	=================================================================	
		
		
		// Notebooks note1 = new Notebooks();

		/*
		 * for(int i=0; i<3; i++) {
		 * System.out.println("Informe a marca do notebook "+i+":"); note1[i].marca =
		 * entradaTeclado.nextLine();
		 * System.out.println("Informe o modelo do notebook "+i+":"); note1[i].modelo =
		 * entradaTeclado.nextLine(); System.out.println("Informe as polegadas "+i+":");
		 * note1[i].polegadas = entradaTeclado.nextInt(); entradaTeclado.nextLine();
		 * //Limpeza do Buffer
		 * System.out.println("Informe o modelo do processador "+i+":"); note1[i].modelo
		 * = entradaTeclado.nextLine();
		 * System.out.println("Informe a quantidade de ram "+i+":");
		 * note1[i].qtdMemoriaRam = entradaTeclado.nextFloat();
		 * System.out.println("Informe a quantidade de armazenamento "+i+":");
		 * note1[i].qtdArmazenamento = entradaTeclado.nextFloat(); }
		 */

		entradaTeclado.close();
	}
}