package edu.curso;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class GravarArquivo {
	public static void main(String args[]) throws IOException {
		File f = new File("C:/users/tecnico/desktop/testing.txt");
		FileWriter fw  = new FileWriter(f);
		fw.write("hello");
		fw.flush();
		fw.close(); //Ao disparar o m�todo close(); � executado o m�todo flush() automaticamente, mas � poss�vel executar o m�todo flush antes, 
					//...para testar se a escrita est� sendo realizada por exemplo
	}
}