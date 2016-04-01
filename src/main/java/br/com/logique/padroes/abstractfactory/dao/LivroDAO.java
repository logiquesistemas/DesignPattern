package br.com.logique.padroes.abstractfactory.dao;

import br.com.logique.padroes.abstractfactory.domain.Livro;

import java.util.List;

public abstract class LivroDAO {

	public abstract void salvar(Livro livro);
	
	public abstract List<Livro> getLivrosByTitulo(String titulo);
	
}
