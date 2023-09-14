package com.dio.bootcamp.santander;

import com.dio.bootcamp.santander.iphone.Iphone;


public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();


        System.out.println("Phone");
        iphone.atendendoLigacao();
        iphone.fazendoUmaLigacao();
        iphone.atendendoChamadaEmEspera();
        iphone.colocandoChamadaEmEspera();
        iphone.deligando();

        System.out.println("\nVoice Mail");
        iphone.abrindoVoiceMail();
        iphone.selecionandoMensagemVoiceMail();
        iphone.ouvindoMensagemVoiceMail();
        iphone.deletandoMensagemVoiceMail();

        System.out.println("\nSafari");
        iphone.abrirSafari();
        iphone.exibindoPagina();
        iphone.abrindoNovaPagina();
        iphone.fechandoSafari();

        System.out.println("\nGmail");
        iphone.abrindoEmailGmail();
        iphone.selecionandoEmailGmail();
        iphone.respondendoEmailGmail();
        iphone.apagandoEmailGmail();

        System.out.println("\nYahoo");
        iphone.abrindoEmailYahoo();
        iphone.selecionandoEmailYahoo();
        iphone.respondendoEmailYahoo();
        iphone.apagandoEmailYahoo();

        System.out.println("\nIpod");
        iphone.abrindoIpod();
        iphone.selecionarMusica();
        iphone.tocarMusicaSelecionada();
        iphone.pausarMusica();
        iphone.fechandoIpod();


    }

}
