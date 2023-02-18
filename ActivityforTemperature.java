/**
 * Suggest to "Ski" if the temperature is less than 5.
 * Suggest the "Cinema" event if the temperature is between 5 and 15.
 * Suggest "Picnic" event if the temperature is between 10 and 25.
 * Suggest the "Swimming" event if the temperature is greater than 25.
 */

import java.util.Scanner;
public class ActivityforTemperature {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("You can ski");
        } if (heat >= 5 & heat <= 15) {
            System.out.println("You can go to the cinema");
        } if (heat >= 10 & heat <= 25) {
            System.out.println("You can go for a picnic");
        } else if (heat > 25) {
            System.out.println("You can go swimming");
        }
    }
}
