public class ServiceStation implements Service {

    @Override
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
            checking(car);
            car.checkEngine();
        System.out.println();
    }

    @Override
    public void check(Bicycle bike) {
        System.out.println("Обслуживаем " + bike.getModelName());
        checking(bike);
        System.out.println();
    }

    @Override
    public void check(Truck truck) {
            System.out.println("Обслуживаем " + truck.getModelName());
            checking(truck);
            truck.checkEngine();
            truck.checkTrailer();
        System.out.println();
    }

    private void checking(Car car) {
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
    }
}
