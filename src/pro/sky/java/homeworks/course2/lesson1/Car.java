package pro.sky.java.homeworks.course2.lesson1;

public class Car extends Transport{
    private String modelName;
    private int wheelsCount;

    public Car (String modelName, int wheelsCount){
        super(modelName,wheelsCount);
        this.modelName=modelName;
        this.wheelsCount=wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
