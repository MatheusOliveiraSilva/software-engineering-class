package DAO;

import java.util.List;

import edu.entidade.Venda;

public interface DAO {
	
	void adicionar(Venda t);
	void remover(Venda t);
	List<Venda> pesquisar (String n);
}
