public class ResultadoEscolar {
    public static void main(String[] args){
        int nota = 6;

        // String resultado = nota >= 7 ? "Aprovado!" : "Reprovado!"; // operador ternário somente com if E else
        // System.out.println(resultado);

        String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Recuperação!" : "Reprovado!"; // operador ternário com if, else e else if
        System.out.println(resultado);
    }
}
