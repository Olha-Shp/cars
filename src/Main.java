public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "RV4", 2021);

        myCar.getInfo();

        SportsCar mySportsCar = new SportsCar("Subaru", "BRZ", 2020, "240 km/h");
        mySportsCar.getInfo();

        Truck myTruck = new Truck("Volvo", "FH Aero", 2024, "10 tons");
        myTruck.getInfo();

    }
}

