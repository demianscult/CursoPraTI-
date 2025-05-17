import java.util.Random;
import java.util.Scanner;

public class _05_JoKenPo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opcoes = {"pedra", "papel", "tesoura"};
        int escolhaComputador = random.nextInt(3);
        String computadorEscolha = opcoes[escolhaComputador];

        System.out.println("Vamos jogar JoKenPo!");
        System.out.println("Escolha: 0 - pedra, 1 - papel, 2 - tesoura");
        System.out.print("Digite sua escolha: ");
        int escolhaJogador = scanner.nextInt();

        if (escolhaJogador < 0 || escolhaJogador > 2) {
            System.out.println("Escolha inválida!");
        } else {
            String jogadorEscolha = opcoes[escolhaJogador];
            System.out.println("Você escolheu: " + jogadorEscolha);
            System.out.println("O computador escolheu: " + computadorEscolha);

            if (jogadorEscolha.equals(computadorEscolha)) {
                System.out.println("Empate!");
            } else if ((jogadorEscolha.equals("pedra") && computadorEscolha.equals("tesoura")) ||
                       (jogadorEscolha.equals("papel") && computadorEscolha.equals("pedra")) ||
                       (jogadorEscolha.equals("tesoura") && computadorEscolha.equals("papel"))) {
                System.out.println("Você ganhou!");
            } else {
                System.out.println("O computador ganhou!");
            }
        }

        scanner.close();
    }
}