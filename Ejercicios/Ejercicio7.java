package qaracter;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		System.out.println("Inform any hour: ");
		Integer h = sh.nextInt();
		Scanner sm = new Scanner(System.in);
		System.out.println("Inform any minute: ");
		Integer m = sm.nextInt();
		Scanner ss = new Scanner(System.in);
		System.out.println("Inform any second: ");
		Integer s = ss.nextInt();
		
		boolean validation = validateHour(h,m,s);

		if (validation)
			System.out.println("The hour is valid");
		else
			System.out.println("The hour is not valid");
	}
	
	private static boolean validateHour(Integer h, Integer m, Integer s) {
		if(h < 0 || h > 24) {
			return false;
		}
		
		if(m < 0 || m > 59) {
			return false;
		}
		
		if(s < 0 || s > 59) {
			return false;
		}
		
		return true;
	}

}
