package pro.sky.java.homeworks.course2.lesson1;

public class Main {
    public static void main(String[] args) {
        Car[] car = {
                new Car("car1",4),
                new Car("car2",4),
        };

        Truck[] truck = {
                new Truck("truck1",6),
                new Truck("car2",8),
        };

        Bicycle[] bicycle = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };


        ServiceStation station = new ServiceStation();

        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
