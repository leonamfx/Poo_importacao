import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraArquivo {

	private String arquivoName;
	
	public BufferedReader abrirArquivo(String arquivo) throws FileNotFoundException {
		File file = new File(arquivo);
		setArquivoName(file.getName());
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		return br;
	}
	
	public List<String> lerArquivo(String arquivo) throws FileNotFoundException,IOException {
		this.arquivoName = arquivo;
		BufferedReader br = abrirArquivo(arquivo);
		List<String> lista = new ArrayList<>();
		while (br.ready()) {
			lista.add(br.readLine());
		}
		return lista;
	}
	
	//Capiturar o nome da Classe + nome do arquivo 
	public String getArquivoName() {
		String[] str= arquivoName.split("_");
        return "ProcClass"+str[0].toString();
	}
	
	public void setArquivoName(String arquivoName) {
		this.arquivoName = arquivoName;
	}
	
//	public static void main(String args[]) throws IOException,FileNotFoundException {
//	String pathArquivo = System.getProperty("user.dir") + "/arquivos/"; //Define path
//	File docs = new File(pathArquivo); //New Doc on path
//	File []arquivos = docs.listFiles();  //Include all docs on array		
//	
//	for (File arquivo : arquivos) {
//		LeituraArquivo la = new LeituraArquivo();
//		//String dir = System.getProperty("user.dir") + "/arquivos/";
//		List<String> lista = la.lerArquivo(pathArquivo+arquivo.getName());
//		System.out.println(lista);
//	}
//}


}
