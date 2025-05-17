import java.util.Scanner;

public class _07_AluguelCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de carro (popular ou luxo): ");
        String tipoCarro = scanner.nextLine();

        System.out.print("Digite quantos dias de aluguel: ");
        int diasAluguel = scanner.nextInt();

        System.out.print("Digite quantos Km foram percorridos: ");
        double kmPercorrido = scanner.nextDouble();

        double precoTotal = 0.0;

        if (tipoCarro.equalsIgnoreCase("popular")) {
            precoTotal += diasAluguel * 90.00;
            if (kmPercorrido <= 100) {
                precoTotal += kmPercorrido * 0.20;
            } else {
                precoTotal += 100 * 0.20 + (kmPercorrido - 100) * 0.10;
            }
        } else if (tipoCarro.equalsIgnoreCase("luxo")) {
            precoTotal += diasAluguel * 150.00;
            if (kmPercorrido <= 200) {
                precoTotal += kmPercorrido * 0.30;
            } else {
                precoTotal += 200 * 0.30 + (kmPercorrido - 200) * 0.25;
            }
        } else {
            System.out.println("Tipo de carro inválido.");
            scanner.close();
            return;
        }

        System.out.printf("O preço total a ser pago é: R$ %.2f\n", precoTotal);

        scanner.close();
    }
}