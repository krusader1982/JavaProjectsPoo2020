package br.com.utilities;

public class Menu {
	public void printMainMenu() {
		System.out.println("#### Menu ####");
		System.out.println("1 - Quero me cadastrar!");
		System.out.println("2 - Logar no sistema");
		System.out.println("0 - Sair");
	}
	
	public void printAuthenticatedMenu() {
		System.out.println("#### Menu ####");
		System.out.println("1 - Cadastrar entradas e sa�das do caixa");
		System.out.println("2 - Gerar relat�rio");
		System.out.println("0 - Sair");
	}
}