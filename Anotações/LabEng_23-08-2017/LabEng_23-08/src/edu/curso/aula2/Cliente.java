package edu.curso.aula2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

	private Socket servidor;
	private InputStreamReader serverReader;
	private OutputStreamWriter serverWriter;

	public Cliente() {
		try {
			System.out.println("Sistema Cliente de Socket");
			servidor = new Socket("localhost", 33000); // o número entre parênteses é a porta
			System.out.println("Cliente conectado...");
			serverReader = new InputStreamReader(servidor.getInputStream());
			serverWriter = new OutputStreamWriter(servidor.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void executar() {
		InputStreamReader tecladoReader = new InputStreamReader(System.in);
		while (true) {
			try {
				if(serverReader.ready()) {
					char c = (char) serverReader.read(); // vai ler o que o servere do socket está mandando. serverReader retorna um número inteiro, então convertenmos para char para transformar em caractere
					System.out.print(c); // vai mostrar o que foi digitado
				}
				if(tecladoReader.ready()) {
					char c = (char)tecladoReader.read();
					serverWriter.write(c);
					serverWriter.flush();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Cliente srv = new Cliente();
		srv.executar();

	}

}
