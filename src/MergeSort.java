public class MergeSort {

	static void ordenarPorMerge(int vetor[], int auxiliar[], int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			ordenarPorMerge(vetor, auxiliar, inicio, meio);
			ordenarPorMerge(vetor, auxiliar, meio + 1, fim);
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