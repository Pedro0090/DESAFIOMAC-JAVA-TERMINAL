package javamectermnial.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        int idadePessoa1;
        int idadePessoa2;
        int diferencaCalculada;
        String nomePessoa1;
        String nomePessoa2;

        while (true) {
            System.out.println("Informe o nome da primeira pessoa:");
            nomePessoa1 = scannerStr.nextLine();
            if (nomePessoa1 == "") {
                System.out.println("Erro! Você não pode deixar o campo nome vazio!");
                break;
            }

            System.out.println("Informe a idade da primeira pessoa:");
            idadePessoa1 = scannerInt.nextInt();
            if (idadePessoa1 <= 0) {
                System.out.println("Erro! Idade inválida!");
                break;
            }

            System.out.println("Informe o nome da segunda pessoa:");
            nomePessoa2 = scannerStr.nextLine();
            if (nomePessoa2 == "") {
                System.out.println("Erro! Você não pode deixar o campo nome vazio!");
                break;
            }

            System.out.println("Informe a idade da segunda pessoa:");
            idadePessoa2 = scannerInt.nextInt();
            if (idadePessoa2 <= 0) {
                System.out.println("Erro! Idade inválida!");
                break;
            }

            scannerInt.close();
            scannerStr.close();

            CalculadoraIdade calculadoraIdade = new CalculadoraIdade();
            diferencaCalculada = calculadoraIdade.calculaDiferenca(idadePessoa1, idadePessoa2);

            System.out.println("A diferença de idade de " + nomePessoa1 + " para " + nomePessoa2 + " é de: " + diferencaCalculada + " Ano(s)");
            if (diferencaCalculada == 0) {
                System.out.println("Ambos tem a mesma idade");
            }
            break;
        }
    }
}
