import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;

        while (right > 0) {

            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();

            System.out.print("Parolanız: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış Yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    // Switch-case yapısı ile ATM işlemleri yapıldı.

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);

                    }
                }
                while (select!= 4);
                System.out.println(("Tekrar görüşmek üzere."));
                break;
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}