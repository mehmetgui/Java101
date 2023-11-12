package TaksimetreHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int km;
    double perKm = 2.2, tutar = 10;

    Scanner scan = new Scanner(System.in);
    System.out.print("Mesafeyi giriniz : ");
    km = scan.nextInt();
    tutar += km * perKm;

    tutar =  (tutar < 20) ? 20 : tutar;
    System.out.println("Toplam Tutar : " + tutar);

    scan.close();

    }
}

