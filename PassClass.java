import java.util.Scanner;
public class PassClass {
    public static void main(String[] args) {
        double math, physics, english, chem, music;
        double average, sum = 0, count = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Math grade: ");
        math = input.nextInt();
        if (math >= 0 && math <= 100) {
            sum += math;
            count++;
        }

        System.out.print("Physics grade: ");
        physics = input.nextInt();
        if (physics >= 0 && physics <= 100) {
            sum += physics;
            count++;
        }

        System.out.print("English grade: ");
        english = input.nextInt();
        if (english >= 0 && english <= 100) {
            sum += english;
            count++;
        }

        System.out.print("Chemistry grade: ");
        chem = input.nextInt();
        if (chem >= 0 && chem <= 100) {
            sum += chem;
            count++;
        }

        System.out.print("Music grade: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100) {
            sum += music;
            count++;
        }

        average = sum / count;
        if (average < 55) {
            System.out.println("You did not pass the class.");
        } else {
            System.out.println("Congratulation, you passed the class.");
        }
    }
}
