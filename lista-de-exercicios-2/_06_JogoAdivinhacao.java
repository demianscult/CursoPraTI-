import java.util.Random;
import java.util.Scanner;

public class _06_JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(5) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Tente adivinhar o número entre 1 e 5!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas. O número era " + numeroSorteado + ".");
            }
        } while (palpite != numeroSorteado);

        scanner.close();
    }
}