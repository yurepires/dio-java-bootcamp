package edu.yure.tema.estruturadasclasses.sistema_smart_tv;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal da Tv: " + smartTv.canal);
        System.out.println("Volume da Tv: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Novo Status -> Tv Volume: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(14);

        System.out.println("Canal atual " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
    }
}
