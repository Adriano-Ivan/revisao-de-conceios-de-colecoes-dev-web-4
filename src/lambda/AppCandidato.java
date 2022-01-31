package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppCandidato {

	public static void main(String[] args) {
		List<Candidato> candidatos = new ArrayList<Candidato>();
		candidatos.add(new Candidato("C",2010,(double)5323,"2010-08-09"));
		candidatos.add(new Candidato("B",2004,(double)2882,"2004-09-10"));
		candidatos.add(new Candidato("A",2001,(double)2289,"2001-05-15"));
		candidatos.add(new Candidato("B",1999,(double)4988,"1999-02-25"));
		candidatos.add(new Candidato("A",1999,(double)3898,"1999-03-28"));
		
		//candidatos.sort(null);
//		candidatos.sort(Comparator.comparingInt(Candidato::getAnoDeNascimento)
//				.thenComparingDouble(Candidato::getRendaMensal));
		
//		candidatos.sort(Comparator.comparing(Candidato::getConceito)
//				.thenComparing(Candidato::getDataDeNascimento));
//		
		candidatos.sort(Comparator.comparing(Candidato::getDataDeNascimento));
		candidatos.forEach(System.out::println);
	}
}
