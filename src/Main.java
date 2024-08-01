import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        Scanner scanner = new Scanner(System.in);

        start(carManager, scanner);
            


    }

    private static void start(CarManager carManager, Scanner scanner) {

        int select;
        do {
            System.out.println("===> Arac Yonetim Sistemine Hos Geldiniz <==");
            System.out.println("Yapmak istediğiniz işlemi seçin...");
            System.out.println("1 - Araç ekleme");
            System.out.println("2 - Araç arama");
            System.out.println("3 - Araçları listeleme");
            System.out.println("0 - Çıkış...");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    carManager.aracEkleme();
                    break;
                case 2:
                    carManager.aracArama();
                    break;
                case 3:
                    carManager.aracListeleme();
                    break;
                case 0:
                    System.out.println("Tesekkur eder, yine bekleriz");
                    break;
                default:
                    System.out.println("Hatali giris!!!");
            }

        } while (select != 0);



    }
}
