package TH4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiefu rộng ");
        double width = scanner.nextDouble();
        System.out.print("nhập chiều dài");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("hình chữ nhật của bạn \n" + rectangle.display());
        System.out.println("Chu vi của Hình chữ nhật: " + rectangle.getPerimeter());
        System.out.println("diện tích hình chữ nhật: " + rectangle.getArea());
    }
}
