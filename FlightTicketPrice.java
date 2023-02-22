import java.util.Scanner;
public class FlightTicketPrice {
    public static void main(String[] args) {
        int distance, age, type;
        double perKM = 0.10, amount, discountedOW = 0, discountedRT = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in km: ");
        distance = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter the type of the travel (1 => One way , 2 => Round trip ): ");
        type = input.nextInt();
        System.out.print("\n");

        if (distance < 0 || age < 0) {
            System.out.print("Incorrect data entry");
        } else {
            amount = distance * perKM;

            if (age < 12) {
                discountedOW = amount - (amount * 0.5);
                discountedRT = (discountedOW - (discountedOW * 0.2)) * 2;
            } else if (age >= 12 && age <= 24) {
                discountedOW = amount - (amount * 0.1);
                discountedRT = (discountedOW - (discountedOW * 0.2)) * 2;
            } else if (age > 65) {
                discountedOW = amount - (amount * 0.3);
                discountedRT = (discountedOW - (discountedOW * 0.2)) * 2;
            } else {
                discountedOW = amount;
                discountedRT = (discountedOW - (discountedOW * 0.2)) * 2;
            }

            switch (type){
                case 1:
                    System.out.print("Total Amount: " + discountedOW  + " TL");
                    break;
                case 2:
                    System.out.print("Total Amount: " + discountedRT + " TL");
                    break;
            }
        }
    }
}
