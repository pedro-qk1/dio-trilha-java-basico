import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }

            System.out.println("Valor do doce: R$" + valorDoce + "Adicionado no carrinho");
            mesada -= valorDoce;
        }
        System.out.println("Compras finalizadas.");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
