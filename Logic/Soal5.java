package Logic.Assessment;

import java.util.Scanner;

public class Soal5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input nilai n : ");
		int x = scan.nextInt();
		scan.close();
		
		int num1 = 0, num2 = 1, num3 = 0, i = 0;
		
		System.out.print("Fibbonaci : ");
		
        while (i <= x) {
            System.out.print(num1 + " ");
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            i++;
        }
	}
}
