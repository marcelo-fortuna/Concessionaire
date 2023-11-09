
/**
 * Class created to inherit attributes and methods from the Vehicle superclass and set values of a motorcycle.
 * @author Marcelo Fortuna
 * @since 09/11/2023
 */
public class Motorcycle extends Vehicle {

    String chassis;
    String type;
    int chestVolume;
    float power;
    boolean disponible;

    /**
     * Constructor method to implement inheritance of Vehicle SuperClass.
     * @param brand
     * @param model
     * @param year
     * @param value
     * @param chassis
     * @param type
     * @param chestVolume
     * @param power
     * @param disponible
     */
    public Motorcycle(String brand, String model, int year, float value, String chassis, String type, int chestVolume, float power, boolean disponible) {
        super(brand, model, year, value);

        this.chassis = chassis;
        this.type = type;
        this.chestVolume = chestVolume;
        this.power = power;
        this.disponible = disponible;
    }

    /**
     * Method to show data of a motorcycle.
     */
    public void showMotorcycleData() {
        showVehicleData();

        System.out.println("Chassi: " + chassis);
        System.out.println("Tipo: " + type);
        System.out.println("Potência: " + power);
        System.out.println("Volume do baú: " + chestVolume);
        System.out.println("Disponível: " + disponible);
    }

    /**
     * Override method of class Vehicle
     */
    @Override
    public void showData() {
        System.out.println("Modelo: " + model);
        System.out.println("Volume do baú: " + chestVolume);
        System.out.println("Disponível: " + (disponible ? "Sim" : "Não"));
    }
}
