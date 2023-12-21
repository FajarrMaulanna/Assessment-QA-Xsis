package Logic.Assessment;

import java.util.Scanner;

public class Soal11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input kata : ");
		String input = scan.nextLine().trim();
		scan.close();
		
		int star = input.length()/2;		
		String array[] = input.split("");
		
		for(int i = array.length - 1; i >= 0; i--) {
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.print(array[i]);
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
