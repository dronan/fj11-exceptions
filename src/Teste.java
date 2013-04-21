import java.io.FileNotFoundException;

public class Teste {
	public static void metodo() {
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		Teste teste = new Teste();
		teste.metodo();
	}
}
