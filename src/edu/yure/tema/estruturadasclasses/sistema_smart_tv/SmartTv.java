package edu.yure.tema.estruturadasclasses.sistema_smart_tv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal atual: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
}
