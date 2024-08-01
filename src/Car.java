public class Car {

    private String name;//arac markasi
    private String model;//arac modeli
    private int year;//arac uretim yili

    //param.li const ile ilk basta ben degerleri set etmek istiyorum
    public Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    //getter-setter-- bu degiskenli okumak ve degerlerini set etmek icin


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //console'da kolayca yazdirabilmek icin toString

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
