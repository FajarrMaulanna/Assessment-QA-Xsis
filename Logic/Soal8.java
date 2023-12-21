package Logic.Assessment;

import java.util.Arrays;
import java.util.Scanner;

public class Soal8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Input deret angka : ");
		String angka[] = scan.nextLine().trim().split(" ");
		
		scan.close();
		
		/*Input :
		 * 1 4 2 5 3
		 * 1 2 2 7 3 0 8 6
		 */
		
		int intAngka[] = new int [angka.length];
		for(int i = 0; i < angka.length; i++) {
			intAngka[i] = Integer.parseInt(angka[i]);
		}
		
		Arrays.sort(intAngka);
		int max = 0;
		int min = 0;
		
		//Max
		for(int i = 1; i < intAngka.length; i++) {
			max = max + intAngka[i];
		}
		//Min
		for(int i = 0; i < intAngka.length - 1; i++) {
			min = min + intAngka[i];
		}
		System.out.println("MAX Sum : " + max);
		System.out.println("MIN Sum : " + min);
	}

}
