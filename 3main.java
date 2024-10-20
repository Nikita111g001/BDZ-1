import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int[] b = new int[m];
        for (int j = 0; j < m; j++) {
            b[j] = s.nextInt();
        }
        System.out.print(b[0] + " ");
        for (int j = 1; j < m; j++) {
            if (b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
            }
        }
    }
}

