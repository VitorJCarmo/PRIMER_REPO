package qaracter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Integer number=0;
		List<Integer> storage= new ArrayList<>();
		do {
		Scanner s = new Scanner(System.in);
		System.out.println("Inform any number: ");
		number = s.nextInt();
		if(number <= 0)
			storage.add(number);
		} while(number != -25);
		
		System.out.println("A total of : " +storage.size()+" numbers equal or less then zero was informed");
	}
}
