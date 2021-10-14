package Minitest;

import test.Book;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a size : ");
        int size = scanner.nextInt();
        product[] list = new product[size];
        product[] book;
        input(list);
        findProducts(list);
        System.out.println("Tổng tiền các sản phẩm là :" + sumPrice(list));
    }
    public static void input(product[] listBook) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listBook.length; i++) {
            System.out.println("nhập mã của sp : ");
            int code = scanner.nextInt();
            System.out.println("nhập vào tên sp : ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("nhập vào giá của sp : ");
            double price = scanner.nextDouble();
            System.out.println("nhập kiểu sp : ");
            scanner.nextLine();
            String type = scanner.nextLine();
            System.out.println("nhập đơn vị tiền tệ : ");
            String currencyUnit = scanner.nextLine();
        }
    }
    public static void output(product[] listBook) {
        for (Minitest.product product : listBook) {
            System.out.println(product);
        }
    }
    public static void findProducts(product[] listBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên sản phẩm muốn tìm: ");
        String name = scanner.nextLine();
        for (Minitest.product product : listBook) {
            if (name.equals(product.getName())) {
                System.out.println("Trong list có sản phẩm này. " + product);
                return;
            }
        }
        System.out.println("Trong list ko có sảm phẩm này ");

    }

    public static double sumPrice(product[] listBook) {
        double sumPrice = 0;
        for (int i = 0; i < listBook.length; i++) {
            sumPrice += listBook[i].getPrice();
        }
        return sumPrice;
    }

}
