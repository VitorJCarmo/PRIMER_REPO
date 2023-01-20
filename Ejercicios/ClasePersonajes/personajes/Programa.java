package personajes;

public class Programa {

	public static void main(String[] args) {
		Humano vitor = new Humano(100, 20, 20, 1, "Vitor");
		Elfo john = new Elfo(100, 15, 25, 2, "John");
		Orco argon = new Orco(120, 25, 15, 1, "Argon");
		
		System.out.println(vitor.toString());
		System.out.println(argon.toString());
		
		vitor.luchar(argon);
		john.luchar(argon);
		
		System.out.println(vitor.getVida());
		System.out.println(argon.getVida());
		System.out.println(john.getVida());
		
		
		vitor.especialHumano();
		argon.souUnOrco();
	}

}
