import java.util.Scanner;

public class Main {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String d = s.nextLine();
        String[] p = d.split(" ");
        int dd = Integer.parseInt(p[0]);
        int mm = Integer.parseInt(p[1]);
        int yyyy = Integer.parseInt(p[2]);
        int y = yyyy - (mm < 3 ? 1 : 0);
        int m = (mm + 9) % 12 + 1;
        int w = (dd + (13 * m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
        String[] n = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println(n[w]);
    }
}
