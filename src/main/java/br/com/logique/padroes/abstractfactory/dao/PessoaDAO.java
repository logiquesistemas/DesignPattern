package br.com.logique.padroes.abstractfactory.dao;

import br.com.logique.padroes.abstractfactory.domain.Pessoa;

import java.util.List;

public abstract class PessoaDAO {
	
	public abstract void salvar(Pessoa pessoa);
	
	public abstract List<Pessoa> getPessoaByNome(String nome);

}
