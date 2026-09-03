import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

		 String[] nomes = new String[5];
		 double[] pesos = new double[5];
		 double[] alturas = new double[5];
		 double[] imcs = new double[5];

		 int quantidade = 0;

		 int opcao;
		 do {
			 exibirCabecalho(); // <== METODO COMPARTILHADO (ponto de conflito)
			 exibirMenu();
			 opcao = scan.nextInt();
			 switch (opcao) {
			 	case 1: System.out.println("Coleta de dados"); /* funcionalidade do Desenvolvedor A */ 
			 		break;
			 	case 2: System.out.println("Classificação, categoria e relatório");/* funcionalidade do Desenvolvedor B */ 
			 		break;
			 	case 0: System.out.println("Encerrando..."); 
			 		break;
			 default: System.out.println("Opcao invalida!");
			 				}
		 } while (opcao != 0);
		 scan.close();
	}
		 public static void exibirCabecalho() {
			 System.out.println("==============================");
			 System.out.println(" Cálculo do IMC");
			 System.out.println("==============================");
	}
		 public static void exibirMenu() {
			 System.out.println("1 - Coleta de dados.");
			 System.out.println("2 - Classificação, categoria e relatório");
			 System.out.println("0 - Sair");
			 System.out.print("Escolha: ");
	}
		 
		 public static void coletaDados() {
			 
	} 
		 
}
