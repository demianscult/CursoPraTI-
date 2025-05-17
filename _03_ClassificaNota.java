import java.util.Scanner;

public class _03_ClassificaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota (0 a 10): ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida.");
        } else if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
