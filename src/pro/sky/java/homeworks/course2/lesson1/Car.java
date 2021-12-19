package pro.sky.java.homeworks.course2.lesson1;

public class Car extends Truck{

    public Car (String modelName, int wheelsCount){
        super(modelName,wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
