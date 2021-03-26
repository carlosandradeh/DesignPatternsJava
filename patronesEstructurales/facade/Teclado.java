package patronesEstructurales.facade;

public class Teclado implements ITeclado {

    @Override
    public void encender() {
        System.out.println("¡Teclado encendido!");
    }

    @Override
    public void apagar() {
        System.out.println("¡Teclado apagado!");
    }

    @Override
    public void escribir(String s) {
        System.out.println(s);
    }

}
