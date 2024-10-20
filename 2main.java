import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String i = s.nextLine();
        StringBuilder o = new StringBuilder();
        int c = 1;
        for (int j = 1; j < i.length(); j++) {
            if (i.charAt(j) == i.charAt(j - 1)) {
                c++;
            } else {
                o.append(i.charAt(j - 1)).append(c);
                c = 1;
            }
        }
        if (i.length() > 0) {
            o.append(i.charAt(i.length() - 1)).append(c);
        }
        System.out.print(o.toString());
    }
}

