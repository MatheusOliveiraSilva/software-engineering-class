package edu.curso.aula2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	private ServerSocket socket;
	private Socket client;
	private InputStreamReader clientReader;
	private OutputStreamWriter clientWriter;

	public Servidor() {
		try {
			System.out.println("Sistema Servidor de Socket");
			socket = new ServerSocket(33000); // o número entre parênteses é a porta
			System.out.println("Servidor iniciado na porta 20000, aguardando conexão...");
			client = socket.accept();
			System.out.println("Cliente conectado...");
			clientReader = new InputStreamReader(client.getInputStream());
			clientWriter = new OutputStreamWriter(client.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void executar() {
		InputStreamReader tecladoReader = new InputStreamReader(System.in);
		while (true) {
			try {
				if(clientReader.ready()) {
					char c = (char) clientReader.read(); // vai ler o que o cliente do socket está mandando. ClientReader retorna um número inteiro, então convertenmos para char para transformar em caractere
					System.out.print(c); // vai mostrar o que foi digitado
				}
				if(tecladoReader.ready()) {
					char c = (char)tecladoReader.read();
					clientWriter.write(c);
					clientWriter.flush();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Servidor srv = new Servidor();
		srv.executar();

	}

}
