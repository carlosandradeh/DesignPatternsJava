package patronesEstructurales.facade;

public class Facade {
    private Computadora computadora;

    public Facade() {
        ITeclado teclado = new Teclado();
        IMouse mouse = new Mouse();
        this.computadora = new Computadora(mouse, teclado);
    }

    public void encender() {
        computadora.encender();
    }

    public void apagar() {
        computadora.apagar();
    }
}
