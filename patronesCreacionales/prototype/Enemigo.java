package patronesCreacionales.prototype;

/** Clase Enemigo sobre la que se hará el Prototype */
public class Enemigo {
    private String imagen;
    private int posX;
    private int posY;
    private int cantidadVida;

    /**
     * Constructor para Enemigo.
     * 
     * @param imagen       imagen del enemigo.
     * @param posX         Posición en X del enemigo.
     * @param posY         Posición en Y del enemigo.
     * @param cantidadVida Vida del enemigo.
     */
    public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
        this.imagen = imagen;
        this.posX = posX;
        this.posY = posY;
        this.cantidadVida = cantidadVida;
    }

    /**
     * Constructor copia de un Enemigo.
     * 
     * @param enemigo enemigo sobre el que se hará una copia.
     */
    public Enemigo(Enemigo enemigo) {
        this.imagen = enemigo.imagen;
        this.posX = enemigo.posX;
        this.posY = enemigo.posY;
        this.cantidadVida = enemigo.cantidadVida;
    }

    /**
     * Método para clonar una instancia de un Enemigo.
     * 
     * @return Enemigo copia.
     */
    public Enemigo clone() {
        return new Enemigo(this);
    }

    /**
     * Setter de la imágen del enemigo
     * 
     * @param imagen imagen del enemigo.
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Getter de la imágen del enemigo.
     * 
     * @return String dirección de la imágen.
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Setter de la posición en X del enemigo
     * 
     * @param posX posición en X del enemigo.
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Getter de la posición en X del enemigo.
     * 
     * @return int posición en X del enemigo.
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Setter de la posición en Y del enemigo
     * 
     * @param posX posición en Y del enemigo.
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Getter de la posición en Y del enemigo.
     * 
     * @return int posición en Y del enemigo.
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Setter de la cantidad de vida del enemigo
     * 
     * @param cantidadVida cantidad de vida del enemigo.
     */
    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
    }

    /**
     * Getter de la cantidad de vida del enemigo.
     * 
     * @return int cantidad de vida del enemigo.
     */
    public int getCantidadVida() {
        return cantidadVida;
    }
}
