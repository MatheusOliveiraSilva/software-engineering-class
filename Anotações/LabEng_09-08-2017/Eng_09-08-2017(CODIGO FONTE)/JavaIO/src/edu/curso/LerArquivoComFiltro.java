package edu.curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoComFiltro {

	public static void main(String[] args) throws IOException{
		File f = new File("C:/users/tecnico/desktop/testing.txt");
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		s =  br.readLine();
		System.out.println( s );
		
		
		br.close();
	}
}
