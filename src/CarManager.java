import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarManager {

    private List<Car> car;//Araclari icinde tutacak bir liste
    private Scanner scanner;//kullanicidan girdi almak icin Scanner nesnesi

    //param.li const--yapici method


    public CarManager() {
        this.car =new ArrayList<>();//listeyi baslattik
        this.scanner = new Scanner(System.in);//scanner nesnesi olusturduk
    }
    
}
