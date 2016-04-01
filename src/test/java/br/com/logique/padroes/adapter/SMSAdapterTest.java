package br.com.logique.padroes.adapter;

import org.junit.Test;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class SMSAdapterTest {

    @Test
    public void testSendSMS() throws Exception {
        SMSAdapter smsAdapter = new SMSAdapter(new EnviadorSMSImpl());
        smsAdapter.sendSMS(SMS.of("origem", "destino", "msg"));
    }
}