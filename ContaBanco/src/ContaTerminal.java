import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bom dia!!!");

        System.out.println("Por favor, digite o número da Agência: ");
         String Agencia = scanner.next();
        
        System.out.println("Infome o número da sua conta: ");
         String  Conta = scanner.next();

        System.out.println("Infome seu nome: ");
         String  Cliente = scanner.next();

        System.out.println("Infome o saldo da sua conta: ");
         String  SaldoConta = scanner.next();

        System.out.println("Olá Sr(a)" + Cliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + Agencia + ", conta " + Conta + " e seu saldo R$" + SaldoConta + " já está disponível");
        
        }
}
