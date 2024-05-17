public class SistemaMedida {
    public static void main(String[] args){
        String tamanho = "A";

        // if (tamanho == "P"){
        //     System.out.println("PEQUENO");
        // } else if (tamanho == "M"){
        //     System.out.println("MEDIO");
        // } else if (tamanho == "G"){
        //     System.out.println("GRANDE");
        // } else{
        //     System.out.println("INDEFINIDO");
        // }

        switch (tamanho){
            case "P" -> {
                System.out.println("PEQUENO");
            }
            case "M" -> {
                System.out.println("MEDIO");
            }
            case "G" -> {
                System.out.println("GRANDE");
            } default -> {
                System.out.println("INDEFINIDO");
            }
        }
    }
}
