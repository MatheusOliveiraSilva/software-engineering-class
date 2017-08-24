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
		fw.close(); //Ao disparar o método close(); é executado o método flush() automaticamente, mas é possível executar o método flush antes, 
					//...para testar se a escrita está sendo realizada por exemplo
	}
}