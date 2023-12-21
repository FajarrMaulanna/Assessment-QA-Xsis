package Logic.Assessment;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Soal13 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Input jam hh:mm AM/PM : ");
		String waktu = scan.nextLine().trim();
		
		scan.close();
		
		/* 03:15
		 * 06:00
		 * 09:00
		 * 12:00
		 * 05:30
		 * 02:20
		 * 03:16
		 */
		
		DateFormat dateFormat = new SimpleDateFormat("hh:mm");
		Date time = dateFormat.parse(waktu);
		
		float jam = Integer.parseInt(new SimpleDateFormat("h").format(time));
		float menit = Integer.parseInt(new SimpleDateFormat("m").format(time));
		
		double sudut = Math.abs((jam * 30) + ((menit * 30 / 60)) - (menit * 6));
		
		if(sudut > 180 && sudut < 360) {
			sudut -= 180;
		}
		else if(sudut >= 360) {
			sudut -= 360;
		}
		
		System.out.println("Sudut terkecil : " + sudut + " derajat");
	}

}
