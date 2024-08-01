import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarManager {

    private List<Car> carList;//Araclari icinde tutacak bir liste
    private Scanner scanner;//kullanicidan girdi almak icin Scanner nesnesi

    //param.li const--yapici method


    public CarManager() {
        this.carList = new ArrayList<>();//listeyi baslattik
        this.scanner = new Scanner(System.in);//scanner nesnesi olusturduk
    }


    public void addCar() {
        System.out.println("Arac markasi: ");
        String carName = scanner.nextLine();
        System.out.println("Arac modeli: ");
        String modalCar = scanner.nextLine();
        System.out.println("Uretim yili: ");
        int year= scanner.nextInt();
        System.out.println();

        Car car = new Car(carName, modalCar,year);
        carList.add(car);

    }

    public void searchCar() {
        System.out.println("Arac markasi girin: ");
        String brand = scanner.nextLine();
        for (Car car:carList){
            if (car.getModel().equalsIgnoreCase(brand)){
                System.out.println(car);
            }
        }

    }

    public void listCar() {
        if (carList.isEmpty()){
            System.out.println("Arac bulunamadi...");
        }else {
            for (Car car1 : carList) {
                System.out.println(car1);
            }
        }

    }
}
