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
				scan.nextLine();
			 switch (opcao) {
			 	case 1: quantidade = coletarDados(scan, nomes, pesos, alturas, imcs, quantidade); /* funcionalidade do Desenvolvedor A */ 
			 		break;
			 	case 2: exibirRelatorio(nomes, imcs, quantidade);/* funcionalidade do Desenvolvedor B */ 
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
			imcs[quantidade] = calcularImc(peso, altura);

		System.out.printf("Pessoa cadastrada! IMC: %.2f%n",imcs[quantidade]);
		return quantidade + 1;
	}
	
	public static double calcularImc(double peso, double altura) 
	{
		return peso / (altura * altura);
	}
    
 public static String classificarImc(double imc) {
    if (imc < 18.5) {
        return "Abaixo do peso";
    } else if (imc < 25.0) {
        return "Peso normal";
    } else if (imc < 30.0) {
        return "Sobrepeso";
    } else if (imc < 35.0) {
        return "Obesidade grau I";
    } else if (imc < 40.0) {
        return "Obesidade grau II";
    } else {
        return "Obesidade grau III";
    }
    }
    public static void exibirRelatorio(
        String[] nomes,
        double[] imcs,
        int quantidade) {

            if (quantidade == 0) {
    System.out.println("Nenhuma pessoa cadastrada.");
    return;
}

    int abaixoPeso = 0;
    int pesoNormal = 0;
    int sobrepeso = 0;
    int obesidade1 = 0;
    int obesidade2 = 0;
    int obesidade3 = 0;

    double somaImcs = 0;

    System.out.println("\n--- RELATORIO INDIVIDUAL ---");

    for (int i = 0; i < quantidade; i++) {
        String classificacao = classificarImc(imcs[i]);

        System.out.printf(
            "Nome: %s | IMC: %.2f | Classificacao: %s%n",
            nomes[i],
            imcs[i],
            classificacao
        );

        somaImcs += imcs[i];

        switch (classificacao) {
            case "Abaixo do peso":
                abaixoPeso++;
                break;

            case "Peso normal":
                pesoNormal++;
                break;

            case "Sobrepeso":
                sobrepeso++;
                break;

            case "Obesidade grau I":
                obesidade1++;
                break;

            case "Obesidade grau II":
                obesidade2++;
                break;

            case "Obesidade grau III":
                obesidade3++;
                break;
        }
    }

    double imcMedio = somaImcs / quantidade;

    System.out.println("\n--- PERFIL DO GRUPO ---");
    System.out.println("Abaixo do peso: " + abaixoPeso);
    System.out.println("Peso normal: " + pesoNormal);
    System.out.println("Sobrepeso: " + sobrepeso);
    System.out.println("Obesidade grau I: " + obesidade1);
    System.out.println("Obesidade grau II: " + obesidade2);
    System.out.println("Obesidade grau III: " + obesidade3);
    System.out.printf("IMC medio do grupo: %.2f%n", imcMedio);
}
}