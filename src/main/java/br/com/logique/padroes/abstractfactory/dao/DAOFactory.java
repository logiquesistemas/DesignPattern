package br.com.logique.padroes.abstractfactory.dao;


public abstract class DAOFactory {

    public static DAOFactory getInstance(SGBD sgbd) throws InstantiationException, IllegalAccessException {
        return sgbd.getDaoFactory();
    }

    public abstract PessoaDAO getPessoaDAO();

    public abstract LivroDAO getLivroDAO();

}
