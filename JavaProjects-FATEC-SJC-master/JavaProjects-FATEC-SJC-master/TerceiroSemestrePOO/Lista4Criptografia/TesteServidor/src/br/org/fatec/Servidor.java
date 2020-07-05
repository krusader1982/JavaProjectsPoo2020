package br.org.fatec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	// socket - encaixe, plugue
	private ServerSocket encaixeServidor;

	public Servidor(int porta) throws Exception {
		System.out.println("Iniciando o servidor...");
		// todo servidor "escuta" em uma porta
		encaixeServidor = new ServerSocket(porta);
	}

	public void escutar() throws Exception {
		while (true) { // o correto seria usar thread
			// aceito a conex�o do cliente em um socket
			Socket conexaoCliente = encaixeServidor.accept();
			// canal de fluxo de dados (o canal bin�rio)
			InputStreamReader leitorBinario = 
					new InputStreamReader(conexaoCliente.getInputStream());
			// transformando o canal bin�rio para um leitor de texto
			BufferedReader buffer = new BufferedReader(leitorBinario);
			String texto = buffer.readLine();
			System.out.println("Informa��o enviada no servidor: " + texto);
			buffer.close();
		}
	}
}