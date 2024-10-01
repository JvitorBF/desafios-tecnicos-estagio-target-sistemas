public class Questao_1 {

    public static int calcularValorDaVariavelSoma() {
        // Inicializa as variáveis
        int INDICE = 13, SOMA = 0, K = 0;
        // Executa o loop enquanto K for menor que INDICE
        while (K < INDICE) {
            // Incrementa o valor de K a cada iteração
            K++;
            // Soma o valor atual de K à variável SOMA
            // Exemplo: se K = 1, SOMA será incrementado por 1 (SOMA = SOMA + 1)
            SOMA += K;
        }

        return SOMA;
    }

    public static void main(String[] args) {
        // Resposta esperada: 91
        System.out.println(calcularValorDaVariavelSoma());
    }
}