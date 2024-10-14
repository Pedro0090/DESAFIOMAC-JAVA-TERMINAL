package javamectermnial.desafio.utils;

public class Verificador {
    public boolean validaNomePessoa(String nome) {
        return nome.length() > 0;
    }

    public boolean validaIdadePessoa(int idade) {
        return idade > 0;
    }
}
