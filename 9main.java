import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        int[] b = new int[10];
        char[] d = new char[t.length()];
        for (int i = 0; i < t.length(); i++) {
            d[i] = t.charAt(i);
            b[d[i] - '0']++;
        }
        p(b, "", t.length());
    }
    public static void p(int[] b, String r, int l) {
        if (l == 0) {
            System.out.print(r + " ");
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (b[i] > 0) {
                if (l != b.length && (i != 0 || r.length() > 0)) {
                    b[i]--;
                    p(b, r + i, l - 1);
                    b[i]++;
                }
            }
        }
    }
}

