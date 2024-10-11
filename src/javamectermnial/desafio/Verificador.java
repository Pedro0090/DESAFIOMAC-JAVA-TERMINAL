package javamectermnial.desafio;

public class Verificador {
    public boolean ValidaNomePessoa (String nome) {
        if (nome.length() > 0) {
            return true;
        }
        return false;
    }

    public boolean ValidaIdadePessoa (int idade) {
        if (idade > 0) {
            return true;
        }
        return false;
    }
}
