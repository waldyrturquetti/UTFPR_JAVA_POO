package exception;

public class CarroNaoAlocado extends Exception {

	private static final long serialVersionUID = 1L;

	public CarroNaoAlocado(String msg) {
		super(msg);
	}
}
