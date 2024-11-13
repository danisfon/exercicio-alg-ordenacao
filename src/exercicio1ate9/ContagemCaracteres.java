package exercicio1ate9;

public class ContagemCaracteres {
    public static void main(String[] args) {
        String palavra = "programacao";
        char caractere = 'a';
        System.out.println(contagem(palavra, caractere, 0));
    }

    private static int contagem(String palavra, char caractere, int indice) {
        if (indice == palavra.length()) {
            return 0;
        }
        int contagemAtual = 0;
        if (palavra.charAt(indice) == caractere) {
            contagemAtual = 1;
        }
        return contagemAtual + contagem(palavra, caractere, indice + 1);
    }
}
