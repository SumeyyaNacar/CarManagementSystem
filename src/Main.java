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
            select = scanner.nextInt();//kullanicidan secimi al
            scanner.nextLine();//temizleme

            switch (select) {
                case 1:
                    carManager.addCar();
                    break;
                case 2:
                    carManager.searchCar();
                    break;
                case 3:
                    carManager.listCar();
                    break;
                case 0:
                    System.out.println("Tesekkur eder, yine bekleriz");
                    break;
                default:
                    System.out.println("Hatali giris!!!");
            }

        } while (select != 0);//kullanici cikis yapana kadar dongu devam etsin

        scanner.close();//scanner nesnesini kapattik



    }
}
