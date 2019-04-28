import java.text.ParseException;

import model.domain.PlasticoImportacao;

public class ProcessadoraPlastico implements ProcessadorLinha<PlasticoImportacao> {
    @Override
    public PlasticoImportacao getLinha(String linha,String cabecalho) throws ParseException {
		PlasticoImportacao plastico = new PlasticoImportacao();
		plastico.setNumeroConta(linha.substring(1,8));
		plastico.setNomeInseridoPlastico(linha.substring(8,38).trim());
		plastico.setCpf(linha.substring(38,49));
		plastico.setNumeroPlasticoGerado(linha.substring(49,56));
		return plastico;       
        
    }
}
