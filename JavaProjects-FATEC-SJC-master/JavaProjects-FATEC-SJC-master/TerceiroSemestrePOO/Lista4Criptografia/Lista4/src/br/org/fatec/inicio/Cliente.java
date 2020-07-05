package br.org.fatec.inicio;

import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
 
	// socket para comunica��o com o servidor.
	private Socket encaixeCliente;
	public Cliente(String ip, int porta) throws Exception {
		// ip do servidor e a porta onde o servidor est� escutando
		encaixeCliente = new Socket(ip, porta);
	}
	
	public void enviar(String texto) throws Exception {
		// canal de saida (bin�rio) para escrever para o servidor
		PrintWriter escritor = new PrintWriter(encaixeCliente.getOutputStream());
		escritor.write(texto);
		escritor.close();
	}
	
	/**
	    * Metodo que criptografa um texto,
	    * utilizando a cifra de Cesar.
	    */
	   public static String encriptar(int chave, String texto){
	      // Variavel que ira guardar o texto crifrado
	      StringBuilder textoCifrado = new StringBuilder();
	      // Variavel com tamanho do texto a ser encriptado
	      int tamanhoTexto = texto.length();
	      
	      // Criptografa cada caracter por vez 
	      for(int c=0; c < tamanhoTexto; c++){
	         // Transforma o caracter em codigo ASCII e faz a criptografia
	         int letraCifradaASCII = ((int) texto.charAt(c)) + chave;
	         
	         // Verifica se o codigo ASCII esta no limite dos caracteres imprimiveis
	         while(letraCifradaASCII > 126)
	            letraCifradaASCII -= 94;

	         // Transforma codigo ASCII criptografado em caracter ao novo texto
	         textoCifrado.append( (char)letraCifradaASCII );
	      }
	      
	      // Por fim retorna a mensagem criptografada por completo
	      return textoCifrado.toString();
	   }

	   /**
	    * Metodo que descriptografa um texto,
	    * utilizando a cifra de Cesar.
	    */
	   public static String decriptar(int chave, String textoCifrado){
	      // Variavel que ira guardar o texto decifrado
	      StringBuilder texto = new StringBuilder();
	      // Variavel com tamanho do texto a ser decriptado
	      int tamanhoTexto = textoCifrado.length();
	      
	      // Descriptografa cada caracter por vez
	      for(int c=0; c < tamanhoTexto; c++){
	         // Transforma o caracter em codigo ASCII e faz a descriptografia
	         int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - chave;
	         
	         // Verifica se o codigo ASCII esta no limite dos caracteres imprimiveis
	         while(letraDecifradaASCII < 32)
	            letraDecifradaASCII += 94;

	         // Transforma codigo ASCII descriptografado em caracter ao novo texto
	         texto.append( (char)letraDecifradaASCII );
	      }
	      
	      // Por fim retorna a mensagem descriptografada por completo
	      return texto.toString();
	   }
	   	
}