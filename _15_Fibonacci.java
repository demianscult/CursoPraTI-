public class _15_Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1;
        System.out.print("Primeiros 10 números da sequência de Fibonacci: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(n1 + " ");
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }
    }
}
