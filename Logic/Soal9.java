package Logic.Assessment;

import java.util.Scanner;

public class Soal9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input nilai N : ");
		int n = scan.nextInt();
		scan.close();
		
		int m = 0;
		
		System.out.print("Deret Bilangan N \t: ");
		for(int i = 1; i <= n; i++) {
			m = m + n;
        	System.out.print(m + "\t");
        }
    }
}
