package entities;

import java.util.ArrayList;
import java.util.List;

import exception.CarroIndisponivel;
import exception.CarroNaoAlocado;
import exception.CarroNaoExistente;

public class Locadora {
	
	private String razaoSocial;
	private String cnpj;
	private Carro[] carros = new Carro[4];
	private List<Locacao> locacaos;
	
	public Locadora(String razaoSocial, String cnpj) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.locacaos = new ArrayList<Locacao>();
		
		this.carros[0] = new Carro("Civic", "Honda", "ABC-1234", 200);
		this.carros[1] = new Carro("Toyota", "Corola", "DFV-5456", 200);
		this.carros[2] = new Carro("BMW", "X1", "ERF-1454", 400);
		this.carros[3] = new Carro("Ford", "KA", "SDF-6547", 150);
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Carro[] getCarros() {
		return carros;
	}

	public List<Locacao> getLocacaos() {
		return locacaos;
	}

	public void setLocacaos(List<Locacao> locacaos) {
		this.locacaos = locacaos;
	}
	
	public Carro buscaCarro(String placa) {		
		try {
			for (Carro carro : this.carros) {
				if (carro.getPlaca().equals(placa)) {
					return carro;
				} 
			}		
			
			throw new CarroNaoExistente("Carro Não existente");
		} catch (CarroNaoExistente msg) {
			System.out.println(msg.getMessage());
		}
		return null;
	}
	
	public void exibirVeiculos() {
		for (Carro carro : this.carros) {
			System.out.println(carro.toString());
		}
	}

	public void realizarLocacao(String placa, String nomeCliente, Integer diaLocacao, Integer diaPrevisaoDevolucao) {
		try {
			Carro carro = buscaCarro(placa);
			if (carro != null) {
				if (carro.getLocacao() == null) {
					Locacao locacao = new Locacao(placa, nomeCliente, diaLocacao, diaPrevisaoDevolucao);
					this.locacaos.add(locacao);
					carro.setLocacao(locacao);
				} else {
					throw new CarroIndisponivel("Carro Indisponível");
				}
			}
		} catch (CarroIndisponivel carroIndisponivel) {
			System.out.println(carroIndisponivel.getMessage());
		}
	}
	
	public void devolveCarro(String placa, Integer diaDevolocao) {
		try {
			Carro carro = buscaCarro(placa);
			if(carro != null) {
				if (carro.getLocacao() != null) {
					Integer total;
					Locacao locacao = carro.getLocacao();
					if (locacao.getDataDevolucao() >= diaDevolocao) {
						total = (diaDevolocao - locacao.getDataLocalcao()) * carro.getValorDiaria();
						System.out.println("O total a se pagar da Locação: " + total);
					} else {
						total = (locacao.getDataDevolucao() - locacao.getDataLocalcao()) * carro.getValorDiaria();
						total += (diaDevolocao - locacao.getDataDevolucao()) * carro.getValorDiaria() * 2;
						System.out.println("O total a se pagar da locação com multa eh: " + total);
					}
					carro.setLocacao(null);
				} else {
					throw new CarroNaoAlocado("Carro não está em locação");
				}
			}
		} catch (CarroNaoAlocado carroNaoAlocado) {
			System.out.println(carroNaoAlocado.getMessage());
		}
	}
	
	
	
	
}
