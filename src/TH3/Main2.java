package TH3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của học sinh:");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của các sinh viên trong danh sách " + input_name + " là: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy" + input_name + " trong danh sách.");
        }
    }
}
