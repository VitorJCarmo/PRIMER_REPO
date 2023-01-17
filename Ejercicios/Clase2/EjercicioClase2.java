package qaracter;

import java.util.Scanner;

public class EjercicioClase2 {

	public static void main(String[] agrs) {
		Scanner s = new Scanner(System.in);
		System.out.println("Type a number for the size of the array of passwords: ");
		Integer size = s.nextInt();

		Password[] arrayPws = new Password[size];

		Scanner spws = new Scanner(System.in);
		System.out.println("Type a number for the size of the passwords: ");
		Integer sizePasswords = spws.nextInt();

		fillArray(arrayPws, sizePasswords);
		
		Password[] copyPws = arrayPws.clone();
		sortArray(copyPws);
		
		System.out.println("Contraseñas ordenadas: ");
		for (short i = 0; i < copyPws.length; i++) {
			System.out.println(copyPws[i].getContrasena());
		}
		
		System.out.println("Todas las contraseñas: ");
		for (short i = 0; i < arrayPws.length; i++) {
			System.out.println(arrayPws[i].getContrasena() + " "+ Password.esFuerte(arrayPws[i].getContrasena()));
		}
	}

	private static void fillArray(Password[] passwords, Integer sizePasswords) {
		for (short i = 0; i < passwords.length; i++) {
			Password newPassword = new Password(sizePasswords);
			passwords[i] = newPassword;
		}
	}

	private static void sortArray(Password[] password) {
		Password aux;
		for (int i = 0; i < password.length; i++) {
			for (int j = i + 1; j < password.length; j++) {
				int compare = password[i].getContrasena().compareToIgnoreCase(password[j].getContrasena());
				if (compare > 0) {
					aux = password[i];
					password[i] = password[j];
					password[j] = aux;
				}
			}
		}
	}
}
