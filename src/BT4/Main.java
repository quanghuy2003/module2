package BT4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a,b,c để tính nghiệm :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDelta() < 0) {
            System.out.println("phương trình vô nghiệm");
        }
        System.out.println(quadraticEquation.disPlay());
    }
}
