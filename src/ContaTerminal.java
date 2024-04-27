import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite o seu nome e sobrenome:");
        String nomeSobrenome = scanner.nextLine();

        System.out.println("Por favor, qual o valor do seu depósito ?");
        Double deposito = scanner.nextDouble();

        System.out.println("Olá, " + nomeSobrenome + ", obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + ", conta: " + conta + " e seu saldo de R$ " + deposito + " já está disponível para saque.");
    }
}
