package Logic.Assessment;

import java.util.Scanner;

public class Soal16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Input harga makanan : ");
		String harga[] = scan.nextLine().trim().split(" ");
		
		scan.close();
		
		/*Input :
		 * 33 45 15 80
		 */
		
		double intHarga[] = new double[harga.length];
		for(int i = 0; i < harga.length; i++) {
			   intHarga[i] = Integer.parseInt(harga[i]);
		}
		
		double totalAnak1 = 0;
		double totalAnakLainnya = 0;
		double total = 0;
		
		for(int i = 0; i < intHarga.length; i++) {
			total = total + intHarga[i];
		}
		total = total + (total * 15 / 100);
		
		for(int i = 0; i < intHarga.length; i++) {
			if(i == 0) {
				totalAnak1 = totalAnak1 + 0;
				totalAnakLainnya = totalAnakLainnya + ((intHarga[i] + (intHarga[i] * 15 / 100)) / 3);
			}
			else {
				totalAnak1 = totalAnak1 + ((intHarga[i] + (intHarga[i] * 15 / 100)) / 4);
				totalAnakLainnya = totalAnakLainnya + ((intHarga[i] + (intHarga[i] * 15 / 100)) / 4);
			}
		}
		
		System.out.println("Total Pembayaran : " + total);
		System.out.println("Total yang harus dibayar anak yang alergi : " + totalAnak1);
		System.out.println("Total yang harus dibayar anak lainnya : " + totalAnakLainnya);

	}

}
