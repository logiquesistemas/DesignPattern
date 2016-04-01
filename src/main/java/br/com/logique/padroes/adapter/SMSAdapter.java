package br.com.logique.padroes.adapter;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class SMSAdapter implements SMSSender {

    private EnviadorSMS enviadorSMS;

    public SMSAdapter(EnviadorSMS enviadorSMS) {
        this.enviadorSMS = enviadorSMS;
    }

    @Override
    public boolean sendSMS(SMS sms) {
        String dest = sms.getDestino();
        String orig = sms.getOrigem();
        String[] txts = quebrarMsgs(sms.getTexto());
        return tentaEnviar(dest, orig, txts);
    }

    private boolean tentaEnviar(String dest, String orig, String[] txts) {
        try {
            enviadorSMS.enviarSMS(dest, orig, txts);
        } catch (SMSException e) {
            return true;
        }
        return false;
    }

    private String[] quebrarMsgs(String text) {
        int size = text.length();
        int qtd = (size % 160 == 0) ? size / 160 : size / 160 + 1;
        String[] msgs = new String[qtd];
        for (int i = 0; i < qtd; i++) {
            int min = i * 160;
            int max = (i == qtd - 1) ? size : (i + 1) * 160;
            msgs[i] = text.substring(min, max);
        }
        return msgs;
    }


}
