import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //TODO: criar o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, obrigado por escolher nosso banco para criar uma conta.\nInsira os dados a seguir:");
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        //TODO: ler os dados digitados pelo usuario
        System.out.print("\nDigite o seu nome: ");
        String nome = scanner.next();

        System.out.print("\nDigite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("\nDigite o número da conta [4 dígitos]: ");
        int numeroConta = scanner.nextInt();

        System.out.print("\nDigite o número da agência: ");
        String agencia = scanner.next();

        System.out.print("\nDigite o saldo disponível: ");
        double saldo = scanner.nextDouble();
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");


        //TODO: imprimir os dados digitados pelo usuario
        System.out.println("Olá, " + nome + " " + sobrenome + ". Segue a seguir os seus dados: ");
        System.out.println("Conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Saldo: " + saldo + "\nVale lembrar que o seu saldo de R$" + saldo + " já está disponível para saque!");

        scanner.close();
    }
}
