public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Volume: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo status -> Volume: " + smartTv.volume);
    }
}
