import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        do {
            exibirCabecalho(); // <== METODO COMPARTILHADO (ponto de conflito)
            exibirMenu();
            opcao = scan.nextInt();
            switch (opcao) {
                case 1: /* funcionalidade do Desenvolvedor A */ break;
                case 2: /* funcionalidade do Desenvolvedor B */ break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
        scan.close();
    }
    
 public static void exibirCabecalho() {
    System.out.println("================================");
    System.out.println("   RELATÓRIO DE AVALIAÇÃO IMC");
    System.out.println("================================");
}
 public static void exibirMenu() {
    System.out.println("1 - Cadastrar pessoa");
    System.out.println("2 - Exibir Relatório");
    System.out.println("0 - Sair");
    System.out.print("Escolha: ");
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

    int abaixoPeso = 0;
    int pesoNormal = 0;
    int sobrepeso = 0;
    int obesidade1 = 0;
    int obesidade2 = 0;
    int obesidade3 = 0;

    System.out.println("\n--- RELATORIO INDIVIDUAL ---");

    for (int i = 0; i < quantidade; i++) {
        String classificacao = classificarImc(imcs[i]);

        System.out.printf(
            "Nome: %s | IMC: %.2f | Classificacao: %s%n",
            nomes[i],
            imcs[i],
            classificacao
        );

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

    System.out.println("\n--- CONTAGEM POR CATEGORIA ---");
    System.out.println("Abaixo do peso: " + abaixoPeso);
    System.out.println("Peso normal: " + pesoNormal);
    System.out.println("Sobrepeso: " + sobrepeso);
    System.out.println("Obesidade grau I: " + obesidade1);
    System.out.println("Obesidade grau II: " + obesidade2);
    System.out.println("Obesidade grau III: " + obesidade3);
}
}