package exercicio1ate9;

public class Inverter {
    
    public static void main(String[] args) {
        String palavra = "recursao";
        System.out.println(inverterString(palavra));
    }
    private static String inverterString(String palavra) {

        System.out.println(palavra);

        if (palavra.length() <= 1) {
            return palavra;
        }
        return inverterString(palavra.substring(1)) + palavra.charAt(0);
    }
}
