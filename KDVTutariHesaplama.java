import java.util.Scanner;
public class KDVTutariHesaplama {
    public static void main(String[] args) {

        double kdvsiz, kdvli, kdvTutari;
        double kdvOran, kdvOran1 = 0.18, kdvOran2 = 0.08;
        Scanner para = new Scanner(System.in);
        System.out.print("Para tutarını giriniz: ");
        kdvsiz = para.nextDouble();
        if (kdvsiz > 1000)
            kdvOran = kdvOran2;
        else
            kdvOran = kdvOran1;
        System.out.println("KDV Orani = " + kdvOran);

        System.out.println("KDV\'siz fiyat = " + kdvsiz);

        kdvli = kdvsiz + (kdvsiz * kdvOran);
        System.out.println("KDV\'li fiyat = " + kdvli);

        kdvTutari = kdvli - kdvsiz;
        System.out.println("KDV tutari = " + kdvTutari);

    }
}
