package lambda;

import java.util.List;

public class AppUsuario {

	public static void main(String[] args) {
		List<Usuario> usuarios = Database.getUsuarios();
		
//		usuarios.removeIf(usuario->usuario.getPontos()<=200);
		
		usuarios.stream()
		.filter(usuario->{
			if(usuario.getPontos()>=300) {
				usuario.setModerador(true);
			}
			return true;
		}).forEach(System.out::println);
	}
}
