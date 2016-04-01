package br.com.logique.padroes.abstractfactory.dao;

import br.com.logique.padroes.abstractfactory.dao.mysql.MysqlDAOFactory;
import br.com.logique.padroes.abstractfactory.dao.oracle.OracleDAOFactory;

public enum SGBD {

    MYSQL(MysqlDAOFactory.class), ORACLE(OracleDAOFactory.class);

    private Class<? extends DAOFactory> clazz;

    SGBD(Class<? extends DAOFactory> clazz) {
        this.clazz = clazz;
    }

    public DAOFactory getDaoFactory() throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

}
