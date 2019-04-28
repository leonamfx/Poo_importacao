import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		File arquivos[] = Getpath.getGetpath();
		String pathAr = Getpath.getPathArquivo(); 
	    Arrays.sort(arquivos);
	    for (File arquivo : arquivos) {
	            LeituraArquivo LA = new LeituraArquivo();
	            List<String> lista = LA.lerArquivo(pathAr + arquivo.getName());
	            String arquivoName=  LA.getArquivoName();
	            ProcessadoraArquivo processadora = new ProcessadoraArquivo(ProcessadorInjeta.getProcessadorLinha(arquivoName)); 
	            System.out.println(processadora.processaArquivo(lista));
	    }
	}

	}

}
