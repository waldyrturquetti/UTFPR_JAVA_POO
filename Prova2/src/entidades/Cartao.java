package entidades;

import java.util.ArrayList;
import java.util.List;

public abstract class Cartao {
	
	private Long numCartao;
	private Integer senha;
	private String nomeTitular;
	private Integer valorFatura;
	private Integer valorLimite;
	private Boolean bloqueado;
	private List<Produto> produtos;
	
	public Cartao(Long numCartao, Integer senha, String nomeTitular, Integer valorLimite) {
		this.numCartao = numCartao;
		this.senha = senha;
		this.nomeTitular = nomeTitular;
		this.valorLimite = valorLimite;
		this.valorFatura = 0;
		this.bloqueado = true;
		this.produtos = new ArrayList<Produto>();
	}
	
	public Long getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(Long numCartao) {
		this.numCartao = numCartao;
	}

	public Integer getSenha() {
		return senha;
	}
	
	public void setSenha(Integer senha) {
		this.senha = senha;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Integer getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(Integer valorFatura) {
		this.valorFatura = valorFatura;
	}

	public Integer getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(Integer valorLimite) {
		this.valorLimite = valorLimite;
	}

	public Boolean getBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public void desbloquear(Integer senha) {
		if (this.senha.equals(senha)) {
			this.bloqueado = false;
		} else {
			System.out.println("Senha incorreta\n");
		}
	}
	
	public void bloquear(Integer senha) {
		if (this.senha.equals(senha)) {
			this.bloqueado = true;
		} else {
			System.out.println("Senha incorreta\n");
		}
	}
	
	public void visualizarFatura(Integer senha) {
		if (this.senha.equals(senha)) {
			System.out.println("Nome titular: " + this.nomeTitular);
			System.out.println("Valor da fatura: " + this.valorFatura);
			System.out.println("Valor do limite: " + this.valorLimite);
			System.out.println();
			
		} else {
			System.out.println("Senha incorreta\n");
		}
	}
	
	public void realizarCompra(Integer senha, Produto produto) {
		
		if (this.senha.equals(senha)) {
			
			if(!this.bloqueado) {
				
				if (produto.getValorproduto() <= this.valorLimite) {
					this.valorLimite -= produto.getValorproduto();
					this.valorFatura += produto.getValorproduto();
					this.produtos.add(produto);
					
					System.out.println("Compra realizada com sucesso");
					System.out.println(produto);
				} else {
					System.out.println("Saldo insuficiente, a compra não foi realizada\n");
				}
			} else {
				System.out.println("Cartão Bloqueado\n");
			}
		} else {
			System.out.println("Senha incorreta\n");
		}
	}
	
	
}
