package lambda;

import java.time.LocalDate;
import java.util.Comparator;

public class Candidato implements Comparable<Candidato>{

	private String conceito;
	private Integer anoDeNascimento;
	private Double rendaMensal;
	private LocalDate dataDeNascimento;
	
	public Candidato() {}
	
	public Candidato(String conceito,Integer anoDeNascimento) {
		this.conceito=conceito;
		this.anoDeNascimento=anoDeNascimento;
	}
	
	public Candidato(String conceito,Integer anoDeNascimento,Double rendaMensal) {
		this.conceito=conceito;
		this.anoDeNascimento=anoDeNascimento;
		this.rendaMensal=rendaMensal;
	}
	public Candidato(String conceito,Integer anoDeNascimento,Double rendaMensal,String data) {
		this.conceito=conceito;
		this.anoDeNascimento=anoDeNascimento;
		this.rendaMensal=rendaMensal;
		this.dataDeNascimento=LocalDate.parse(data);
	}
	public String getConceito() {
		return conceito;
	}
	public void setConceito(String conceito) {
		this.conceito = conceito;
	}
	public Integer getAnoDeNascimento() {
		return anoDeNascimento;
	}
	public void setAnoDeNascimento(Integer anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Double getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(Double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	@Override
	public int compareTo(Candidato other) {
		if(!this.conceito.toLowerCase().equals(other.conceito.toLowerCase())) {
			return this.conceito.compareTo(other.conceito);
		}
		return this.anoDeNascimento.compareTo(other.anoDeNascimento);
	}

	@Override
	public String toString() {
		return "Candidato [conceito=" + conceito + ", anoDeNascimento=" + anoDeNascimento + "]";
	}

}
