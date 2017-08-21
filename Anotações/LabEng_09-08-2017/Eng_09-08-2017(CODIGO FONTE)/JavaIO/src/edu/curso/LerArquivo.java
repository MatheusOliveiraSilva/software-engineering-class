package edu.curso;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

	public static void main(String[] args) throws IOException {
		File f = new File("C:/users/tecnico/desktop/testing.txt");

		System.out.println("Exist this archive?" + f.exists());
		System.out.println("Is this a directory?" + f.isDirectory());
		System.out.println("Can we read itw?" + f.canRead());
		System.out.println("Can we write it?" + f.canWrite());
		System.out.println("");

		FileReader fr = new FileReader(f);

		int i = 0;
		/*
		 * while( i != -1) {
		 * 
		 * i = fr.read(); 
		 * if(i != -1) {
		 * 	 System.out.print( (char)i );
			}
		 	}
		 */
		/* ao terminar o loop acima ele exibe um ponto de interrogação, pois
		 recebe o -1, por isso foi adicionado o if( i != -1), a forma abaixo é mais inteligível 
		de se codificar */
		
		while((i = fr.read()) != -1) {
			 System.out.print( (char)i );
		}

		fr.close();
	}
}
