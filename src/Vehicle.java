
/**
 * Class created to create the attributes of a Vehicle.
 * @author Marcelo Fortuna
 * @since 09/11/2023
 */
public class Vehicle {

    String brand;
    String model;
    int year;
    float value;

    /**
     * Constructor method to define data of attributes.
     * @param brand
     * @param model
     * @param year
     * @param value
     */
    public Vehicle(String brand, String model, int year, float value) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    /**
     * Method to show data of a vehicle.
     */
    public void showVehicleData() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Ano: " + year);
        System.out.println("Valor: " + value);
    }

    public void showData() {
        System.out.println("É um véiculo do modelo: " + model);
    }
}
