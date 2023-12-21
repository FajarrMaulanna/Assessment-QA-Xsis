package Logic.Assessment;

import java.util.Scanner;

public class Soal15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input jam 12H/24H : ");
		String input = scan.nextLine().trim();
		scan.close();
		
		int jam = Integer.parseInt(input.substring(0, 2));
		int menit = Integer.parseInt(input.substring(3, 5));
		String format = input.substring(input.length()-2);
		
		//PM 12:00 - 23:59
		//AM 00:00 - 11:59
		
		//Input : 13:00 AM
		
		if(format.equalsIgnoreCase("PM")) {
			if(jam < 12) {
				jam += 12;
				System.out.println(jam + ":" + menit);
			}
			else {
				System.out.println(jam + ":" + menit);
			}
		}
		else if(format.equalsIgnoreCase("AM")) {
			if(jam >= 12) {
				jam -= 12;
				System.out.println(jam + ":" + menit);
			}
			else {
				System.out.println(jam + ":" + menit);
			}
		}
		else if(jam >= 12) {
			jam -= 12;
			System.out.println(jam + ":" + menit + " PM");
		}
		else {
			System.out.println(jam + ":" + menit + " AM");
		}
	}

}
