package bt;

import java.util.Scanner;

public class CurrencyConversion {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter USD :");
            double usd;
            usd = scanner.nextDouble();
            double vnd = usd * 23000;
            System.out.println(usd + "equivalent :" + vnd + "VND");
        }
    }
