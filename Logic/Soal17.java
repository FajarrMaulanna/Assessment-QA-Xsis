package Logic.Assessment;

import java.util.Scanner;

public class Soal17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Input perjalanan Hattori : ");
		String perjalanan[] = scan.nextLine().trim().split(" ");
		
		scan.close();
		
		//N N T N N N T T T T T N T T T N T N N N T 
		
		int gunung = 0;
		int lembah = 0;
		int count = 0;
		
		for(int i = 0; i < perjalanan.length; i++) {
			if(perjalanan[i].equalsIgnoreCase("N")) {
				count++;
				if(count == 0) {
					lembah += 1;
				}
			}
			else if(perjalanan[i].equalsIgnoreCase("T")) {
				count--;
				if(count == 0) {
					gunung += 1;
				}
			}			
		}
		
		System.out.println("Gunung : " + gunung);
		System.out.println("Lembah : " + lembah);
	}

}
