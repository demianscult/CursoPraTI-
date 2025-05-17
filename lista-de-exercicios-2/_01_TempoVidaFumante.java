import java.util.Scanner;

public class _01_TempoVidaFumante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos cigarros você fuma por dia? ");
        int cigarrosPorDia = sc.nextInt();

        System.out.print("Há quantos anos você fuma? ");
        int anosFumando = sc.nextInt();

        int totalCigarros = cigarrosPorDia * 365 * anosFumando;
        int minutosPerdidos = totalCigarros * 10;
        int diasPerdidos = minutosPerdidos / (60 * 24);

        System.out.println("Você perdeu aproximadamente " + diasPerdidos + " dias de vida.");

        sc.close();
    }
}
