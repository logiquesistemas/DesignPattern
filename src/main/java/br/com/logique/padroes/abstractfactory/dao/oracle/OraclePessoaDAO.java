package br.com.logique.padroes.abstractfactory.dao.oracle;


import br.com.logique.padroes.abstractfactory.dao.PessoaDAO;
import br.com.logique.padroes.abstractfactory.domain.Pessoa;

import java.util.List;

public class OraclePessoaDAO extends PessoaDAO {

	@Override
	public void salvar(Pessoa pessoa) {
		System.out.println("Saving oracle");
		
	}

	@Override
	public List<Pessoa> getPessoaByNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
