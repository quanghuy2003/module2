package bt;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name;
        name=scanner.nextLine();
        System.out.println("hello "+name);
    }

}


