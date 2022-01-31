package lambda;

import java.util.List;

public class AppLambda {

	public static void main(String[] args) {
		List<Movie> movies = Database.getMovies();
	
		movies.stream()
		.filter(m->m.getScore()>=8)
		//.removeIf(condicao > X)
		.forEach(System.out::println);
	}
}
