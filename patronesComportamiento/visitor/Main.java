package patronesComportamiento.visitor;

public class Main {
    public static void main(String[] args) {
        // Creamos productos
        Manzana manzana = new Manzana();
        Lavadora lavadora = new Lavadora();

        // Creamos un visitor que hará los descuentos
        Visitor descuento = new DescuentoComun();

        // Aplicamos los descuentos generales.
        System.out.println(manzana.aplicarDescuento(descuento));
        System.out.println(lavadora.aplicarDescuento(descuento));
    }
}
