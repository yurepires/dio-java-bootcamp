package estruturadasclasses;

/*
* Lembrar que se quiser executar o código pelo terminal tem que
* mover para a pasta out até a pasta do nome do projeto e se
* o arquivo que quiser executar estiver em um pacote, deve
* colocar: java nomedopacote.nomedoarquivo para ser executado
* por exemplo:
* cd C:\estudos\java\dio-java-bootcamp\out\production\dio-java-bootcamp
* java estruturadasclasse.Usuario
* */

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
