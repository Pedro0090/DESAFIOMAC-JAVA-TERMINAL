package javamectermnial.desafio.app;

import java.util.Scanner;

import javamectermnial.desafio.utils.CalculadoraIdade;
import javamectermnial.desafio.model.Pessoa;
import javamectermnial.desafio.utils.Verificador;

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = informacoesDaPessoa("primeira");
        Pessoa pessoa2 = informacoesDaPessoa("segunda");

        CalculadoraIdade calculadoraIdade = new CalculadoraIdade();
        int diferenca = calculadoraIdade.calculaDiferenca(pessoa1.getIdade(), pessoa2.getIdade());

        System.out.println("A diferença de idade de " + pessoa1.getNome() + " para " + pessoa2.getNome() + " é de: " +
                diferenca + " Anos");
    }

    public static Pessoa informacoesDaPessoa(String posicaoPessoa) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Verificador verificador = new Verificador();

        String nomePessoa;
        int idadePessoa = 0;
        System.out.println("Informe o nome da " + posicaoPessoa + " pessoa:");
        nomePessoa = scanner.nextLine();
        if (!verificador.validaNomePessoa(nomePessoa)) {
            throw new RuntimeException("Erro! Você não pode deixar o campo nome vazio!");
        }

        System.out.println("Informe a idade da " + posicaoPessoa + " pessoa:");
        try {
            idadePessoa = scanner.nextInt();
        } catch (Exception NoSuchElementException) {
            throw new RuntimeException("Não é possível escrever letras ou símbolos!");
        }
        if (!verificador.validaIdadePessoa(idadePessoa)) {
            throw new RuntimeException("Erro! Idade inválida!");
        }
        return new Pessoa(nomePessoa, idadePessoa);
    }
}
