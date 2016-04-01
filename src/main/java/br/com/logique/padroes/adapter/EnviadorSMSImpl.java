package br.com.logique.padroes.adapter;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class EnviadorSMSImpl implements EnviadorSMS {

    @Override
    public void enviarSMS(String nome, String origem, String[] msg) throws SMSException {
        System.out.println("sending sms...");
    }
}
