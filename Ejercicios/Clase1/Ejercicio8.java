package qaracter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inform a number of the month: (1-12)");
		int number = s.nextInt();
		if(number < 1 || number > 12) {
			System.out.println("Inform a valid number");
			System.exit(1);
		}
		List<Month> months = new ArrayList<Month>();
		populateList(months);
		Month selectedMonth = months.get(number-1);
		System.out.println("The month is: " + selectedMonth.getName() + "\nThe number of days is: " + selectedMonth.getDays());
	}

	private static void populateList(List<Month> months) {
		
		Month jan = new Month("January", 31);
		months.add(jan);

		Month feb = new Month("February", 28);
		months.add(feb);

		Month mar = new Month("March", 31);
		months.add(mar);

		Month apr = new Month("April", 30);
		months.add(apr);

		Month may = new Month("May", 31);
		months.add(may);

		Month jun = new Month("June", 30);
		months.add(jun);

		Month jul = new Month("July", 31);
		months.add(jul);

		Month aug = new Month("August", 31);
		months.add(aug);

		Month sep = new Month("September", 30);
		months.add(sep);

		Month oct = new Month("October", 31);
		months.add(oct);

		Month nov = new Month("November", 30);
		months.add(nov);

		Month dec = new Month("December", 31);
		months.add(dec);
	}

}
