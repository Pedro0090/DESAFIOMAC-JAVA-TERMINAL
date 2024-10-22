package javamectermnial.desafio.app;

import java.util.Scanner;

import javamectermnial.desafio.utils.CalculadoraIdade;
import javamectermnial.desafio.model.Pessoa;
import javamectermnial.desafio.utils.Verificador;

public class Main {
	
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = informacoesDaPessoa("primeira");
        Pessoa pessoa2 = informacoesDaPessoa("segunda");

        int diferenca = CalculadoraIdade.calculaDiferenca(pessoa1.getIdade(), pessoa2.getIdade());

        System.out.println("A diferença de idade de " + pessoa1.getNome() + " para " + pessoa2.getNome() + " é de: " + diferenca + " Anos");
    }

    public static Pessoa informacoesDaPessoa(String posicaoPessoa) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String nomePessoa;
        int idadePessoa = 0;
        
        System.out.println("Informe o nome da " + posicaoPessoa + " pessoa:");
        nomePessoa = scanner.nextLine();
        Verificador.validaNomePessoa(nomePessoa);

        try {
        	System.out.println("Informe a idade da " + posicaoPessoa + " pessoa:");
            idadePessoa = scanner.nextInt();
        } catch (Exception NoSuchElementException) {
            throw new RuntimeException("Não é possível escrever letras ou símbolos!");
        }
        
        Verificador.validaIdadePessoa(idadePessoa);
        
        return new Pessoa(nomePessoa, idadePessoa);
    }
}
