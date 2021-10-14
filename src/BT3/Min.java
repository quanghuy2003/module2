package BT3;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        int a[] =new int[5];
        Scanner sc = new Scanner(System.in);
        int min = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            if (i == 0){
                min = a[i];
            }else if(a[i] < min){
                min = a[i];
            }
        }
        System.out.print("số nhỏ nhất là "+ min);
    }
}
