package patronesEstructurales.facade;

public class Mouse implements IMouse {

    @Override
    public void encender() {
        System.out.println("¡Mouse encendido!");
    }

    @Override
    public void apagar() {
        System.out.println("¡Mouse apagado!");
    }

    @Override
    public void moverse() {
        System.out.println("¡El mouse se está moviendo 2 px a la derecha!");
        
    }

}
