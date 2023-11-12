import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        n1 = scan.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        n2 = scan.nextInt();

        System.out.println("1-toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuç :" + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuç : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuç : " + (n1 * n2));
                break;
            case 4:
                System.out.println("Sonuç :" + ((n2 != 0 ) ? (n1 / n2) : "0'a bölüm belirsizdir."));
                break;
            default:
                System.out.println("Geçersiz seçim yaptınız. Lütfen 1 ile 4 arasında bir seçim yapınız.");
        }

    }
}

