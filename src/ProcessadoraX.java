
public enum ProcessadoraX {
	
	ProcClassCliente(new ProcessadoraCliente()),
	ProcClassConta(new ProcessadoraConta()),
	ProcClassPlastico(new ProcessadoraPlastico()),
	ProcClassTransacao(new ProcessadoraTransacao());
	
	private ProcessadorLinha processaLinha;
	
	private ProcessadoraX(ProcessadorLinha processaLinha) {
		this.processaLinha = processaLinha;

	}
	
	public ProcessadorLinha getProcessadorLinha() {
		return processaLinha;
	}
}
