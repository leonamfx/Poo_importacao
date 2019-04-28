package model.domain;

public class PlasticoImportacao implements Lote {

	private String numeroConta;
	private String nomeInseridoPlastico;
	private String cpf;
	private String numeroPlasticoGerado;
	
	@Override
	public String getTipoLote() {
		return "Plastico";
	}
	
	@Override
	public String toString() {
		return "PasticoImportacao [numeroConta=" + numeroConta + ", nomeInseridoPlastico=" 
				+ nomeInseridoPlastico + ", cpf=" + cpf + ", numeroPlasticoGerado=" + numeroPlasticoGerado +"]";
	}
	

	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNomeInseridoPlastico() {
		return nomeInseridoPlastico;
	}
	public void setNomeInseridoPlastico(String nomeInseridoPlastico) {
		this.nomeInseridoPlastico = nomeInseridoPlastico;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumeroPlasticoGerado() {
		return numeroPlasticoGerado;
	}
	public void setNumeroPlasticoGerado(String numeroPlasticoGerado) {
		this.numeroPlasticoGerado = numeroPlasticoGerado;
	}

}
