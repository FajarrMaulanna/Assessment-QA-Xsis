package Logic.Assessment;

import java.util.Arrays;
import java.util.Scanner;

public class Soal14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan deret angka (pisahkan dengan spasi): ");
        String input = scanner.nextLine().trim();
        String[] deretString = input.split(" ");
        
        int[] deretarr = Arrays.stream(deretString).mapToInt(Integer::parseInt).toArray();

        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        int[] change = changederet(deretarr, n);
        System.out.println("Hasil deret angka: " + Arrays.toString(change));

        scanner.close();

	}
	
	public static int[] changederet(int[] arr, int n) {
        int length = arr.length;

        n = n % length;

        int[] hasil = new int[length];

        for (int i = 0; i < length; i++) {
            int newIndex = (i + length - n) % length;
            hasil[newIndex] = arr[i];
        }

        return hasil;
	}

}
