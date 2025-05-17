import java.util.Scanner;

public class _09_SalariosPorSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSalarioHomens = 0;
        double totalSalarioMulheres = 0;
        String continuar;

        do {
            System.out.print("Digite o sexo do funcionário (M/F): ");
            String sexo = scanner.next();

            System.out.print("Digite o salário do funcionário: ");
            double salario = scanner.nextDouble();

            if (sexo.equalsIgnoreCase("M")) {
                totalSalarioHomens += salario;
            } else if (sexo.equalsIgnoreCase("F")) {
                totalSalarioMulheres += salario;
            } else {
                System.out.println("Sexo inválido.");
            }

            System.out.print("Deseja continuar (S/N)? ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.printf("Total de salário pago aos homens: R$ %.2f\n", totalSalarioHomens);
        System.out.printf("Total de salário pago às mulheres: R$ %.2f\n", totalSalarioMulheres);

        scanner.close();
    }
}
