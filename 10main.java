import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String b = a.next();
        String c = a.next();
        int d = c.length();
        c += b;
        int[] e = new int[c.length()];
        int f = 0, g = 0;

        for (int i = 1; i < c.length(); ++i) {
            if (i <= g) {
                e[i] = Math.min(g - i + 1, e[i - f]);
            }
            while (i + e[i] < c.length() && c.charAt(e[i]) == c.charAt(i + e[i])) {
                ++e[i];
            }
            if (i + e[i] - 1 > g) {
                f = i;
                g = i + e[i] - 1;
            }
        }
        boolean fl = false;
        for (int j = d; j < c.length(); j++) {
            if (e[j] >= d) {
                fl = true;
                System.out.print(j - d + " ");
            }
        }
        if (!fl) System.out.println(-1);
    }
}
