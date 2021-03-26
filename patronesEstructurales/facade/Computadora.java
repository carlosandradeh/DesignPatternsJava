package patronesEstructurales.facade;

public class Computadora {
    private IMouse mouse;
    private ITeclado teclado;

    public Computadora(IMouse mouse, ITeclado teclado) {
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public void encender() {
        mouse.encender();
        teclado.encender();
    }

    public void apagar() {
        mouse.apagar();
        teclado.apagar();
    }
}
