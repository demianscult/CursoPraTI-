import java.util.Scanner;

public class _11_SomaCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println("Soma total: " + soma);
        sc.close();
    }
}
