import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da Agencia:");
        String Agencia = scanner.next();

        System.out.print("Digite o numero da Conta:");
        int Numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o seu nome:");
        String NomeCliente = scanner.nextLine();

        System.out.print("Digite seu deposito:");
        String saldoInput = scanner.nextLine();
        saldoInput = saldoInput.replace(",", ".");
        double Saldo = Double.parseDouble(saldoInput);

        System.out.print("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +Agencia + ", conta "+ Numero + " e seu saldo "+Saldo +" já está disponível para saque!");
    }
}
