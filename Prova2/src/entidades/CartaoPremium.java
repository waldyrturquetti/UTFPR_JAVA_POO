package entidades;

import java.util.List;

public final class CartaoPremium extends Cartao {
	
	private Double pontuacao; 

	public CartaoPremium(Long numCartao, Integer senha, String nomeTitular, Integer valorLimite) {
		super(numCartao, senha, nomeTitular, valorLimite);
		this.pontuacao = 0.0;
	}

	public Double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	@Override
	public void visualizarFatura(Integer senha) {
		if (super.getSenha().equals(senha)) {
			System.out.println("Nome titular: " + super.getNomeTitular());
			System.out.println("Valor da fatura: " + super.getValorFatura());
			System.out.println("Valor do limite: " + super.getValorLimite());
			System.out.println("Pontuação: " + this.pontuacao);
			System.out.println();
		} else {
			System.out.println("Senha incorreta\n");
		}
	}
	
	@Override
	public void realizarCompra(Integer senha, Produto produto) {
		
		if (super.getSenha().equals(senha)) {
			
			if(!super.getBloqueado()) {

				if (produto.getValorproduto() <= super.getValorLimite()) {
				
					super.setValorLimite(super.getValorLimite() - produto.getValorproduto());
					super.setValorFatura(super.getValorFatura() + produto.getValorproduto());
					List<Produto> produtos = super.getProdutos();
					produtos.add(produto);
					super.setProdutos(produtos);
					
					this.pontuacao = (double) produto.getValorproduto() / 5;
					
					System.out.println("A compra realizada com sucesso");
					System.out.println(produto);
					
				} else {
					System.out.println("Saldo insuficiente\n");
				}
			} else {
				System.out.println("Cartão Bloqueado\n");
			}			
		} else {
			System.out.println("Senha incorreta\n");
		}
	} 
	
	
	
	
}
