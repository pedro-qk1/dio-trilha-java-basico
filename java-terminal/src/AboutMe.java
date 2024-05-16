import java.util.Scanner; // cria a classe Scanner

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // cria o objeto scanner, para que seja possivel receber parametros do usuario

        System.out.print("Digite o seu nome: ");
        String nome = scanner.next(); // lê a entrada do usuario

        System.out.print("\nDigite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("\nDigite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("\nDigite a sua altura: ");
        double altura = scanner.nextDouble();

        // imprimindo os dados digitados pelo usuario
        System.out.println("\nOlá, " + nome + " " + sobrenome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Sua altura é de " + altura + "cm");
    }
}
