package pro.sky.java.homeworks.course2.lesson1;

public class ServiceStation {
    public void checkCar(Car[] car) {
        System.out.println("Корличество машин" + car.length);
        for (int i = 0; i < car.length; i++) {
            Car car = car[i];
            if (car != null) {
                System.out.println("Обслуживаем " + car.getModelName());
                for (int j = 0; j < car.getWheelsCount(); i++) {
                    car.updateTyre();
                }
                car.checkEngine();
            }
        }
    }

    public void checkTruck(Truck[]truck){
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.);
                for (int i = 0; i < truck.wheelsCount; i++) {
                    truck.updateTyre();
                }
                truck.checkEngine();
                truck.checkTrailer();
            }
        }

    public void checkBicycle(Bicycle[]bicycle){
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.);
                for (int i = 0; i < bicycle.wheelsCount; i++) {
                    bicycle.updateTyre();
                }
            }

        }

}
