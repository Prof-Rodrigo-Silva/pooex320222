package classe.modelo;

import java.util.Date;

public final class MiniCurso extends Submissao {

    private int horas;
    private Date date;
    private String inicio;
    private String fim;
    private static int nroMiniCurso;

    public MiniCurso() {
        super();
        incrementarNroMiniCurso();
    }

    public MiniCurso(int horas, Date date, String inicio, String fim, String titulo, int situacao, Autor autor, Area area) {
        super(titulo, situacao, autor, area);
        this.horas = horas;
        this.date = date;
        this.inicio = inicio;
        this.fim = fim;
        incrementarNroMiniCurso();
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }
    
    public static int getNroMiniCurso() {
		return nroMiniCurso;
	}

	private static void incrementarNroMiniCurso() {
    	nroMiniCurso++;
    }
}
