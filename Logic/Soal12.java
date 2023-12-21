package Logic.Assessment;

import java.util.Arrays;
import java.util.Scanner;

public class Soal12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input deret angka (dipisah spasi) : ");
		String input = scan.nextLine().trim();
		
		scan.close();
		System.out.println("Input = " + input);
		String deretString[] = input.split(" ");
		
		int deretAngka[] = new int[deretString.length];
		
		for(int n = 0; n < deretAngka.length; n++) {
			deretAngka[n] = Integer.parseInt(deretString[n]);
		}
		System.out.println("Deret Angka = " + Arrays.toString(deretAngka));
		
		for(int i = 1; i < deretAngka.length; i++) {
			for(int j = 0; j < deretAngka.length - i; j++) {
				if(deretAngka[j] > deretAngka[j + 1]) {
					int asc = deretAngka[j];
					deretAngka[j] = deretAngka[j + 1];
					deretAngka[j + 1] = asc;
				}			
			}
		}
		System.out.println("Deret Ascending = " + Arrays.toString(deretAngka));
		
		for(int i = 1; i < deretAngka.length; i++) {
			for(int j = 0; j < deretAngka.length - i; j++) {
				if(deretAngka[j] < deretAngka[j + 1]) {
					int desc = deretAngka[j];
					deretAngka[j] = deretAngka[j + 1];
					deretAngka[j + 1] = desc;
				}			
			}
		}
		System.out.println("Deret Descending = " + Arrays.toString(deretAngka));
	}
}
