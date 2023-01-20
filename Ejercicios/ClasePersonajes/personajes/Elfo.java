package personajes;

public class Elfo extends Personaje{

	public Elfo(Integer vida, Integer ataque, Integer defensa, Integer velocidad, String nombre) {
		super(vida, ataque, defensa, velocidad, nombre);
	}

	public void especialElfo() {
		System.out.println("Especial elfo ...");
	}
}
