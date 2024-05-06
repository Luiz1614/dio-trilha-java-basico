import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int numero;
        String agencia;
        String titular;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite o número da agencia: ");
        agencia = scanner.next();

        System.out.println("Digite o nome do titular: ");
        titular = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + titular + ", sua conta de número " + numero + " da agência " + agencia + " possui saldo de R$" + saldo + ".");
    }
}
