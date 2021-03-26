package patronesCreacionales.factoryMethod;

public class Main {
    public static void main(String[] args) {
        // Nuestro Factory method.
        Pizzeria pizzeriaCarlos = new PizzeriaCarlos();
        // Nuestras pizzas creadas por el Factory Method.
        Pizza pizzaPeperoni = pizzeriaCarlos.crearPizza("Peperoni");
        Pizza pizzaHawaiana = pizzeriaCarlos.crearPizza("Hawaiana");
        Pizza pizzaPeperoniOrillaRellena = pizzeriaCarlos.crearPizza("Peperoni orilla rellena");

        System.out.println(pizzaPeperoni);
        System.out.println(pizzaHawaiana);
        System.out.println(pizzaPeperoniOrillaRellena);
    }
}
