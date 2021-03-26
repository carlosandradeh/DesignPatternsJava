package patronesComportamiento.iterator;

public class Main {
    public static void main(String[] args) {

        GuiaTelefonica guia = new GuiaTelefonica();

        // Agregamos 10 numero al azar.
        for (int i = 0; i < 10; i++) {
            Integer num = (int) (Math.random() * 1000000000 + 1);
            guia.agregarNumero(Integer.toString(num));
        }

        // Iteramos sobre la guía telefónica
        Iterator iterator = guia.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
