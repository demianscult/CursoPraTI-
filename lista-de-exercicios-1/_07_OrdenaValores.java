import java.util.Scanner;

public class _07_OrdenaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo valor (diferente do primeiro): ");
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("Ordem crescente: " + a + ", " + b);
        } else {
            System.out.println("Ordem crescente: " + b + ", " + a);
        }
        sc.close();
    }
}
