package patronesEstructurales.facade;

public class Main {
    public static void main(String[] args) {
        /** 
        IMouse mouse = new Mouse();
        ITeclado teclado = new Teclado();
        Computadora computadora = new Computadora(mouse, teclado);

        computadora.encender();
        computadora.apagar();
        **/

        Facade fachada = new Facade();
        fachada.encender();
        fachada.apagar();
    }
}
