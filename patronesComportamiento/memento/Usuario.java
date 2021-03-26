package patronesComportamiento.memento;

/** Clase Usuario */
public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método que regresa un memento de una clase Usuario (Copia de seguridad)
     * 
     * @return Usuario memento
     */
    public Usuario getMemento() {
        return new Usuario(getNombre(), getEdad());
    }

    /**
     * Restaura el memento totalmente
     * 
     * @param Usuario memento para restaurar los valores al Usuario modificado.
     */
    public void restauraMemento(Usuario usuario) {
        setNombre(usuario.getNombre());
        setEdad(usuario.getEdad());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
