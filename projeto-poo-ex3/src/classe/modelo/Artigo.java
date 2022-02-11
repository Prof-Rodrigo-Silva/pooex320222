package classe.modelo;

public final class Artigo extends Submissao{

    private String resumo;
    private static int nroArtigos;

    public Artigo() {
        super();
        incrementaNroArtigos();
    }

    public Artigo(String resumo, String titulo, int situacao, Autor autor, Area area) {
        super(titulo, situacao, autor, area);
        this.resumo = resumo;
        incrementaNroArtigos();
    }
    
    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

	public static int getNroArtigos() {
		return nroArtigos;
	}

	public static void incrementaNroArtigos() {
		nroArtigos++;
	}         
    
}
