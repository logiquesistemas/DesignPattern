package br.com.logique.padroes.abstractfactory.dao.mysql;


import br.com.logique.padroes.abstractfactory.dao.PessoaDAO;
import br.com.logique.padroes.abstractfactory.domain.Pessoa;

import java.util.List;

public class MysqlPessoaDAO extends PessoaDAO {

	@Override
	public void salvar(Pessoa pessoa) {
		System.out.println("Saving mysql");
	}

	@Override
	public List<Pessoa> getPessoaByNome(String nome) {
		return null;
	}

}
