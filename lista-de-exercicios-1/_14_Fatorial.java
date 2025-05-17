import java.util.Scanner;

public class _14_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Número inválido para fatorial.");
        } else {
            long fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de " + num + " = " + fatorial);
        }
        sc.close();
    }
}
