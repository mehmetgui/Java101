public class SwitchCaseStatement {
    public static void main(String[] args) {
        int day = 30;
        switch (day) {
            case 1:
                System.out.println("Bugün pazartesi");
                System.out.println("Program bitti");
                break;
            case 2:
                System.out.println("Bugün salı");
                break;
            case 3:
                System.out.println("Bugün çarşamba");
                break;
            case 4:
                System.out.println("Bugün perşembe");
                break;
            case 5:
                System.out.println("Bugün cuma");
                break;
            case 6:
                System.out.println("Bugün cumartesi");
                break;
            case 7:
                System.out.println("Bugün pazar");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
