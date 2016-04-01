package br.com.logique.padroes.singleton;

import br.com.logique.padroes.dependencyinjection.CarDao;
import br.com.logique.padroes.dependencyinjection.NegocioCar;
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
@AdditionalClasses({CDIBusiness.class, CDIConfig.class})
public class CDIBusinessTest {

    @Inject
    private CDIBusiness business;

    @Test
    public void testDoSomething() throws Exception {
        business.doSomething();
        business.doSomething();
    }
}