package classe.modelo;

import java.util.Date;

public class Palestra extends Submissao{
    
    private String descricao;
    private Date data;
    private String hora;
    private static int nroPalestra;

    public Palestra() {
    	super();
    	incrementarNumeroPalestras();
        
    }

    public Palestra(String descricao, Date data, String hora, String titulo, int situacao, Autor autor, Area area) {
        super(titulo, situacao, autor, area);
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        incrementarNumeroPalestras();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    public static int getNroPalestra() {
		return nroPalestra;
	}

	private static void incrementarNumeroPalestras() {
    	nroPalestra++;
    }
    
}