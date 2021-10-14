package BT3;

import java.util.Scanner;

public class sumOfSpecificColumn {
    public static void main(String[] args) {
        int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Cột để tính tổng: ");
        int colNumber=scanner.nextInt();
        int sum=0;
        for (int i=0;i< array.length;i++){
            sum+=array[i][colNumber];
        }
        System.out.println("Tổng của cột "+colNumber+" là: "+sum);
    }
}
