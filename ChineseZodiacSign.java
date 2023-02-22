import java.util.Scanner;
public class ChineseZodiacSign {
    public static void main(String[] args) {
        int year, remainder;
        String sign = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth: ");
        year = input.nextInt();

        remainder = year % 12;

        switch (remainder){
            case 0:
                sign = "Monkey";
                break;
            case 1:
                sign = "Rooster";
                break;
            case 2:
                sign = "Dog";
                break;
            case 3:
                sign = "Pig";
                break;
            case 4:
                sign = "Rat";
                break;
            case 5:
                sign = "Ox";
                break;
            case 6:
                sign = "Tiger";
                break;
            case 7:
                sign = "Rabbit";
                break;
            case 8:
                sign = "Dragon";
                break;
            case 9:
                sign = "Snake";
                break;
            case 10:
                sign = "Horse";
                break;
            case 11:
                sign = "Goat";
                break;
        }

        System.out.println("Your chinese zodiac sign:  " + sign);
    }
}
