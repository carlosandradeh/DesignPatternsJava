package patronesEstructurales.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaHawaiana = new PizzaHawaiana();
        System.out.println(pizzaHawaiana);

        Pizza pizzaPeperoni = new PizzaPeperoni();
        System.out.println(pizzaPeperoni);

        Pizza pizzaHawaianaQuesoExtra = new QuesoExtra(new PizzaHawaiana());
        System.out.println(pizzaHawaianaQuesoExtra);

        Pizza pizzaPeperoniQuesoExtra = new QuesoExtra(new PizzaHawaiana());
        System.out.println(pizzaPeperoniQuesoExtra);

        Pizza pizzaHawaianaQuesoExtraOrillaRellena = new OrillaRellena(new QuesoExtra(new PizzaHawaiana()));
        System.out.println(pizzaHawaianaQuesoExtraOrillaRellena);

        Pizza pizzaPeperoniQuesoExtraOrillaRellena = new OrillaRellena(new QuesoExtra(new PizzaPeperoni()));
        System.out.println(pizzaPeperoniQuesoExtraOrillaRellena);
    }
}
