package Logic.Assessment;

import java.util.Scanner;

public class Soal20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("jarak awal  A & B:");
		int jarakAwal = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Masukkan urutan suit  oleh A (Gunting/Kertas/Batu):");
		String suitA = scanner.nextLine().toUpperCase();

		System.out.println("Masukkan urutan suit  oleh B (Gunting/Kertas/Batu):");
		String suitB = scanner.nextLine().toUpperCase();

		String winner = determineWinner(jarakAwal, suitA, suitB);
		System.out.println("Pemenangnya adalah: " + winner);

		scanner.close();
	}
	
	public static String determineWinner(int jrkAwal, String suitA, String suitB) {
		int jarak = jrkAwal;

		for (int i = 0; i < suitA.length(); i++) {
			if (jarak <= 0) {
				return "A";
			} 
			else if (jarak >= 4) {
				return "B";
			}

			char moveA = suitA.charAt(i);
			char moveB = suitB.charAt(i);

			if (moveA == 'G' && moveB == 'K' || moveA == 'K' && moveB == 'B' || moveA == 'B' && moveB == 'G') {
				jarak -= 1;
			} 
			else if (moveA == 'K' && moveB == 'G' || moveA == 'B' && moveB == 'K' || moveA == 'G' && moveB == 'B') {
				jarak += 2;
			}
		}

		if (jarak == 0) {
			return "Draw";
		} 
		else if (jarak < 0) {
			return "A";
		} 
		else {
			return "B";
		}
	
	}
}
