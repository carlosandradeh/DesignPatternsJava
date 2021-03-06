package patronesComportamiento.observer;

public class Main {
    public static void main(String[] args) {
        
        Producto manzana = new Producto(10);

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        // Convertimos a usuario1 y usuario2 como observadores de manzana.
        manzana.agregarObservador(usuario1);
        manzana.agregarObservador(usuario2);

        // Vendemos una manzana, notificar√° a los observadores.
        manzana.venta();
    }
}
