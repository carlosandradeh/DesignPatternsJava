package patronesComportamiento.iterator;

import java.util.ArrayList;

/** Clase GuiaTelefonica iterable. */
public class GuiaTelefonica implements Iterable {

    private class IteradorGuia implements Iterator {
        // Posición del numero en el ArrayList numerosTelefonicos.
        private int posicion;

        /**
         * Método que nos retorna el elemento siguiente en los Numeros telefónicos.
         * 
         * @return String numero telefónico siguiente.
         */
        @Override
        public String next() {
            return numerosTelefonicos.get(posicion++);
        }

        /**
         * Método que nos dice que si hay elemento siguiente en los Numeros Telefónicos.
         * 
         * @return boolean
         */
        @Override
        public boolean hasNext() {
            return (posicion < numerosTelefonicos.size()) && (numerosTelefonicos.get(posicion) != null);
        }

    }

    // Numeros telefónicos de la Guía telefónica.
    private ArrayList<String> numerosTelefonicos;

    /**
     * Constructor de la guía telefónica.
     */
    public GuiaTelefonica() {
        numerosTelefonicos = new ArrayList<String>();
    }

    /**
     * Método para agregar un numero a ala guía teefónica.
     * 
     * @param numero Numero a agregar.
     */
    public void agregarNumero(String numero) {
        numerosTelefonicos.add(numero);
    }

    /**
     * Método para obtener la guía telefónica completa.
     * 
     * @return ArrayList<String> Guía telefónica.
     */
    public ArrayList<String> getNumerosTelefonicos() {
        return numerosTelefonicos;
    }

    @Override
    public Iterator iterator() {
        return new IteradorGuia();
    }
}
