public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brandOfCar, String modelOfCar, int yearOfCar) {
        this.brand = brandOfCar;
        this.model = modelOfCar;
        this.year = yearOfCar;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public void getInfo(){
        System.out.println("Car: " + getBrand() + " " + getModel() + ", year: " + getYear());
    }


}
