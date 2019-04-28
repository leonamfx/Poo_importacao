import java.io.File;

public class Getpath {
	// Create static this variables belongs to the class, not any particular object of that class
	private static String pathArquivo;
	private static File docs;
	private static File arquivos[];
	
			
	public static File[] getGetpath() {
		pathArquivo = System.getProperty("user.dir") + "/arquivos/"; //Define path
		docs = new File(pathArquivo); //New Doc on path
		arquivos = docs.listFiles();  //Include all docs on array		
		return arquivos;
		
	}


	public static String getPathArquivo() {
		return pathArquivo;
	}

	public static void setPathArquivo(String pathArquivo) {
		Getpath.pathArquivo = pathArquivo;
	}

	public static File getDocs() {
		return docs;
	}

	public static void setDocs(File docs) {
		Getpath.docs = docs;
	}

	public static File[] getArquivos() {
		return arquivos;
	}

	public static void setArquivos(File[] arquivos) {
		Getpath.arquivos = arquivos;
	}
}
