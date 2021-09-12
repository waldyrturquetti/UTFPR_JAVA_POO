package entities;

public class Carro {
	
	private String modelo;
	private String marca;
	private String placa;
	private Integer valorDiaria;
	private Locacao locacao;
	
	public Carro(String modelo, String marca, String placa, Integer valorDiaria) {
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.valorDiaria = valorDiaria;
		this.locacao = null;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Integer valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public Locacao getLocacao() {
		return locacao;
	}

	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}

	@Override
	public String toString() {
		if (this.locacao != null)
			return "Carro [modelo=" + modelo + ", marca=" + marca + ", placa=" + placa + ", valorDiaria=" + valorDiaria
				+ ", locacao= Carro alocado para " + locacao.getNomeCliente() + 
						" data prevista para estar disponível eh " + locacao.getDataDevolucao()  + " ]";
		else 
			return "Carro [modelo=" + modelo + ", marca=" + marca + ", placa=" + placa + ", valorDiaria=" + valorDiaria
					+ ", locacao= Disponível ]";
			
	}
}
