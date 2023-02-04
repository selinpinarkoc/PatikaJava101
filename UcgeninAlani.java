import java.util.Scanner;
public class UcgeninAlani {
    public static void main(String[] args) {
        int a, b, c;
        double u, alan;
        Scanner kenar = new Scanner(System.in);
        System.out.print("Ucgenin 1. kenarini giriniz: ");
        a = kenar.nextInt();
        System.out.print("Ucgenin 2. kenarini giriniz: ");
        b = kenar.nextInt();
        System.out.print("Ucgenin 3. kenarini giriniz: ");
        c = kenar.nextInt();
        u = (a + b + c)/2;
        System.out.println("Ucgenin cevresi: " + 2 * u );
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Ucgenin alani: " + alan);

    }
}
