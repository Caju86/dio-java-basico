import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String Agencia;
        String Cliente;
        String conta;
        String SaldoConta;

        System.out.println("Por favor, digite o número da Agência: ");
        Agencia = ler.next();
        
        System.out.println("Infome o número da sua conta: ");
        conta = ler.next();

        System.out.println("Infome seu nome: ");
        Cliente = ler.next();

        System.out.println("Infome o saldo da sua conta: ");
        SaldoConta = ler.next();

        System.out.println("Olá Sr(a)" + Cliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + Agencia + ", conta " + conta + " e seu saldo R$" + SaldoConta + " já está disponível");
        
        }
}
