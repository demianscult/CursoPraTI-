import java.util.Scanner;

public class _13_MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int contador = 0;
        double num;

        do {
            System.out.print("Digite um número decimal (0 para sair): ");
            num = sc.nextDouble();
            if (num != 0) {
                soma += num;
                contador++;
            }
        } while (num != 0);

        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("Média aritmética: %.2f%n", media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
        sc.close();
    }
}
