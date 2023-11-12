package KDVTutariHesaplama;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double fiyat, KDVliFiyat, KDVTutari;
        Scanner input = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz:");
        fiyat = input.nextDouble();

        KDVliFiyat = fiyat * 1.18;
        KDVTutari = fiyat * 0.18;

        System.out.println("KDV Hariç Fiyatı:" + fiyat);
        System.out.println("KDV Dahil Fiyatı:" + KDVliFiyat);
        System.out.println("KDV Tutarı:" + KDVTutari);

        input.close();


    }
}
