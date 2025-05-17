import java.util.Scanner;

public class _02_MultaVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro (em Km/h): ");
        double velocidade = scanner.nextDouble();

        double velocidadeMaxima = 80.0;
        double multaPorKmAcima = 5.00;

        if (velocidade > velocidadeMaxima) {
            double velocidadeExcedida = velocidade - velocidadeMaxima;
            double valorMulta = velocidadeExcedida * multaPorKmAcima;
            System.out.println("Você foi multado!");
            System.out.printf("Valor da multa: R$ %.2f\n", valorMulta);
        } else {
            System.out.println("Velocidade dentro do limite permitido.");
        }

        scanner.close();
    }
}