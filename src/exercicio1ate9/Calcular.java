package exercicio1ate9;

public class Calcular {
    
    public static void main(String[] args) {
        int numero = 9876;
        System.out.println(somaDigitos(numero));
    }
    
    private static int somaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return (numero % 10) + somaDigitos(numero / 10);
        }
    }
}
