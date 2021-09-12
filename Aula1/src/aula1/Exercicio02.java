package aula1;

public class Exercicio02 {

	public static void main(String[] args)
	{
		double a = 1, b = 12, c = -13, x1 = 0, x2 = 0;
		
		x1 = ((-b + Math.sqrt(b*b-(4*a*c))) / 2 * a);
		x2 = ((-b - Math.sqrt(b*b-(4*a*c))) / 2 * a);
		
		System.out.println(x1);
		System.out.println(x2);
		
			
	}
	
}
