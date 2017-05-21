package manadgBeans;

import java.util.ArrayList;
import java.util.List;

import controle.ControleLivro;
import model.Livro;

public class ManadgBeansListarLivros {
	
	private List<Livro> listlivro = new ArrayList<>();
	
	
	public List<Livro> getListlivro() {
		listlivro = ControleLivro.lista;
		
		return listlivro;
	}

}
