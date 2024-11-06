public class SelectionSort {
    public static void ordenarPorSelection(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[index]) {
                    index = j;
                }
            }
            int temp = vetor[index];
            vetor[index] = vetor[i];
            vetor[i] = temp;
        }
    }
}
