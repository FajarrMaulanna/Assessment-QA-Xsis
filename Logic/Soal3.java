package Logic.Assessment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Soal3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Masuk parkir : ");
		String masuk = scan.nextLine().trim();

		System.out.print("Keluar parkir : ");
		String keluar = scan.nextLine().trim();

		scan.close();
		System.out.println();

		/*
		 * 01/06/2019-13:00 04/06/2019-09:06
		 */

		long tarif = 0;
		int countHari = 0;
		int countJam = 0;

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm");
		Date dateMasuk = dateFormat.parse(masuk);
		Date dateKeluar = dateFormat.parse(keluar);

		long diffMSec = dateKeluar.getTime() - dateMasuk.getTime();
		long diffMin = diffMSec / (60 * 1000);

		while (diffMin >= 1440) {
			countHari += 1;
			diffMin -= 1440;
		}
		while (diffMin >= 60) {
			countJam += 1;
			diffMin -= 60;
		}

		// Per hari
		tarif = (countHari * 40000);
		// Per jam
		if (countJam > 1) {
			tarif = (tarif + 4000) + (2000 * (countJam - 1));
		}
		// hitung sisa menit
		if (diffMin > 0) {
			tarif = tarif + 2000;
		}
		System.out.println(countHari + " Hari " + countJam + " Jam " + diffMin + " Menit");
		System.out.println("Tarif : " + tarif);
	}

}
