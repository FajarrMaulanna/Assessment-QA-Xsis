package Logic.Assessment;

public class Soal21 {

	public static void main(String[] args) {
        int[] result = playManholeGame();
        printResult(result);
    }

    public static int[] playManholeGame() {
        int st = 0;
        int d = 0;

        int[] sequence = new int[20];

        int index = 0;

        while (d < 10) {
            if (st >= 2) {
                st -= 2;
                d += 3;
                sequence[index++] = 1;
            } else {
                st += 1;
                d += 1;
                sequence[index++] = 0;
            }

            if (st < 0) {               
                int[] failedResult = {-1};
                return failedResult;
            }
        }
        int[] result = new int[index];
        System.arraycopy(sequence, 0, result, 0, index);

        return result;
    }

    public static void printResult(int[] result) {
        if (result.length == 1 && result[0] == -1) {
            System.out.println("FAILED");
        } else {
            System.out.print("Urutan langkah minimal: ");
            for (int step : result) {
                System.out.print((step == 0 ? "Walk " : "Jump "));
            }
        }
    }
}
