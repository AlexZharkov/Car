package Car;

/**
 * Created by ZHARKOOE on 14.10.2016.
 */
public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Mercedes","passenger car");
        Wheel wheel1 = new Wheel("Winter" , "Pirelli");
        Wheel wheel2 = new Wheel("Winter" , "Pirelli");
        Wheel wheel3 = new Wheel("Winter" , "Pirelli");
        Wheel wheel4 = new Wheel("Winter" , "Pirelli");

        car.refillCar(8);

        System.out.println(car);

        car.changeWheel(1 , wheel1);
        car.changeWheel(2 , wheel2);
        car.changeWheel(3 , wheel3);
        car.changeWheel(4 , wheel4);

        car.checkWheel();

        car.drive();




    }
}
