package com.dio.bootcamp.santander.iphone;


import com.dio.bootcamp.santander.appphone.Phone;
import com.dio.bootcamp.santander.appphone.VoiceMail;
import com.dio.bootcamp.santander.browser.Safari;
import com.dio.bootcamp.santander.mail.Gmail;
import com.dio.bootcamp.santander.mail.Yahoo;
import com.dio.bootcamp.santander.musicplayer.Ipod;

public class Iphone implements Phone, VoiceMail, Safari, Gmail, Yahoo, Ipod {

    @Override
    public void fazendoUmaLigacao() {
        System.out.println("Ligando...");

    }

    @Override
    public void atendendoLigacao() {
        System.out.println("Ligação atendida.");

    }

    @Override
    public void deligando() {
        System.out.println("Desligando...");

    }
    @Override
    public void colocandoChamadaEmEspera() {
        System.out.println("Colocando em modo espera para atender outra chamda");

    }
    @Override
    public void atendendoChamadaEmEspera() {
        System.out.println("Atendendo nova chamada...");
    }


    @Override
    public void abrindoVoiceMail() {
        System.out.println("Abrindo Correio de voz...");

    }

    @Override
    public void selecionandoMensagemVoiceMail() {
        System.out.println("Verificando lista de mensagens.");

    }

    @Override
    public void ouvindoMensagemVoiceMail() {
        System.out.println("Ouvindo mensagem...");

    }

    @Override
    public void deletandoMensagemVoiceMail() {
        System.out.println("Deletando mensagem...");

    }

    @Override
    public void abrirSafari() {
        System.out.println("Navegador abrindo...");

    }

    @Override
    public void exibindoPagina() {
        System.out.println("Carregando a página...");

    }

    @Override
    public void abrindoNovaPagina() {
        System.out.println("Abrindo nova Página...");

    }

    @Override
    public void fechandoSafari() {
        System.out.println("Fechando navegador...");

    }


    @Override
    public void abrindoEmailGmail() {
        System.out.println("Abrindo e-mails...");

    }

    @Override
    public void selecionandoEmailGmail() {
        System.out.println("Selecionando e-mail para vizualizar...");

    }

    @Override
    public void respondendoEmailGmail() {
        System.out.println("Respondendo e-mail...");

    }

    @Override
    public void apagandoEmailGmail() {
        System.out.println("Apagando e-mail...");

    }


    @Override
    public void abrindoEmailYahoo() {
        System.out.println("Abrindo do e-mails...");

    }

    @Override
    public void selecionandoEmailYahoo() {
        System.out.println("Selecionando e-mail para vizualizar...");

    }

    @Override
    public void respondendoEmailYahoo() {
        System.out.println("Respondendo e-mail...");

    }

    @Override
    public void apagandoEmailYahoo() {
        System.out.println("Apagando e-mail...");

    }



    @Override
    public void abrindoIpod() {
        System.out.println("Ipod aberto.");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo a música a ser tocada.");

    }

    @Override
    public void tocarMusicaSelecionada() {
        System.out.println("Tocando a música selecionada.");

    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a reprodução.");

    }

    @Override
    public void fechandoIpod() {
        System.out.println("Ipod fechado.");

    }
}