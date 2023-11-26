public interface Service {

    default void check() {
        System.out.println("Проверять нечего");
    }
    void check(Car car);

    void check(Bicycle bike);

    void check(Truck truck);
}
