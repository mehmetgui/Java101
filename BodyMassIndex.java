import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double height, weight, bmi;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Your Height in Meters: ");
        height = scan.nextDouble();
        System.out.print("Enter Your Weight in Kilograms: ");
        weight = scan.nextDouble();
        bmi = weight/(height * height);

        System.out.println("Your Body Mass Index : " + bmi);

        scan.close();

    }
}
