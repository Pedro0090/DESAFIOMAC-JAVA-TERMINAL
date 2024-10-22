package javamectermnial.desafio.utils;

import java.util.Objects;

public class Verificador {
	
    public static void validaNomePessoa(String nome) {
    	if(Objects.equals(nome, "")) {
    		throw new RuntimeException("Erro! Você não pode deixar o campo nome vazio!");
    	}
    }

    public static void validaIdadePessoa(int idade) {
    	if(idade <= 0) {
    		throw new RuntimeException("Erro! Idade inválida!");
    	}
    }
}
