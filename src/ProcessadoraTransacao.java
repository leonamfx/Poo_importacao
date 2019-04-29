import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.domain.TransacaoImportacao;

public class ProcessadoraTransacao implements ProcessadorLinha<TransacaoImportacao> {

	@Override
	public TransacaoImportacao getLinha(String linha) throws ParseException {
			TransacaoImportacao transacao = new TransacaoImportacao();
				transacao.setNumeroConta(linha.substring(1,8));
				transacao.setNumeroPlastico(linha.substring(8,15).trim());
				transacao.setValorTransacao(new Double(linha.substring(15,27)) / 100d);
				String dataTransacao = linha.substring(27,35);
				SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
				transacao.setDataTransacao(sdf.parse(dataTransacao));
				//String horaTrans = linha.substring(35,41);
				//SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm:ss");
				//transacao.setHoraTransacao(sdf1.parse(horaTrans));
				transacao.setHoraTransacao(linha.substring(35,41));
				transacao.setCodEstabelecimento(new Integer(linha.substring(41,47)));
		        return transacao;
				
    }
		  
}
