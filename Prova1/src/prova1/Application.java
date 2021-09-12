package prova1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		Livro livro = new Livro("Os Elementos", "Euclides", "Unesp", 100, -300);
		System.out.println(livro);
		livro.realizaEmprestimo("Waldyr", formato.parse("08/07/2021"));
		System.out.println(livro);
		livro.devolverLivro(formato.parse("10/09/2021"));
		System.out.println(livro);
		
		sc.close();
	}

}
