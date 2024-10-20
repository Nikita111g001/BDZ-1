import java.util.Scanner;

public class Main {
    public static char[] c = {'A', 'B', 'C'};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        move(n, 0, 2, 1);
    }

    public static void move(int n, int f, int t, int m) {
        if (n > 0) {
            move(n - 1, f, m, t);
            System.out.println("Move disk " + n + " from " + c[f] + " to " + c[t]);
            move(n - 1, m, t, f);
        }
    }
}

