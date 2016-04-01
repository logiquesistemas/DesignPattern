package br.com.logique.padroes.adapter;

/**
 * Created by Gustavo on 01/04/2016.
 */
public interface EnviadorSMS {

    void enviarSMS(String nome, String origem, String[] msg) throws SMSException;

}
