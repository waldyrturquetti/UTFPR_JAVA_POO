package app;

import java.util.Date;

import entidades.Cartao;
import entidades.CartaoComum;
import entidades.CartaoPremium;
import entidades.Produto;

public class Application {

	public static void main(String[] args) {
		
		Cartao cartaoComum = new CartaoComum(1111L, 1234, "Waldyr", 1000);
		cartaoComum.desbloquear(1234);
		cartaoComum.visualizarFatura(1234);
		
		Cartao cartaoPremium = new CartaoPremium(2222L, 4321, "WaldyrZão", 10000);
		cartaoPremium.desbloquear(4321);
		cartaoPremium.visualizarFatura(4321);
		
		Produto prod1 = new Produto("Mac", new Date(), 50);
		Produto prod2 = new Produto("Notbook", new Date(), 6000);
		Produto prod3 = new Produto("Camisa", new Date(), 100);
//		Produto prod4 = new Produto("Celular", new Date(), 2000);
//		Produto prod5 = new Produto("Cigarro", new Date(), 30);
//		Produto prod6 = new Produto("Gasolina", new Date(), 200);
		
		cartaoComum.realizarCompra(1234, prod1);
		cartaoComum.visualizarFatura(1234);
		cartaoComum.realizarCompra(1234, prod2);
		cartaoComum.visualizarFatura(1234);
		
		cartaoPremium.realizarCompra(4321, prod2);
		cartaoPremium.visualizarFatura(4321);
		
		cartaoPremium.realizarCompra(431, prod3);
		cartaoPremium.bloquear(4321);
		cartaoPremium.realizarCompra(4321, prod3);
	}

}
