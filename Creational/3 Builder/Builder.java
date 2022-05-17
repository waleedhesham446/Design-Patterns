/**
 * Builder
 */
public class Builder {

    public static void main(String[] args) {
        Director director = new Director();
        IBuilder carBuilder = new Car("Jeep");
        IBuilder motorCycleBuilder = new MotorCycle("Honda");

        director.Construct(carBuilder);
        Product car = carBuilder.GetVehicle();
        System.out.println(String.format("Car %s", car.Show()));

        director.Construct(motorCycleBuilder);
        Product motorCycle = motorCycleBuilder.GetVehicle();
        System.out.println(String.format("MotorCycle %s", motorCycle.Show()));
    }
}