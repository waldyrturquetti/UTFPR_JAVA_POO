package prova1;

import java.util.Date;

public class Livro {
	
	private String titulo;
	private String autor;
	private String editora;
	private Integer totalPaginas;
	private Integer anoPublicacao;
	private Boolean disponivel;
	private String nomeAlunoEmprestimo;
	private Date dataUltimoEsprestimo;
	
	public Livro(String titulo, String autor, String editora, Integer totalPaginas, Integer anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.totalPaginas = totalPaginas;
		this.anoPublicacao = anoPublicacao;
		this.disponivel = true;
		this.nomeAlunoEmprestimo = null;
		this.dataUltimoEsprestimo = null;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public Integer getTotalPaginas() {
		return totalPaginas;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getNomeAlunoEmprestimo() {
		return nomeAlunoEmprestimo;
	}

	public void setNomeAlunoEmprestimo(String nomeAluno) {
		this.nomeAlunoEmprestimo = nomeAluno;
	}

	public Date getDataUltimoEsprestimo() {
		return dataUltimoEsprestimo;
	}

	public void setDataUltimoEsprestimo(Date dataUltimoEsprestimo) {
		this.dataUltimoEsprestimo = dataUltimoEsprestimo;
	}

	public void realizaEmprestimo(String nome, Date date) {
		
		if (this.disponivel) {
			this.setDisponivel(false);
			this.setNomeAlunoEmprestimo(nome);
			this.setDataUltimoEsprestimo(date);
			
		} else {
			System.out.println("Não é possível realizar o emprestimo, pois o livro não está disponível");
			return;
		}
		
	}
	
	public void devolverLivro(Date dataDevolucao) {
		
		if (!this.disponivel) {
			this.setDisponivel(true);
			this.setNomeAlunoEmprestimo(null);
			
			 Long data1 = this.dataUltimoEsprestimo.getTime() / 86400000L;
			 Long data2 = dataDevolucao.getTime() / 86400000L;
			 int df = data2.intValue() - data1.intValue();  
			 
			if ( df > 7) {
				// O valor da multa é de 2 reais por dia
				float multa = (float) (df - 7) * 2;
				System.out.println("É necessário pagar multa do valor de " + multa );
			} else {
				System.out.println("Não a multas para esse emprestimo");
			}
		} else {
			System.out.println("Esse livro não pode ser devolvido, pois está disponível para emprestimo");
			return;
		}
		
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", totalPaginas="
				+ totalPaginas + ", anoPublicacao=" + anoPublicacao + ", disponivel=" + disponivel
				+ ", nomeAlunoEmprestimo=" + nomeAlunoEmprestimo + ", dataUltimoEsprestimo=" + dataUltimoEsprestimo
				+ "]";
	}
}
