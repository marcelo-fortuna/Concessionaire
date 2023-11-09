
/**
 * Class created to inherit attributes and methods from the Vehicle superclass and set values of a car.
 * @author Marcelo Fortuna
 * @since 09/11/2023
 */
public class Car extends Vehicle {

    String chassis;
    float power;
    int trunkVolume;

    /**
     * Constructor method to implement inheritance of Vehicle SuperClass.
     * @param brand
     * @param model
     * @param year
     * @param value
     * @param chassis
     * @param power
     * @param trunkVolume
     */
    public Car(String brand, String model, int year, float value, String chassis, float power, int trunkVolume) {
        super(brand, model, year, value);
        
        this.chassis = chassis;
        this.power = power;
        this.trunkVolume = trunkVolume;
    }

    /**
     * Method to show data of a car.
     */
    public void showCarData() {
        showVehicleData();

        System.out.println("Chassi: " + chassis);
        System.out.println("Potência: " + power);
        System.out.println("Volume do porta malas: " + trunkVolume);
    }
}
