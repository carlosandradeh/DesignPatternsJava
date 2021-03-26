package patronesCreacionales.builder;

public class Usuario {
    private String nombre;
    private String apellido;

    private String email;
    private String telefono;
    private String direccion;

    /**
     * Contructor privado para poder crear la instancia con Make() y terminar de
     * contruirlo con build()
     */
    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = "";
        this.telefono = "";
        this.direccion = "";
    }

    /**
     * Setter de email.
     * 
     * @param email nuevo email del usuario.
     * @return Usuario para poder construir correctamente la instancia.
     */
    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Setter de Telefono
     * 
     * @param telefono nuevo telefono del usuario.
     * @return Usuario para poder construir correctamente la instancia.
     */
    public Usuario setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    /**
     * Setter de Dirección
     * 
     * @param direccion nueva dirección del usuario.
     * @return Usuario para poder construir correctamente la instancia.
     */
    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    /**
     * Método Make que regresa una instancia vital de Usuario.
     * 
     * @param nombre   nombre del usuario.
     * @param apellido apellido del usuario.
     * @return Usuario Instancia de Usuario.
     */
    public static Usuario Make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);
    }

    /**
     * Método que terminaría de construir una instancia de Usuario.
     * 
     * @return Usuario.
     */
    public Usuario Build() {
        return this;
    }

    /**
     * Método toString
     * 
     * @return String representación en una cadena.
     */
    public String toString() {
        String cadena = "Nombre: " + nombre + " Apellido: " + apellido;
        cadena += " Email: " + email + " Dirección: " + direccion + " Telefono: " + telefono;
        return cadena;
    }
}
