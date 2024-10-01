public class Questao_5 {

    // Método que inverte uma string usando um loop for
    public static String inverterString(String texto_normal) {
        // StringBuilder é utilizado pois strings em Java são imutáveis
        StringBuilder texto_invertido = new StringBuilder();
        int n = texto_normal.length() - 1;

        // Adiciona os caracteres da string original ao StringBuilder em ordem inversa
        for (int i = n; i >= 0; i--) {
            texto_invertido.append(texto_normal.charAt(i));
        }

        return texto_invertido.toString();
    }

    // Método que inverte uma string usando dois ponteiros
    public static String inverterStringComDoisPonteiros(String texto_normal) {
        // Converte a string para um array de caracteres
        char[] texto_invertido = texto_normal.toCharArray();
        int inicio = 0;
        int fim = texto_invertido.length - 1;

        // Troca os caracteres nas posições inicio e fim até que os ponteiros se
        // encontrem
        while (inicio < fim) {
            char temp = texto_invertido[inicio];
            texto_invertido[inicio] = texto_invertido[fim];
            texto_invertido[fim] = temp;

            // Move os ponteiros para o centro
            inicio++;
            fim--;
        }

        return new String(texto_invertido);
    }

    public static void main(String[] args) {
        // Define a string a ser invertida
        String texto_normal = "Texto que deve ser invertido";
        System.out.println(inverterString(texto_normal));
        System.out.println(inverterStringComDoisPonteiros(texto_normal));
    }
}
