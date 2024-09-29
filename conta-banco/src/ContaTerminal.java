import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência sem '-'!");
        String agencia = scanner.next();
        agencia = agencia.substring(0, agencia.length() - 1) + "-" + agencia.substring(agencia.length() - 1);

        System.out.println("Por favor, digite seu Nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu Sobrenome!");
        String sobrenomeCliente = scanner.next();

        System.out.println("Qual valor do depósito inicial?");
        double saldo =  scanner.nextDouble();


        System.out.println("Olá " + nomeCliente +" "+ sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
