public class Questao_2 {

    public static boolean numeroPertenceASequenciaFibonacci(int numero) {
        int a = 0, b = 1;
        while (a <= numero) {
            if (a == numero) {
                return true;
            }
            // Atualiza a sequência de Fibonacci
            int temp = a;
            a = b;
            // b = fibonacci (temp + a)
            b = temp + a;
        }
        return false;
    }

    public static void main(String[] args) {
        int numero = 21;
        System.out.println(numeroPertenceASequenciaFibonacci(numero));
    }
}
