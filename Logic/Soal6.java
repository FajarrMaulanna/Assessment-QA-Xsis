package Logic.Assessment;

import java.util.Scanner;

public class Soal6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Kata : ");
		String kata = scan.nextLine().trim().toLowerCase();
		scan.close();
		
		String filter = kata.replaceAll("[^a-z0-9]+", "");
		String balik = "";
		for(int i = filter.length() - 1; i >= 0; i--) {
			balik += String.valueOf(filter.charAt(i));
		}
		
		if(balik.equals(filter)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}

	}

}
