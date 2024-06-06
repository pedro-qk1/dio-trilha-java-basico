import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
            try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                System.out.println("Digite o seu nome: ");
                String nome = scanner.next();
                
                System.out.println("Digite o seu sobrenome: ");
                String sobrenome = scanner.next();
                
                System.out.println("Digite a sua idade: ");
                int idade = scanner.nextInt();
                
                System.out.println("Digite a sua altura: ");
                double altura = scanner.nextDouble();
                
                // imprimindo os dados obtidos pelo usuario
                
                System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ".");
                System.out.println("Tenho " + idade + " anos");
                System.out.println("Minha altura é de " + altura + "m.");
                scanner.close();
            }
        } catch(InputMismatchException e){
            System.out.println("Este campo precisa ser numérico!");
        }
    }
}
