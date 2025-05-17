import java.util.Scanner;

public class _03_PrecoPassagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância que deseja percorrer (em Km): ");
        double distancia = scanner.nextDouble();

        double preco;
        if (distancia <= 200) {
            preco = distancia * 0.50;
        } else {
            preco = distancia * 0.45;
        }

        System.out.printf("O preço da passagem é: R$ %.2f\n", preco);

        scanner.close();
    }
}