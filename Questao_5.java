public class Questao_5 {

    public static String inverterString(String texto_normal) {
        StringBuilder texto_invertido = new StringBuilder();
        int n = texto_normal.length() - 1;

        for (int i = n; i >= 0; i--) {
            texto_invertido.append(texto_normal.charAt(i));
        }

        return texto_invertido.toString();
    }

    public static String inverterStringComDoisPonteiros(String texto_normal) {
        char[] texto_invertido = texto_normal.toCharArray();
        int inicio = 0;
        int fim = texto_invertido.length - 1;

        while (inicio < fim) {
            char temp = texto_invertido[inicio];
            texto_invertido[inicio] = texto_invertido[fim];
            texto_invertido[fim] = temp;

            inicio++;
            fim--;
        }

        return new String(texto_invertido);
    }

    public static void main(String[] args) {
        String texto_normal = "Texto que deve ser invertido";
        System.out.println(inverterString(texto_normal));
        System.out.println(inverterStringComDoisPonteiros(texto_normal));
    }
}
