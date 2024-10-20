import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] t = new int[n][];
        for (int i = 0; i < n; i++) {
            t[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                t[i][j] = s.nextInt();
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                t[i][j] += Math.max(t[i + 1][j], t[i + 1][j + 1]);
            }
        }
        System.out.println(t[0][0]);
    }
}
