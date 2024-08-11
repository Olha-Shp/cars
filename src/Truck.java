public class Truck extends Car {

    private String loadCapacity;

    public Truck(String brandOfCar, String modelOfCar, int yearOfCar, String loadCapacity) {
        super(brandOfCar, modelOfCar, yearOfCar);
        this.loadCapacity = loadCapacity;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void getInfo(){
        System.out.println("Truck: " + getBrand() + " " + getModel() + ", year: " + getYear() + ", load capacity: " + getLoadCapacity());
    }
}
