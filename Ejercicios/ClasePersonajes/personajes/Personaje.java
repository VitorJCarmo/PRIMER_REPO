package personajes;

import java.util.Random;

public class Personaje {
	private Integer vida;
	private Integer ataque;
	private Integer defensa;
	private Integer velocidad;
	private String nombre;

	public Personaje(Integer vida, Integer ataque, Integer defensa, Integer velocidad, String nombre) {
		super();
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.nombre = nombre;
	}

	public void luchar(Personaje p) {
		calculaAtaque(p);
		calculaDefensa(p);
	}
	
	public double getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefensa() {
		return defensa;
	}


	public void setDefensa(Integer defensa) {
		this.defensa = defensa;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Personage " + nombre + "\nvida: " + vida + "\nataque: " + ataque + "\ndefensa: " + defensa
				+ "\nvelocidad: " + velocidad + "\nclasse: " + this.getClass().getSimpleName();

	}
	
	private Integer randomNum() {
		Random random = new Random();
		return random.nextInt(10 + 10) - 10;
	}
	
	private void calculaAtaque(Personaje p) {
		 Integer dano;
		 Integer golpes = getVelocidad() / p.getVelocidad();
		 System.out.println("golpes ataque: " + golpes);
		 golpes = golpes < 0 ? 1 : golpes + 1;
		 Integer num = randomNum();
		 if(num < 0)
			 dano = p.getAtaque() - getDefensa() - num;
		 else
			 dano = p.getAtaque() - getDefensa() + num;
		 System.out.println("dano ataque: " + dano);
		 setVida(vida-(dano*golpes));
	}
	
	private void calculaDefensa(Personaje p) {
		 Integer dano;
		 Integer golpes =  p.getVelocidad() / getVelocidad();
		 System.out.println("golpes defensa: " + golpes);
		 golpes = golpes < 0 ? 1 : golpes;
		 Integer num = randomNum();
		 if(num < 0)
			 dano = p.getAtaque() - getDefensa() - num;
		 else
			 dano = p.getAtaque() - getDefensa() + num;
		 System.out.println("dano defensa: " + dano);
		 p.setVida(vida-(dano*golpes));
	}
	
	
}
