package lambda;

public class App {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		if(a == b) System.out.println("É igual");
		
		Usuario user = new Usuario("EITA",2002);
		Usuario user2 = new Usuario("EITA",2000);
		
		if(user.compareTo(user2)==0) System
		.out.println("São iguais");
	}
}
