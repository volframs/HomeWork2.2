package pro.sky.java.homeworks.course2.lesson1;

public class Bicycle extends Truck{

    public Bicycle(String modelName, int wheelsCount) {
    super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
