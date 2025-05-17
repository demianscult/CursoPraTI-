import java.util.Scanner;

public class _08_PontosAtividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantas horas de atividade física no mês: ");
        double horasAtividade = scanner.nextDouble();

        int pontos = 0;
        if (horasAtividade <= 10) {
            pontos = (int) (horasAtividade * 2);
        } else if (horasAtividade <= 20) {
            pontos = (int) (horasAtividade * 5);
        } else {
            pontos = (int) (horasAtividade * 10);
        }

        double valorGanho = pontos * 0.05;

        System.out.println("Total de pontos ganhos: " + pontos);
        System.out.printf("Valor total ganho: R$ %.2f\n", valorGanho);

        scanner.close();
    }
}