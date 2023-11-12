package NotOrtalamaHesaplama;
import java.util.Scanner;

public class Main {{}
    public static void main(String[] args) {
        int mat, fiz, kim, turk, tar, muz;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri al.

        System.out.println("Matematik Notunu Giriniz:");
        mat = input.nextInt();

        System.out.println("Fizik Notunu Giriniz:");
        fiz = input.nextInt();

        System.out.println("Kimya Notunu Giriniz:");
        kim = input.nextInt();

        System.out.println("Türkçe Notunu Giriniz:");
        turk = input.nextInt();

        System.out.println("Tarih Notunu Giriniz:");
        tar = input.nextInt();

        System.out.println("Müzik Notunu Giriniz:");
        muz = input.nextInt();

        int toplam = (mat + fiz + kim + turk+ tar + muz );
        double ortalama = toplam / 6.0;

        System.out.println("Not ortalamanız:" + ortalama);

        String sonuc = (ortalama >= 60) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(sonuc);
        input.close();
    }
}
