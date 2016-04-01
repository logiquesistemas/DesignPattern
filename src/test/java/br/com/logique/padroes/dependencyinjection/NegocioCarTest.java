package br.com.logique.padroes.dependencyinjection;

import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

/**
 * Created by Gustavo on 01/04/2016.
 */
@RunWith(CdiRunner.class)
@AdditionalClasses({CarDao.class, NegocioCar.class})
public class NegocioCarTest {

    @Inject
    private NegocioCar negocioCar;

    @Test
    public void testSalvar() throws Exception {
        negocioCar.salvar(new Car("fusca", "azul"));
    }

}