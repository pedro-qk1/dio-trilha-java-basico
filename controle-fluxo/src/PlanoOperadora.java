public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B"; // M e T

        // if(plano == "B"){
        //     System.out.println("100 minutos de ligacao");
        // } else if(plano == "M"){
        //     System.out.println("100 minutos de ligacao");
        //     System.out.println("Whats e Instagram gratis");
        // } else if(plano == "T"){
        //     System.out.println("100 minutos de ligacao");
        //     System.out.println("Whats e Instagram gratis");
        //     System.out.println("5GB Youtube");
        // }

        switch(plano){
            case "T":
                System.out.println("5GB de Youtube");
            case "M":
                System.out.println("Whatsapp e Instagram gratis");
            case "B":
                System.out.println("100 minutos de ligacao");
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
