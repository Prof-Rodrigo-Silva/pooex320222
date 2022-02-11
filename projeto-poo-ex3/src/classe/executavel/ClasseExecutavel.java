package classe.executavel;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import classe.modelo.Area;
import classe.modelo.Artigo;
import classe.modelo.Autor;
import classe.modelo.MiniCurso;
import classe.modelo.Palestra;

public class ClasseExecutavel {

	public static void main(String[] args) throws ParseException {
		
		Palestra palestra, palestra1;
        MiniCurso minicurso;
        Artigo artigo;
        
        Area area1, area2, area3;
        Autor autor;
        
        autor = new Autor("Rodrigo", "rodrigo@gmail.com", 87878787);
        area1 = new Area("Mineração de Dados");
        area2 = new Area("Desenvolvimento de Mobile");
        area3 = new Area("GeoInformação");
        
        
        artigo = new Artigo("Estudo e aplicação de ferramentas de data mining",
                            "Ferramentas de Mineração de Dados", 
                            0,
                            autor,
                            area1);

        SimpleDateFormat df;//Faz a formatação de datas
        df = new SimpleDateFormat("dd/MM/yyyy");
        
        Date data_palestra = df.parse("07/02/2022");//Converte para um tipo date
        Date data_minicurso = df.parse("08/02/2022");
        
        
        palestra = new Palestra("Construção de Aplicativos Mobile", 
                                 data_palestra, 
                                 "19:30", 
                                 "Uso de ferramentas para desencolvimento Híbrido", 
                                 0, 
                                 autor, 
                                 area2);
        
        palestra1 = new Palestra();
        
        minicurso = new MiniCurso(4, 
                                  data_minicurso, 
                                  "18:30", 
                                  "22:30", 
                                  "Modelagem de Informações geográficas", 
                                   0, 
                                   autor, 
                                   area3);                       
       
        System.out.println("Palestra ------------------------------");
        System.out.println("Descrição .....: " + palestra.getDescricao());
        System.out.println("Data ..........: " + df.format(palestra.getData()));
        System.out.println("Hora ..........: " + palestra.getHora());
        System.out.println("Titulo ........: " + palestra.getTitulo());
        System.out.println("Situação ......: " + palestra.getSituacao());
        System.out.println("Autor .........: " + palestra.getAutor().getNome());
        System.out.println("Área ..........: " + palestra.getArea().getDescricao());
        System.out.println(palestra.getNroPalestra());
        

	}

}
