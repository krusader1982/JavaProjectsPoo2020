package menu;

public class Menu {
	
	public void ImprimirMenu() {
		System.out.println("#### Menu ####");
		System.out.println("1 - Cadastrar Petsitter!");
		System.out.println("2 - Cadastrar cliente");
		System.out.println("3 - Adicionar pet a um cliente");
		System.out.println("4 - Atribuir Petsitter a um cliente");
		System.out.println("5 - Menu de relat�rios");
		System.out.println("0 - Sair");
	}
	
	public void ImprimirRelatorios() {
		System.out.println("#### Menu ####");
		System.out.println("1 - Gerar relat�rio de gen�ro preferido");
		System.out.println("2 - Gerar relat�rio de ra�as mais comuns");
		System.out.println("3 - Voltar para o menu anterior");
		System.out.println("4 - Imprimir todos os clientes e petsitter's");
		System.out.println("5 - Relat�rio de aloca��o dos petsitter's");
		System.out.println("0 - Sair");
	}
}