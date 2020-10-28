package exercise;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gender(m/f): ");
        String gender = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter weight(kg): ");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter height(cm): ");
        double height = Double.parseDouble(scanner.nextLine());
        double bmr = 0;
        if (gender == "m") {
             bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;

        }else {
             bmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;

        }
        System.out.println("Your BMR is: "+bmr);

        System.out.println("How about your activity? ");
        System.out.println("1. No exercise");
        System.out.println("2. exercise 1-3 day per week");
        System.out.println("3. exercise 3-5 day per week");
        System.out.println("4. exercise 6-7 day per week");
        System.out.println("5. heavy exercise or sportsman");
        System.out.print("Select ?:");
        int seclect = Integer.parseInt(scanner.nextLine());
        double tdee = 0;
        if (seclect == 1){
            tdee = bmr * 1.2;
        } else if (seclect == 2) {
            tdee = bmr * 1.375;
        }
        else if (seclect == 3) {
            tdee = bmr * 1.55;
        } else if (seclect == 4) {
            tdee = bmr * 1.725;
        } else {
            tdee = bmr * 1.99;
        }

        System.out.println("Your TDEE is: "+tdee);
    }
}
