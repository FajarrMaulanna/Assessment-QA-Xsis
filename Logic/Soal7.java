package Logic.Assessment;

import java.util.Arrays;
import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Input deret bilangan : ");
		String deret[] = scan.nextLine().trim().split(" ");
		
		scan.close();
		
		//8 7 0 2 7 1 7 6 3 0 7 1 3 4 6 1 6 4 3
		
		int intAngka[] = new int [deret.length];
		for(int i = 0; i < deret.length; i++) {
			intAngka[i] = Integer.parseInt(deret[i]);
		}
		
		Arrays.sort(intAngka);
		
		double mean = 0;
		double median = 0;
		int modus = 0;
		int count2 = 0;
		
		//Mean
		for(int i = 0; i < intAngka.length; i++) {
			mean = mean + intAngka[i];
		}
		mean = mean / intAngka.length;
		
		//Median
		if(intAngka.length % 2 == 1) {
			median = intAngka[(intAngka.length + 1) / 2];
		}
		else {
			median = (intAngka[intAngka.length / 2] + intAngka[(intAngka.length + 1) / 2]) / 2;
		}
		
		//Modus
		for (int i = 0; i < intAngka.length; ++i) {
			int count = 0;
			for (int j = 0; j < intAngka.length; ++j) {
				if (intAngka[j] == intAngka[i])
					++count;
			}
			if (count > count2) {
				count2 = count;
				modus = intAngka[i];
			}
		}
		
		System.out.print("Deret bilangan : ");
		for(int i = 0; i < intAngka.length; i++) {
			System.out.print(intAngka[i] + " ");
		}
		System.out.println();
		System.out.println("Mean = " + mean);
		System.out.println("Median = " + median);
		System.out.println("Modus = " + modus);
	}

}
