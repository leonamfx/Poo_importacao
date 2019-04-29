import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import model.domain.Lote;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	, InstantiationException, IllegalAccessException, ParseException {
	
		File arquivos[] = Getpath.getGetpath();
		String pathAr = Getpath.getPathArquivo(); 
	    Arrays.sort(arquivos);
	    for (File arquivo : arquivos) {
	            LeituraArquivo LA = new LeituraArquivo();
	            List<String> lista = LA.lerArquivo(pathAr + arquivo.getName());
	            String arquivoName=  LA.getArquivoName();
	            ProcessadoraArquivo processdoraArquivo = new ProcessadoraArquivo(ProcessadoraX.valueOf(arquivoName).getProcessadorLinha()); 
	            System.out.println(processdoraArquivo.processaArquivo(lista));
	            List<Lote> resultado = processdoraArquivo.processaArquivo(lista);
	            System.out.println(resultado);
	    }
	}


}
