package lambda;

import java.util.List;

public class AppScifiNota {

	public static void main(String[] args) {
		List<Movie> movies = Database.getMovies();
		
		movies.stream()
		.filter(movie->movie.getType().toLowerCase().equals("sci-fi") && movie.getScore()>=9)
		.forEach(System.out::println);
	}
}
