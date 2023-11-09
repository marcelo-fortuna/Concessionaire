/**
 * Class created to inherit attributes and methods from the Vehicle superclass and set values of a truck.
 * @author Marcelo Fortuna
 * @since 09/11/2023
 */
public class Truck extends Vehicle {

    String typeOfTruckLoad;
    int numberOfAxes;
    float capacity;
    boolean available;

    /**
     * Constructor method to implement inheritance of Vehicle SuperClass.
     * @param brand
     * @param model
     * @param year
     * @param value
     * @param typeOfTruckLoad
     * @param numberOfAxes
     * @param capacity
     * @param available
     */
    public Truck(String brand, String model, int year, float value, String typeOfTruckLoad, int numberOfAxes, float capacity, boolean available) {
        super(brand, model, year, value);

        this.typeOfTruckLoad = typeOfTruckLoad;
        this.numberOfAxes = numberOfAxes;
        this.capacity = capacity;
        this.available = available;
    }

    /**
     * Method to show data of a truck.
     */
    public void showTruckData() {
        showVehicleData();

        System.out.println("Tipo de carga: " + typeOfTruckLoad);
        System.out.println("Número de eixos: " + numberOfAxes);
        System.out.println("Capacidade: " + capacity);
        System.out.println("Disponível: " + (available ? "Sim" : "Não"));
    }

    @Override
    public void showData() {
        System.out.println("Modelo: " + model);
        System.out.println("Número de eixos: " + numberOfAxes);
        System.out.println("Disponível: " + (available ? "Sim" : "Não"));
    }
}
