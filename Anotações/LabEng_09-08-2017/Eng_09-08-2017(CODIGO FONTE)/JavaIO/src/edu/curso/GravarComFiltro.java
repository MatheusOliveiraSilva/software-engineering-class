package edu.curso;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GravarComFiltro {
	
	public static void main(String[] args) throws IOException{
		File f = new File("C:/users/tecnico/desktop/testing.txt");
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append("texto 1");
		bw.append("\ntexto 2");
		bw.append("\ntexto 3");
		
		bw.flush();
		bw.close();
		
	}

}
