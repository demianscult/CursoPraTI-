import java.util.Scanner;

public class _10_LerNumerosDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somatorio = 0;
        int menorValor = Integer.MAX_VALUE;
        int contador = 0;
        int pares = 0;
        double numero;
        String continuar;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextDouble();

            somatorio += numero;
            contador++;

            if (numero < menorValor) {
                menorValor = (int) numero;
            }

            if ((int) numero % 2 == 0) {
                pares++;
            }

            System.out.print("Deseja continuar (S/N)? ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        if (contador > 0) {
            double media = (double) somatorio / contador;
            System.out.println("Somatório dos valores: " + somatorio);
            System.out.println("Menor valor digitado: " + menorValor);
            System.out.printf("Média dos valores: %.2f\n", media);
            System.out.println("Quantidade de valores pares: " + pares);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        scanner.close();
    }
}