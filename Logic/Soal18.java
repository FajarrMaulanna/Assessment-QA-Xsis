package Logic.Assessment;

public class Soal18 {

	public static void main(String[] args) {
        int[] jamMakan = {9, 13, 15, 17};
        int[] kalori = {30, 20, 50, 80};
        int jamMulaiOlahraga = 18;

        int totalKalori = hitungTotalKalori(jamMakan, kalori, jamMulaiOlahraga);
        double waktuOlahraga = hitungWaktuOlahraga(totalKalori);
        int jumlahAir = hitungJumlahAir(waktuOlahraga);

        System.out.println("Donna meminum " + jumlahAir + " cc air selama berolahraga.");
    }

    public static int hitungTotalKalori(int[] jamMakan, int[] kalori, int jamMulaiOlahraga) {
        int totalKalori = 0;

        for (int i = 0; i < jamMakan.length; i++) {
            if (jamMakan[i] < jamMulaiOlahraga) {
                totalKalori += kalori[i];
            }
        }

        return totalKalori;
    }

    public static double hitungWaktuOlahraga(int totalKalori) {
        return 0.1 * totalKalori;
    }

    public static int hitungJumlahAir(double waktuOlahraga) {
        int jumlahAir = 0;

        while (waktuOlahraga >= 0.5) {
            jumlahAir += 100;
            waktuOlahraga -= 0.5;
        }

        jumlahAir += 500;

        return jumlahAir;
    }

}
