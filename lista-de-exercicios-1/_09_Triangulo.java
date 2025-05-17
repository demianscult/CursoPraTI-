import java.util.Scanner;

public class _09_Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int A = sc.nextInt();

        System.out.print("Digite o lado B: ");
        int B = sc.nextInt();

        System.out.print("Digite o lado C: ");
        int C = sc.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            if (A == B && B == C) {
                System.out.println("Triângulo Equilátero");
            } else if (A == B || A == C || B == C) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não forma um triângulo.");
        }
        sc.close();
    }
}
