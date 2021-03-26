package patronesCreacionales.simpleFactory;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeriaCarlos = new Pizzeria(); // Nuestra Simple Factory.
        Pizza pizzaChica = pizzeriaCarlos.crearPizzaChica(); // Nuestra Pizza chica.
        System.out.println(pizzaChica);
    }
}
