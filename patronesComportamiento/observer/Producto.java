package patronesComportamiento.observer;

import java.util.LinkedHashSet;
import java.util.Set;

/** Clase Producto */
public class Producto implements Observable {

    // Cantidad de productos a la venta.
    private int stock;

    // Colección de observadores del observable.
    private Set<Observer> observadores;

    /**
     * Constructor de Producto
     * 
     * @param stock cantidad de productos a la venta.
     */
    public Producto(int stock) {
        this.stock = stock;
        this.observadores = new LinkedHashSet<Observer>();
    }

    /**
     * Método que simula una venta, cada que se vende un producto se disminuye en 1
     * el stock.
     */
    public void venta() {
        setStock(stock - 1);
        System.out.println("Producto vendido");
        notificarObservadores();
    }

    /**
     * Método que implementa de Observable para agregar un Observador de la clase
     * Observer al producto.
     * 
     * @param observer nuevo observador.
     */
    @Override
    public void agregarObservador(Observer observer) {
        observadores.add(observer);
    }

    /**
     * Método que implementa de Observable para notificar a todos tus observaodores.
     */
    @Override
    public void notificarObservadores() {
        for (Observer observer : observadores) {
            observer.notificacion("El producto se vendió");
        }
    }

    /**
     * Método que implementa de Observable para remover a un observador de este
     * producto.
     * 
     * @param observer observador a remover.
     */
    @Override
    public void removerObservador(Observer observer) {
        observadores.remove(observer);
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
}
