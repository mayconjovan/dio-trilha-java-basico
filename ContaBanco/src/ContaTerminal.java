import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {    

        int conta;
        String agencia;
        String nome;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao DIOBank!");
        System.out.println("Por favor, insira o numero da sua conta.");
        conta = scanner.nextInt();

        System.out.println("Agora insira o número da agência com hífen.");
        agencia = scanner.next();

        System.out.println("Agora informe o seu nome.");
        nome = scanner.next();

        System.out.println("Informe o saldo desejado.");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta: " + conta + " e seu saldo de: R$" + saldo + " já está disponível para saque.");

    }
}
