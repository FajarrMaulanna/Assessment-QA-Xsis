package Logic.Assessment;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input kalimat : ");
		String input = scan.nextLine().trim();
		scan.close();
		
		String array[] = input.split(" ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i].charAt(0) + "***" + array[i].charAt(array[i].length() - 1) + " ");
		}
	}

}
