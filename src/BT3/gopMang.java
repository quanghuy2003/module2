package BT3;

import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int arr1[];
        int arr2[];
        int arr3[];
        int size1;
        int size2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập chiều dài của mảng 1:");
        size1 = scanner.nextInt();
                System.out.println("nhập mảng 1");
                arr1 = new int[size1];
    for (int i = 0; i<arr1.length;i++){
        System.out.print("nhập phần tử   " );
        arr1[i] = scanner.nextInt();
    }
        System.out.println("nhập chiều dài của mảng 2:");
        size2 = scanner.nextInt();
        System.out.print("nhập mảng 2");
        arr2 = new int[size2];
        for (int i = 0; i<arr2.length;i++){
            System.out.print("nhập phần tử   " );
            arr1[i] = scanner.nextInt();
        }
        arr3=new int[size1+size2];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        int n=0;
        for (int i=size1;i<arr3.length;i++){
            arr3[i]=arr2[n];
            n++;
        }
        for (int j : arr3) {
            System.out.println(j);
        }

    }
}
