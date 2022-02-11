package classe.modelo;

public class Submissao {
	
	protected String titulo;
	protected int situacao;
	protected Autor autor;
	protected Area area;
	
	public final int APROVADO = 0;
	public final int REJEITADO = 1;
	public final int ALTERACOES = 3;
	
	public Submissao() {
		
	}
	
	public Submissao(String titulo, int situacao, Autor autor, Area area) {
		this.titulo = titulo;
		this.situacao = situacao;
		this.autor = autor;
		this.area = area;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSituacao() {
		String retorno = "";
		
		if(this.situacao == APROVADO) {
			retorno = "Trabalho aprovado"; 
		}else if(this.situacao == REJEITADO) {
			retorno = "Trabalho rejeitado";
		}else if(this.situacao == ALTERACOES) {
			retorno = "Trabalho aprovado com alterações";
		}
		
		return retorno;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	

}
