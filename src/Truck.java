public class Truck extends Car{
    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
