import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword, changePassword;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = scan.nextLine();

        System.out.print("Şifreniz : ");
        password = scan.nextLine();

        if (userName.equals("Patika")) {
            if (password.equals("Java123")) {
                System.out.println("Giriş Başarılı");
            } else {
                System.out.println("Şifre Yanlış. Değiştirmek İçin 'evet' , Çıkış İçin 'Hayır' girişi yapınız.");
                changePassword = scan.nextLine();
                if (changePassword.equals("hayır")) System.out.println("Çıkış Yapıldı.");
                if (changePassword.equals("evet")) {
                    System.out.println("Yeni Şifreniz: ");
                    newPassword = scan.nextLine();
                    if (newPassword.equals("Java123") || newPassword.equals(password)) {
                        System.out.println("Şifre oluşturulamadı, lütfen eski şifrenizle aynı olmayan bir şifre giriniz.");
                    } else {
                        System.out.println("Şifre başarıyla oluşturuldu.");
                        password = newPassword;
                    }
                }

            }
        } else {
            System.out.println("Kullanıcı Mevcut Değil");
        }


    }
    }
