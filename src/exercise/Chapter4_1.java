package exercise;

import java.util.Scanner;

public class Chapter4_1 {

    //1. รับข้อมูลจำนวนเต็ม 10 จำนวน
    //2. หาผลรวมรของข้อมูลทั้งหมดแสดงทางหน้าจอภาพ *
    //3. หาค่าเฉลี่ยของข้อมูลทั้งหมดแสดงทางหน้าจอภาพ *
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input data from keyboard
        System.out.print("Enter an integer 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter an integer 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter an integer 3: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter an integer 4: ");
        int num4 = scanner.nextInt();
        System.out.print("Enter an integer 5: ");
        int num5 = scanner.nextInt();
        System.out.print("Enter an integer 6: ");
        int num6 = scanner.nextInt();
        System.out.print("Enter an integer 7: ");
        int num7 = scanner.nextInt();
        System.out.print("Enter an integer 8: ");
        int num8 = scanner.nextInt();
        System.out.print("Enter an integer 9: ");
        int num9 = scanner.nextInt();
        System.out.print("Enter an integer 10: ");
        int num10 = scanner.nextInt();

        int total = num1 + num2 + num3 + num4 +
                num5 + num6 + num7 + num8 + num9 + num10;
        int avg = total / 10;

        //display result
        System.out.println("Total : " + total);
        System.out.println("Average : " + avg);

    }

}
