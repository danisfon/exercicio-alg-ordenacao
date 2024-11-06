import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int tamanhoVetor = 10;

        int[] vetor = new int[tamanhoVetor];
        int[] auxiliar = new int[tamanhoVetor]; 

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(9); 
        }

        //merge
        int[] vetorMerge = vetor.clone(); 
        long tempoInicial = System.nanoTime();

        MergeSort.ordenarPorMerge(vetorMerge, auxiliar, 0, vetorMerge.length - 1);

        long tempoFinal = System.nanoTime();
        long tempoTotal1 = (tempoFinal - tempoInicial);
        System.out.println("merge: " + tempoTotal1);

        //bubble
        int[] vetorBubble = vetor.clone();
        tempoInicial = System.nanoTime();

        BubbleSort.ordenarPorBubble(vetorBubble);

        tempoFinal = System.nanoTime();
        long tempoTotal2 = (tempoFinal - tempoInicial);
        System.out.println("bubble: " + tempoTotal2);

        //insertion
        int[] vetorInsertion = vetor.clone();
        tempoInicial = System.nanoTime();

        InsertSort.ordenarPorInsert(vetorInsertion);

        tempoFinal = System.nanoTime();
        long tempoTotal3 = (tempoFinal - tempoInicial);
        System.out.println("insertion: " + tempoTotal3);

        //selection
        int[] vetorSelection = vetor.clone();
        tempoInicial = System.nanoTime();

        SelectionSort.ordenarPorSelection(vetorSelection);

        tempoFinal = System.nanoTime();
        long tempoTotal4 = (tempoFinal - tempoInicial);
        System.out.println("selection: " + tempoTotal4);
    }
}
