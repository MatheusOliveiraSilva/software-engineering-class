package edu.curso;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;

public class Servidor {

	public static void main(String[] args) throws IOException{
		System.out.println( "Aplicação servidor iniciada" );
		
		ServerSocket server = new ServerSocket(20000); //O 20000 é o número da porta a ser usada,...
														//...aqui ela está sendo reservada,... 
														//...caso haja outra aplicação utilizando esta porta haverá erro 
		System.out.println( "Servidor iniciado e porta reservada, aguardando conexão..." );
		
		Socket cliente = server.accept(); //accept fica parado enquanto ninguém se conectar na porta, quando alguém utiliza a porta, é estabelecida uma conexão
		System.out.println( "Cliente conectando..." );
		
		OutputStream out = cliente.getOutputStream();
		
		out.write("Ola, bem vindo ao servidor");
		
		System.out.println( "Fim..." );
		server.close();
	}
}
