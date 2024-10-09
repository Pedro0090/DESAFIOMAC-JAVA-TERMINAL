package javamectermnial.desafio;

public class CalculadoraIdade {
    public int calculaDiferenca (int idade1, int idade2) {
        int diferencaEmAnos = idade1 - idade2;
        if (diferencaEmAnos < 0) {
            diferencaEmAnos *= (-1);
        }
        return diferencaEmAnos;
    }
}
