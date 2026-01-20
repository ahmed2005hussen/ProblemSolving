import java.util.Scanner;

public class Orthogonality {

    /*
        Authour: Ahmed Hussein
        Judge: atcoder
        Link: https://atcoder.jp/contests/abc188/tasks/abc188_b?lang=en
        Date: 20/01/2026
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        int res = 0;
        for (int i = 0; i < n; i++) {

            res += a[i] * input.nextInt();
        }

        if ((res == 0)) {
            System.out.println("Yes");
        } else {
            System.out.print("No");
        }
    }
}