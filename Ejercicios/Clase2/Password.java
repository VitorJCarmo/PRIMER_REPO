package qaracter;

import java.security.SecureRandom;
import java.util.Objects;

public class Password {
	private Integer longitud;
	private String contrasena;

	public Password() {
		super();
		this.longitud = 8;
	}

	public Password(Password pws) {
		super();
		this.longitud = pws.longitud;
		this.contrasena = pws.contrasena;
	}

	public Password(Integer longitud) {
		super();
		this.longitud = longitud;
		this.contrasena = generarPassword(longitud);
	}

	public Integer getLongitud() {
		return longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public static boolean esFuerte(String contrasena) {
		return validateString(contrasena);
	}

	private static boolean validateString(String contrasena) {
		Integer digits = 0;
		Integer upperCases = 0;
		Integer lowerCases = 0;
		char ch;
		for (int i = 0; i < contrasena.length(); i++) {
			ch = contrasena.charAt(i);
			if (Character.isDigit(ch)) {
				digits++;
			} else if (Character.isUpperCase(ch)) {
				upperCases++;
			} else if (Character.isLowerCase(ch)) {
				lowerCases++;
			}
		}

		if (digits > 5 && upperCases > 2 && lowerCases > 1)
			return true;
		else
			return false;
	}

	private String generarPassword(Integer longitud) {
		final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom rnd = new SecureRandom();
		StringBuilder sb = new StringBuilder(longitud);
		for (int i = 0; i < longitud; i++)
			sb.append(AB.charAt(rnd.nextInt(AB.length())));
		return sb.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(contrasena, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Password other = (Password) obj;
		return Objects.equals(contrasena, other.contrasena) && Objects.equals(longitud, other.longitud);
	}

}
