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
		 
		 public static int coletarDados(Scanner scan,String[] nomes,double[] pesos,double[] alturas,double[] imcs,int quantidade) {

			if (quantidade >= nomes.length) 
			{
				System.out.println("Capacidade máxima atingida!");
				return quantidade;
			}

			System.out.print("Digite o nome: ");
			String nome = scan.nextLine();

			double peso;

			do {
				System.out.print("Peso em kg: ");
				peso = scan.nextDouble();

				if (peso <= 0 || peso > 500) 
				{
					System.out.println("Informe um peso válido.");
				}
			} while (peso <= 0 || peso > 500);

		double altura;

			do {
				System.out.print("Altura em metros: ");
				altura = scan.nextDouble();

					if (altura <= 0 || altura > 3) {
						System.out.println("Informe uma altura válida.");
					}
			} while (altura <= 0 || altura > 3);

			nomes[quantidade] = nome;
			pesos[quantidade] = peso;
			alturas[quantidade] = altura;
			imcs[quantidade] = peso / (altura*altura);

		System.out.printf("Pessoa cadastrada! IMC: %.2f%n",imcs[quantidade]);
		return quantidade + 1;
	} 
		 
}
