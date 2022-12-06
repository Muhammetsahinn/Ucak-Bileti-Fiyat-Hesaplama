import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {

        int km, yas, tip;
        double tutar, ind, gdInd, indtutar;

        Scanner gir = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz:");
        km = gir.nextInt();
        tutar = km * 0.10;
        if(km>0){
        System.out.println("toplam tutar : " + tutar);}
        System.out.println("Yasinizi giriniz");
        yas = gir.nextInt();
        System.out.print("Yolculuk tipini giriniz(1=tek yon, 2=gidis donus) :");
        tip = gir.nextInt();
        if (tip < 1 || tip > 2 || km < 1 || yas < 1) {
            System.out.println("hatali veri girdiniz");
        }
        else if (yas < 12) {
            ind = tutar * 0.50;
            indtutar = tutar - ind;
            if (tip == 2) {
                gdInd = indtutar * 0.20;
                System.out.println("indirimli tutar : " + (indtutar - gdInd) * 2);
            } else {
                System.out.println("indirimli tutar : " + (tutar - ind));
            }
        } else if (yas >= 12 && yas <= 24) {
            ind = tutar * 0.10;
            indtutar = tutar - ind;
            if (tip == 2) {
                gdInd = indtutar * 0.20;
                System.out.println("indirimli tutar : " + (indtutar - gdInd) * 2);
            } else {
                System.out.println("indirimli tutar : " + (tutar - ind));
            }
        } else if (yas > 65) {
            ind = tutar * 0.30;
            indtutar = tutar - ind;
            if (tip == 2) {
                gdInd = ind * 0.20;
                System.out.println("indirimli tutar : " + (indtutar - gdInd) * 2);
            } else {
                System.out.println("indirimli tutar : " + (tutar - ind));
            }
        } else if (tip == 2) {
            ind = tutar * 0.20;
            System.out.println("indirimli tutar : " + (tutar - ind) * 2);
        }
        else {
                System.out.println("tutar : " + tutar);

            }


    }
}
