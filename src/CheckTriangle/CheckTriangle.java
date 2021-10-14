package CheckTriangle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");

        a = sc.nextInt();
        System.out.print("Nhập b: ");
        b = sc.nextInt();
        System.out.print("Nhập c: ");
        c = sc.nextInt();
        checkTriangle(a, b, c);
//        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

    }

    public static void checkTriangle(int a, int b, int c) {
        boolean check1 = a > 0 && b > 0 && c > 0;
        boolean check2 = a + b > c && b + c > a && c + a > b;
        boolean check3 = a == b || b == c || c == a;
        boolean check4 = a == b && b == c;
        if (check1 && check2) {
            if (check4) {
                System.out.println("đây là tam giác đều");
            } else if (check3) {
                System.out.println("đây là tam giác cân");
            } else {
                System.out.println("đây là tam giác");
            }
        } else {
            System.out.println("đây ko phải tam giác");
        }
    }
}
