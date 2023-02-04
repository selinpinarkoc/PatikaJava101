import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double height, weight, bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height (in meter): ");
        height = input.nextDouble();
        System.out.print("Enter weight (in kg): ");
        weight = input.nextDouble();
        bmi = weight / (height * height);
        System.out.print("Your body mass index: " + bmi);
    }
}
