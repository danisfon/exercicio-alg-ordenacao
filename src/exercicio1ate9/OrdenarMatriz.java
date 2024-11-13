package exercicio1ate9;

import java.util.Arrays;

public class OrdenarMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                { 9, 3, 5, 1 },
                { 4, 8, 2, 6 },
                { 7, 0, 3, 5 }
        };
        for (int i = 0; i < matriz.length; i++) {
            int[] auxiliar = new int[matriz[i].length];
            mergeSort(matriz[i], auxiliar, 0, matriz[i].length - 1);
        }
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }

    private static void mergeSort(int[] vetor, int[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, auxiliar, inicio, meio);
            mergeSort(vetor, auxiliar, meio + 1, fim);
            intercalacao(vetor, auxiliar, inicio, meio, fim);
        }
    }

    private static void intercalacao(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        for (int x = inicio; x <= fim; x++) {
            auxiliar[x] = vetor[x];
        }
        int esquerda = inicio;
        int direita = meio + 1;

        for (int x = inicio; x <= fim; x++) {
            if (esquerda > meio) {
                vetor[x] = auxiliar[direita++];
            } else if (direita > fim) {
                vetor[x] = auxiliar[esquerda++];
            } else if (auxiliar[esquerda] < auxiliar[direita]) {
                vetor[x] = auxiliar[esquerda++];
            } else {
                vetor[x] = auxiliar[direita++];
            }
        }
    }
}
