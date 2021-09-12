package lista1;

import java.util.Scanner;

public class NotebooksTeste {

	public static void main(String[] args) {

		int NOTAL_NOTEBOOKS = 3; // add essa vari�vel para ficar mais f�cil se quiser alterar a quantidade de notebook que vai usar
		
		Scanner entradaTeclado = new Scanner(System.in);

		// Notebooks[] note1 = new Notebooks[3];					      <<<<<<<<<< seu vetor est� sendo declarado e iniciado corretamente, por�m EM CADA posi��o do vetor voc� precisa instanciar um objeto, neste caso, da classe "Notebooks"
		Notebooks[] notes = new Notebooks[NOTAL_NOTEBOOKS]; // alterei o nome do vetor, pq � um vetor de "notes" e n�o "note1", faz mais sentido, por�m � s� quest�o de nomenclatura

		for (int i = 0; i < NOTAL_NOTEBOOKS; i++) {

			notes[i] = new Notebooks(); //     <<<<<<<<<<< Essa � a linha que eu disse ali em cima. Para cada posi��o do vetor eu atribuo uma nova inst�ncia (objeto) da classe "Notebooks".

			// daqui para baixo estava quase tudo correto.. fiz coment�rios nas linhas que precisei modificar
			
			System.out.println("Informe a marca do notebook " + i + ":");
			notes[i].marca = entradaTeclado.nextLine();
			System.out.println("Informe o modelo do notebook " + i + ":");
			notes[i].modelo = entradaTeclado.nextLine();
			System.out.println("Informe as polegadas " + i + ":");
			notes[i].polegadas = entradaTeclado.nextInt();
			entradaTeclado.nextLine(); // Limpeza do Buffer
			System.out.println("Informe o modelo do processador " + i + ":");
//			notes[i].modelo = entradaTeclado.nextLine();                  <<<<<<<<<< tem um erro de atribui��o nesta linha, refiz na linha abaixo. 
			notes[i].modeloProcessador = entradaTeclado.nextLine();
			System.out.println("Informe a quantidade de ram " + i + ":");
			notes[i].qtdMemoriaRam = entradaTeclado.nextFloat();
			System.out.println("Informe a quantidade de armazenamento " + i + ":");
			notes[i].qtdArmazenamento = entradaTeclado.nextFloat();
			entradaTeclado.nextLine(); // Limpeza do Buffer               <<<<<<<<<< precisei add uma limpeza de buffer aqui, pois pela l�gica ele volta a pedir uma marca de um novo notebook. 
		}

//		add esse for para imprimir cada notebook do vetor
		for (int i = 0; i < NOTAL_NOTEBOOKS; i++) {

			System.out.println(notes[i]);
		}

		
		
		
//		daqui para baixo o c�digo � seu, n�o mexi. 	=================================================================	
		
		
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