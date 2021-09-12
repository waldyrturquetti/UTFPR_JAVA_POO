package exception;

public class CarroNaoExistente extends Exception {

	private static final long serialVersionUID = 1L;

	public CarroNaoExistente(String msg) {
		super(msg);
	}
}
