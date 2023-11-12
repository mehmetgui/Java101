package ManavKasaProgrami;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlican, toplamTutar;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo : ");
        kgArmut = scan.nextDouble();
        System.out.print("Elma Kaç Kilo : ");
        kgElma = scan.nextDouble();
        System.out.print("Domates Kaç Kilo : ");
        kgDomates = scan.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        kgMuz = scan.nextDouble();
        System.out.print("Patlıcgan Kaç Kilo : ");
        kgPatlican = scan.nextDouble();

        toplamTutar = (kgArmut * armut + kgElma * elma + kgDomates * domates + kgMuz * muz + kgPatlican * patlican);

        System.out.println("Toplam Tutar : " + toplamTutar + "TL");
        scan.close();

    }
}
