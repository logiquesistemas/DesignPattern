package br.com.logique.padroes.abstractfactory.dao.mysql;


import br.com.logique.padroes.abstractfactory.dao.LivroDAO;
import br.com.logique.padroes.abstractfactory.domain.Livro;
import java.util.List;

public class MysqlLivroDAO extends LivroDAO {

	@Override
	public void salvar(Livro livro) {
	}

	@Override
	public List<Livro> getLivrosByTitulo(String titulo) {
		return null;
	}

}
