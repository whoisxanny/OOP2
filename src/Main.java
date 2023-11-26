public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("audi", 4);
        Car car2 = new Car("bmw", 4);
        Truck turck1 = new Truck("isuzu", 6);
        Truck truck2 = new Truck("kamaz", 8);
        Bicycle bike1 = new Bicycle("ural", 2);
        Bicycle bike2 = new Bicycle("sibir'", 2);
        Service service = new ServiceStation();
        doubleCheck(service, car1, truck2, bike1);
    }

    private static void doubleCheck(Service service, Car car, Truck truck, Bicycle bike) {
        service.check(car);
        service.check(truck);
        service.check(bike);
    }

}