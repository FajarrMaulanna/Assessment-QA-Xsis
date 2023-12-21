package Logic.Assessment;

import java.util.Scanner;

public class Soal4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input nilai n : ");
		int n = scan.nextInt();
		scan.close();
		
		System.out.print("Deret Bilangan Prima \t: ");
		for(int i = 1; i <= n; i++) {
        	System.out.print(i * 2 - 1 + "\t");
        }
    }
}
