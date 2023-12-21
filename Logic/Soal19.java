package Logic.Assessment;

import java.util.Scanner;

public class Soal19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// We promptly judged antique ivory buckles for the next prize
		// the quick brown fox jumps over the lazy dog
		// We promptly judged antique ivory buckles for the prize
		// Felix bawa vodka dan zat halogen dari Aljunied sampai Clarke Quay
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Input Kalimat : ");
		String kalimat = scan.nextLine().trim().toLowerCase();
		
		scan.close();
		System.out.println();
		
		boolean huruf[] = new boolean[26];		
		int index = 0;
		int miss = 0;
		
	    for (int i = 0; i < kalimat.length(); i++) {
	    	if ( kalimat.charAt(i) >= 'a' && kalimat.charAt(i) <= 'z') {
	    		index = kalimat.charAt(i) - 'a';
	    		huruf[index] = true;
	        }
	    }
	    for(int i = 0; i < huruf.length; i++) {
	    	if(huruf[i] == false) {
	    		miss += 1;
	    	}
	    }
	    if(miss >= 1) {
	    	System.out.println("Kalimat ini Bukan Pangram");
	    	System.out.print("Huruf yang hilang : ");
	    	for(int i = 0; i < huruf.length; i++) {
	    		if(huruf[i] == false) {  			
	    			System.out.print((char)(65 + i) + " ");
	    		}
	    	}
	    	
	    }
	    else {
	    	System.out.println("Kalimat ini Pangram");
	    }
	}
}
