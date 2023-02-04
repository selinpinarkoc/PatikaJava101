import java.util.Scanner;
public class GroceryCheckout {
    public static void main(String[] args) {
        double perKgPear = 2.14, perKgApple = 3.67, perKgTomato = 1.11, perKgBanana = 0.95, perKgEggplant = 5, total;
        int kgOfPears, kgOfApples, kgOfTomatoes, kgOfBananas, kgOfEggplants;
        Scanner input = new Scanner(System.in);
        System.out.print("How many kg of pears: ");
        kgOfPears = input.nextInt();
        System.out.print("How many kg of apples: ");
        kgOfApples = input.nextInt();
        System.out.print("How many kg of tomatoes: ");
        kgOfTomatoes = input.nextInt();
        System.out.print("How many kg of bananas: ");
        kgOfBananas = input.nextInt();
        System.out.print("How many kg of eggplants: ");
        kgOfEggplants = input.nextInt();
        total = (perKgPear*kgOfPears)+(perKgApple*kgOfApples)+(perKgTomato*kgOfTomatoes)+(perKgBanana*kgOfBananas)+(perKgEggplant*kgOfEggplants);
        System.out.print("Total price: " + total);
    }
}
