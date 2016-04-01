package br.com.logique.padroes.abstractfactory.dao.oracle;


import br.com.logique.padroes.abstractfactory.dao.DAOFactory;
import br.com.logique.padroes.abstractfactory.dao.LivroDAO;
import br.com.logique.padroes.abstractfactory.dao.PessoaDAO;

public class OracleDAOFactory extends DAOFactory {

	@Override
	public PessoaDAO getPessoaDAO() {
		return new OraclePessoaDAO();
	}

	@Override
	public LivroDAO getLivroDAO() {
		return new OracleLivroDAO();
	}

}
