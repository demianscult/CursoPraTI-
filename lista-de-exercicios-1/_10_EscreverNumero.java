import java.util.Scanner;

public class _10_EscreverNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num);
        }
        sc.close();
    }
}
