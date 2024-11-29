import java.util.Scanner;

public class Spaces {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String test = "hello world, welcome";
        char c;
        char blank = ' ';
        for (int i = 0; i < test.length(); i++) {
            c = test.charAt(i);

            if (c == blank) {
                System.out.println();
            } else {
                System.out.print(c);
            }

        }
    }
}
