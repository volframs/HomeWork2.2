package pro.sky.java.homeworks.course2.lesson1;

public class InterfaceTransports implements Interface {
    @Override
    public void checkCar(Car[] car) {
        System.out.println("Корличество машин" + car.length);
        for (int i = 0; i < car.length; i++) {
            Car Car = car[i];
            if (car != null) {
                System.out.println("Обслуживаем " + Car.getModelName());
                for (int j = 0; j < Car.getWheelsCount(); i++) {
                    Car.updateTyre();
                }
                Car.checkEngine();
            }
        }
    }

    @Override
    public void checkTruck(Truck[] truck) {
        if (truck != null) {
            System.out.println("Количество грузовых машин " + truck.length);
            for (int i = 0; i < truck.length; i++) {
                Truck.updateTyre();
            }
            Truck.checkEngine();
            Truck.checkTrailer();
        }
    }


    @Override
    public void checkBicycle(Bicycle[] bicycle) {
        if (bicycle != null) {
            System.out.println("Количество велосипедов " + bicycle.length);
            for (int i = 0; i < bicycle.length; i++) {
                Bicycle.updateTyre();
            }
        }

    }

}
