package lambda;

@Autor(name="Eita")
public class Usuario implements
Comparable<Usuario> {
	
	private static Integer nextId = 1;
	private Integer id;
	private String nome;
	private Integer pontos;
	private boolean moderador;

	public Usuario(String nome, Integer pontos) {
		this.id = nextId++;
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}
	@Override
	public String toString() {
		return "Usuario: "+id+" | " + nome + " | " + pontos+" | "+moderador+" | ";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPontos() {
		return pontos;
	}
	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
	public boolean isModerador() {
		return moderador;
	}
	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (moderador ? 1231 : 1237);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((pontos == null) ? 0 : pontos.hashCode());
		return result;
	}
	@Override
	public int compareTo(Usuario usuario) {
		return this.nome.compareTo(usuario.nome);
	}
	
	// Classe dentro de classe
	class Endereco{
		
	}
}