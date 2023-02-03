import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args){
        Scanner not = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Matematik notunu giriniz: ");
        mat = not.nextInt();
        System.out.println("Fizik notunu giriniz: ");
        fizik = not.nextInt();
        System.out.println("Kimya notunu giriniz: ");
        kimya = not.nextInt();
        System.out.println("Turkce notunu giriniz: ");
        turkce = not.nextInt();
        System.out.println("Tarih notunu giriniz: ");
        tarih = not.nextInt();
        System.out.println("Muzik notunu giriniz: ");
        muzik = not.nextInt();
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;
        System.out.println("Ortalama: " + ortalama);
        String str = (ortalama >= 60) ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(str);
    }
}
