import java.util.Scanner;

public class _04_MenuSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1 - Opção 1");
        System.out.println("2 - Opção 2");
        System.out.println("3 - Opção 3");
        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a Opção 1.");
                break;
            case 2:
                System.out.println("Você escolheu a Opção 2.");
                break;
            case 3:
                System.out.println("Você escolheu a Opção 3.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        sc.close();
    }
}
