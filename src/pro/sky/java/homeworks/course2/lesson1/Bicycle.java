package pro.sky.java.homeworks.course2.lesson1;

public class Bicycle extends Transport{

    public Bicycle(String modelName, int wheelsCount) {
    super (modelName, wheelsCount);
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
