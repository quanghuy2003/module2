package BT3;

import java.util.Scanner;

public class DiagonalSumCalculating {
    public static void main(String[] args) {
        int[][] array={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int sum=0;
        for (int i=0;i< array.length;i++){
            sum+=array[i][i];
        }
        System.out.println("Tổng đường chéo là: "+sum);
    }
}
