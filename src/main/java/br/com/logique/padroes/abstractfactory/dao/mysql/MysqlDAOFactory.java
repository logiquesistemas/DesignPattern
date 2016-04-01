package br.com.logique.padroes.abstractfactory.dao.mysql;

import br.com.logique.padroes.abstractfactory.dao.DAOFactory;
import br.com.logique.padroes.abstractfactory.dao.LivroDAO;
import br.com.logique.padroes.abstractfactory.dao.PessoaDAO;

public class MysqlDAOFactory extends DAOFactory {

    @Override
    public PessoaDAO getPessoaDAO() {
        return new MysqlPessoaDAO();
    }

    @Override
    public LivroDAO getLivroDAO() {
        return new MysqlLivroDAO();
    }

}
