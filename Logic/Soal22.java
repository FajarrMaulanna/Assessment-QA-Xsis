package Logic.Assessment;

public class Soal22 {
	public static void main(String[] args) {
		int[] panjangLilin = { 3, 3, 9, 6, 7, 8, 23 };

		int hasil = lilinPertamaHabisMeleleh(panjangLilin); 

		if (hasil != -1) {
			System.out.println("Lilin yang paling pertama habis meleleh: Lilin ke-" + hasil);
		} else {
			System.out.println("Semua lilin meleleh.");
		}

	}

	public static int lilinPertamaHabisMeleleh(int[] panjangLilin) {
		int n = panjangLilin.length;

		if (n <= 2) {
			return n;
		}

		int a = 1, b = 1;
		int c = 0;
		int i = 2;

		while (i < n) {
			c = panjangLilin[i];
			int melted = a + b;
			if (c <= melted) {
				return i + 1;
			}
			a = b;
			b = melted;
			i++;
		}

		return -1;
	}
}
