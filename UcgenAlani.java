import java.util.Scanner;
public class UcgenAlani {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;
        double yariCevre, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenar uzunluğunu giriniz:");
        kenar1 = input.nextInt();
        System.out.print("2. kenar uzunluğunu giriniz:");
        kenar2 = input.nextInt();
        System.out.print("3. kenar uzunluğunu giriniz:");
        kenar3 = input.nextInt();
        yariCevre = (kenar1 + kenar2 + kenar3) / 2;
        alan = Math.sqrt(yariCevre * (yariCevre-kenar1) *(yariCevre-kenar2) *(yariCevre-kenar3));

        System.out.println("Üçgenin Alanı : " +  alan);
        input.close();
    }
}
