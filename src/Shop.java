/**
 * Class created to ...
 * @author Marcelo Fortuna
 * @since 09/11/2023
 */
public class Shop {

    public static void main(String[] args) {

        Car car = new Car("Fiat", "Siena", 2008, 18.000f, "1AFHA31312HF", 1.8f, 40);
        Truck truck = new Truck("Volkswaggen", "Daf Xf 530", 2022, 589.000f, "Alimenticio", 3, 74.000f, true);
        Motorcycle motorcycle = new Motorcycle("BMW", "R1200 GS", 2017, 69.500f, "A713ADH3912F", "Injeção Eletrônica", 20, 160.0f, true);

        car.showData();
        truck.showData();
        motorcycle.showData();
    }
}
