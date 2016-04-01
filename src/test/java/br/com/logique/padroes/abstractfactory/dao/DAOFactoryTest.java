package br.com.logique.padroes.abstractfactory.dao;

import br.com.logique.padroes.abstractfactory.domain.Pessoa;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class DAOFactoryTest {

    @Test
    public void testMySQL() throws Exception {
        DAOFactory daoFactory = DAOFactory.getInstance(SGBD.MYSQL);
        PessoaDAO pessoaDAO = daoFactory.getPessoaDAO();
        pessoaDAO.salvar(new Pessoa(1 , "Clemilson"));
    }


    @Test
    public void testOracle() throws Exception {
        DAOFactory daoFactory = DAOFactory.getInstance(SGBD.ORACLE);
        PessoaDAO pessoaDAO = daoFactory.getPessoaDAO();
        pessoaDAO.salvar(new Pessoa(1 , "Teles"));
    }

}