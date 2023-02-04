import java.util.Scanner;

public class CircleSegmentArea {
    public static void main(String[] args) {
        int r, angle;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        r = input.nextInt();
        System.out.print("Enter central angle (in degree) of the circle: ");
        angle = input.nextInt();
        System.out.println("Area of the segment of the circle: " + (pi*r*r*angle)/360);
    }

}