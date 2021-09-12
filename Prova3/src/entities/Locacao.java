package entities;

public class Locacao {
	
	private String placa;
	private String nomeCliente;
	private Integer dataLocalcao;
	private Integer dataDevolucao;
	private boolean finalizado;
		
	public Locacao(String placa, String nomeCliente, Integer dataLocalcao, Integer dataDevolucao) {
		this.placa = placa;
		this.nomeCliente = nomeCliente;
		this.dataLocalcao = dataLocalcao;
		this.dataDevolucao = dataDevolucao;
		this.finalizado = false;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Integer getDataLocalcao() {
		return dataLocalcao;
	}

	public void setDataLocalcao(Integer dataLocalcao) {
		this.dataLocalcao = dataLocalcao;
	}

	public Integer getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Integer dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
}
