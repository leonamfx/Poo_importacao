package model.domain;

import java.util.Date;

public class TransacaoImportacao implements Lote {

	private String numeroConta;
	private String numeroPlastico;
	private double valorTransacao;
	private Date dataTransacao;
	private String horaTransacao;
	private int codEstabelecimento;
		
	@Override
	public String getTipoLote() {
		return "Transacao";
	}
	
	@Override
	public String toString() {
		return "TransacaoImportacao [numeroConta=" + numeroConta
				+ ", numeroPlastico=" + numeroPlastico + ", valorTransacao=" + valorTransacao + ", dataTransacao=" + dataTransacao 
				+ ", horaTransacao=" + horaTransacao + ", codEstabelecimento=" + codEstabelecimento +"]";
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNumeroPlastico() {
		return numeroPlastico;
	}

	public void setNumeroPlastico(String numeroPlastico) {
		this.numeroPlastico = numeroPlastico;
	}

	public double getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(double valorTransacao) {
		this.valorTransacao = valorTransacao;
	}

	public Date getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public String getHoraTransacao() {
		return horaTransacao;
	}

	public void setHoraTransacao(String horaTransacao) {
		this.horaTransacao = horaTransacao;
	}

	public int getCodEstabelecimento() {
		return codEstabelecimento;
	}

	public void setCodEstabelecimento(int codEstabelecimento) {
		this.codEstabelecimento = codEstabelecimento;
	}



	

}
