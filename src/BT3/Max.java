package BT3;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int a[] =new int[5];
        Scanner sc = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            if (i == 0){
                max = a[i];
            }else if(a[i] > max){
                max = a[i];
            }
        }
        System.out.print("số lớn nhất là "+ max);
    }
}
