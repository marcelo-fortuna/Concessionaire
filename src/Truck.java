/**
 * Class created to inherit attributes and methods from the Vehicle superclass and set values of a truck.
 * @author Marcelo Fortuna
 * @since 09/11/2023
 */
public class Truck extends Vehicle {

    String typeOfTruckLoad;
    float numberOfAxes;
    int capacity;
    boolean disponible;

    /**
     * Constructor method to implement inheritance of Vehicle SuperClass.
     * @param brand
     * @param model
     * @param year
     * @param value
     * @param typeOfTruckLoad
     * @param numberOfAxes
     * @param capacity
     * @param disponible
     */
    public Truck(String brand, String model, int year, float value, String typeOfTruckLoad, float numberOfAxes, int capacity, boolean disponible) {
        super(brand, model, year, value);

        this.typeOfTruckLoad = typeOfTruckLoad;
        this.numberOfAxes = numberOfAxes;
        this.capacity = capacity;
        this.disponible = disponible;
    }

    /**
     * Method to show data of a truck.
     */
    public void showTruckData() {
        showVehicleData();

        System.out.println("Tipo de carga: " + typeOfTruckLoad);
        System.out.println("Número de eixos: " + numberOfAxes);
        System.out.println("Capacidade: " + capacity);
        System.out.println("Disponível: " + (disponible ? "Sim" : "Não"));
    }
}
