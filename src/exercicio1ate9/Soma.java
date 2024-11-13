package exercicio1ate9;

public class Soma {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(somaArray(array, 0));
    }

    private static int somaArray(int[] array, int indice) {
        if (indice == array.length) {
            return 0;
        }
        return array[indice] + somaArray(array, indice + 1);
    }
}
