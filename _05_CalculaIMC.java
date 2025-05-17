import java.util.Scanner;

public class _05_CalculaIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Categoria: Baixo peso");
        } else if (imc < 25) {
            System.out.println("Categoria: Peso normal");
        } else if (imc < 30) {
            System.out.println("Categoria: Sobrepeso");
        } else {
            System.out.println("Categoria: Obesidade");
        }
        sc.close();
    }
}

