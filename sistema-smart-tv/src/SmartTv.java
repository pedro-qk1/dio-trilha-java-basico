public class SmartTv { // cria a classe da SmartTV
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){ // cria o método para ligar a TV
        ligada = true;
    }

    public void desligar(){ // cria o método para desligar a TV
        ligada = false;
    }

    public void mudarCanal(int novoCanal){ // cria o método para mudar para o canal desejado, usando o parametro novoCanal
        canal = novoCanal;
        System.out.println("Mudando o canal para: " + canal);
    }

    public void aumentarCanal(){ // cria o método para aumentar o canal
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal(){ // cria o método para diminuir o canal
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }

    public void aumentarVolume(){ // cria o método para aumentar o volume
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){ // cria o método para diminuir o volume
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
}
