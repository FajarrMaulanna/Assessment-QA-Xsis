package Logic.Assessment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Soal2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input tanggal pinjam : ");
		String pinjam = scan.nextLine().trim();
		
		System.out.print("Input tanggal kembali : ");
		String kembali = scan.nextLine().trim();
		
		System.out.print("Jumlah buku pelajaran : ");
		int jmlPelajaran = scan.nextInt();
		
		System.out.print("Jumlah buku novel : ");
		int jmlNovel = scan.nextInt();
		
		System.out.print("Jumlah buku skripsi : ");
		int jmlSkripsi = scan.nextInt();
		
		scan.close();
		System.out.println();
		
		/*Input :
		 * 01/03/2019
		 * 15/06/2019
		 * 4
		 * 3
		 * 2
		 */
		
		long totDenda = 0;
		int dendaPelajaran = 2000;
		int dendaNovel = 5000;
		int dendaSkripsi = 10000;
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date datePinjam = dateFormat.parse(pinjam);
		Date dateKembali = dateFormat.parse(kembali);
		
		long diffMSec = dateKembali.getTime() - datePinjam.getTime();
		long diffHari = diffMSec / (24 * 60 * 60 * 1000);
		
		if(diffHari > 10) {
			totDenda = (diffHari - 10) * ((jmlPelajaran * dendaPelajaran) + (jmlNovel * dendaNovel) +(jmlSkripsi * dendaSkripsi));
			System.out.println("Anda telat mengembalikan buku selama " + (diffHari - 10) + " hari");
			System.out.println("Total denda buku anda adalah : Rp " + totDenda);
		}
		else {
			System.out.println("Terima kasih sudah mengembalikan buku dengan tepat waktu dalam " + diffHari + " hari");
		}
		
	}

}
