package edu.curso;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;

public class Servidor {

	public static void main(String[] args) throws IOException{
		System.out.println( "Aplica��o servidor iniciada" );
		
		ServerSocket server = new ServerSocket(20000); //O 20000 � o n�mero da porta a ser usada,...
														//...aqui ela est� sendo reservada,... 
														//...caso haja outra aplica��o utilizando esta porta haver� erro 
		System.out.println( "Servidor iniciado e porta reservada, aguardando conex�o..." );
		
		Socket cliente = server.accept(); //accept fica parado enquanto ningu�m se conectar na porta, quando algu�m utiliza a porta, � estabelecida uma conex�o
		System.out.println( "Cliente conectando..." );
		
		OutputStream out = cliente.getOutputStream();
		
		out.write("Ola, bem vindo ao servidor");
		
		System.out.println( "Fim..." );
		server.close();
	}
}
