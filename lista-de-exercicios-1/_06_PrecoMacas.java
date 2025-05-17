import java.util.Scanner;

public class _06_PrecoMacas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de maçãs compradas: ");
        int quantidade = sc.nextInt();

        double preco;

        if (quantidade < 12) {
            preco = 0.30 * quantidade;
        } else {
            preco = 0.25 * quantidade;
        }

        System.out.printf("Valor total da compra: R$ %.2f%n", preco);
        sc.close();
    }
}
