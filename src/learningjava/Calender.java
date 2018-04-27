package learningjava;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Month");
		int month = input.nextInt();
		System.out.println("Enter the Year");
		int year = input.nextInt();
		input.close();

		if(month == 2) {
			if(year%400 == 0 || year%4 == 0 || year%100==0 && year%4==0)
				System.out.println(month+"   "+year+"   "+"29 days ");
			else
				System.out.println(month+"   "+year+"   "+"28 days ");
		}
		else if (month%2==1 && month!=8)
			System.out.println(month+"   "+year+"   "+"30 days ");
		else 
			System.out.println(month+"   "+year+"   "+"31 days ");
}

}
