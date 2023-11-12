import java.util.Scanner;
public class DaireDilimiAlani {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz:");
        r = scan.nextInt();
        System.out.print("Açı ölçüsünü giriniz:");
        a = scan.nextInt();

        double alan = (pi * r * r * a) / 360;

        System.out.println("Daire diliminin alanı : " + alan);
        scan.close();
    }

}
