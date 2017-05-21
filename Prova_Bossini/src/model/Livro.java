package model;

public class Livro {

	private Integer idLivro;
	private String titulo;
	private Integer numPagn;
	private String autor;
	
	public Livro() {
		
	}

	public Livro(Integer idLivro, String titulo, Integer numPagn, String autor) {
		super();
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.numPagn = numPagn;
		this.autor = autor;
	}
	 
	public Integer geraCodigo(Integer codigo){
		
		int codigo1 = 0;
		int codigo2 = 1;
		
		if(codigo == null || codigo == 0){
			codigo1 = codigo2;
			
			
		}else {
			
			codigo1 = codigo + codigo2;
		}
		
		return codigo1;
		
	}

	public Integer getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getNumPagn() {
		return numPagn;
	}

	public void setNumPagn(Integer numPagn) {
		this.numPagn = numPagn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
