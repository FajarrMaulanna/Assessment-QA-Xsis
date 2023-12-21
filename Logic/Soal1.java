package Logic.Assessment;
import java.util.Arrays;
import java.util.Scanner;

public class Soal1 {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

			System.out.print("Input Jumlah Uang : ");
			int uang = Integer.parseInt(scan.nextLine());
			
			System.out.print("Masukan 3 harga kacamata : ");
			String kacamata[] = scan.nextLine().trim().split(", ");
			
			System.out.print("Masukan 3 harga baju : ");
			String baju[] = scan.nextLine().trim().split(", ");
			
			System.out.print("Masukan 3 harga sepatu : ");
			String sepatu[] = scan.nextLine().trim().split(", ");
			
			System.out.print("Masukan 3 harga buku : ");
			String buku[] = scan.nextLine().trim().split(", ");
			
			scan.close();
			
			int intKacamata[] = new int[kacamata.length];
			int intBaju[] = new int[baju.length];
			int intSepatu[] = new int[sepatu.length];
			int intBuku[] = new int[buku.length];
			
	        int count = 0;
	        String messagekacamata = " ";
	        String messagebaju = " ";
	        String messagesepatu = " ";
	        String messagebuku = " ";
	        String message = " ";
	        
	        for(int i = 0; i < kacamata.length; i++) {
				intKacamata[i] = Integer.parseInt(kacamata[i]);
			}
			for(int i = 0; i < baju.length; i++) {
				intBaju[i] = Integer.parseInt(baju[i]);
			}
			for(int i = 0; i < sepatu.length; i++) {
				intSepatu[i] = Integer.parseInt(sepatu[i]);
			}
			for(int i = 0; i < buku.length; i++) {
				intBuku[i] = Integer.parseInt(buku[i]);
			}

	        Arrays.sort(intKacamata);
	        Arrays.sort(intBaju);
	        Arrays.sort(intSepatu);
	        Arrays.sort(intBuku);
	        
	        int iKacamata = 0;
	        int iBaju = 0;
	        int iSepatu = 0;
	        int iBuku = 0;
	        
	        for (iKacamata = 0; iKacamata < intKacamata.length && uang >= intKacamata[iKacamata]; iKacamata++) {
	            uang -= intKacamata[iKacamata];
	            count++;
	            messagekacamata = "kaca_mata " + intKacamata[iKacamata];
	            if (messagekacamata != null && !messagekacamata.isEmpty()) {
	                message += messagekacamata + " ";
	            }
	            for (iBaju = 0;iBaju < intBaju.length && uang >= intBaju[iBaju]; iBaju++) {
	                uang -= intBaju[iBaju];
	                count++;
	                messagebaju += "baju "+intBaju[iBaju];
	                if (messagebaju != null && !messagebaju.isEmpty()) {
	                    message += messagebaju+ " ";
	                }

	                for (iSepatu = 0; iSepatu < intSepatu.length && uang >= intSepatu[iSepatu]; iSepatu++) {
	                    uang -= intSepatu[iSepatu];
	                    count++;
	                    messagesepatu = "sepatu "+intSepatu[iSepatu];
	                    if (messagesepatu != null && !messagesepatu.isEmpty()) {
	                        message += messagesepatu + " ";
	                    }
	                    for (iBuku=0; iBuku < intBuku.length && uang >= intBuku[iBuku]; iBuku++) {
	                        uang -= intBuku[iBuku];
	                        count++;
	                        messagebuku = "buku "+intBuku[iBuku];
	                        // iBuku++;
	                        if (messagebuku != null && !messagebuku.isEmpty()) {
	                            message += messagebuku + " ";
	                        }
	                    }
	                }	            
	            }	           
	        }
	        System.out.println("Jumlah item yang dibeli: "+count);
	        System.out.print("("+message+")");
	    }

}
