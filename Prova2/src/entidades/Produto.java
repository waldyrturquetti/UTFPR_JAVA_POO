package entidades;

import java.util.Date;

public class Produto {
	
	private String nomeProduto;
	private Date dataCompra;
	private Integer valorproduto;
	
	public Produto(String nomeProduto, Date dataCompra, Integer valorproduto) {
		this.nomeProduto = nomeProduto;
		this.dataCompra = dataCompra;
		this.valorproduto = valorproduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Integer getValorproduto() {
		return valorproduto;
	}

	public void setValorproduto(Integer valorproduto) {
		this.valorproduto = valorproduto;
	}

	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", dataCompra=" + dataCompra + ", valorproduto= R$ " + valorproduto
				+ " reais ]\n";
	}
	
	
}
