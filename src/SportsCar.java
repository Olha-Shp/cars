public class SportsCar extends Car {
    private String maxSpeed;

    public SportsCar(String brandOfCar, String modelOfCar, int yearOfCar, String maxSpeed) {
        super(brandOfCar, modelOfCar, yearOfCar);
        this.maxSpeed = maxSpeed;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void getInfo() {
        System.out.println("Sports car: " + getBrand() + " " + getModel() + ", year: " + getYear() + ", maximum speed: " + getMaxSpeed());
    }
}