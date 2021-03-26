package patronesCreacionales.builder2;

public class Usuario {
    private String nombre;
    private String apellido;

    // Opcionales
    private boolean medioContacto;

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
        this.medioContacto = false;
        this.email = "";
        this.telefono = "";
        this.direccion = "";
    }

    /**
     * Método para asignar valor a medioContacto y así dar permisos de poder
     * rellenar los atributos de contacto.
     * 
     * @param medioContacto Booleano que nos dice si estará permitido rellenar los
     *                      atributos de contacto
     * @return BuilderUsuario el cuál nos permitirá asignar los valores de contacto.
     */
    public BuilderUsuario setMedioContacto(boolean medioContacto) {
        // Si el parámetro que nos pasan es falso
        if (!medioContacto)
            throw new IllegalArgumentException("Ya es false medioContacto!");

        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);
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
     * Método toString
     * 
     * @return String representación en una cadena.
     */
    public String toString() {
        String cadena = "Nombre: " + nombre + " Apellido: " + apellido;
        cadena += " Email: " + email + " Dirección: " + direccion + " Telefono: " + telefono;
        return cadena;
    }

    /**
     * Clase estática BuilderUsuario para poder poner los atributos de contacto si
     * medioContacto es true.
     */
    public static class BuilderUsuario {
        // Usuario sobre el que se trabajará.
        private Usuario usuario;

        /**
         * Constructor para poder acceder a un usuario
         * 
         * @param usuario Usuario sobre el que se trabajará.
         */
        public BuilderUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        /**
         * Setter de email.
         * 
         * @param email nuevo email del usuario.
         * @return BuilderUsuario para poder construir correctamente la instancia.
         */
        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }

        /**
         * Setter de Telefono
         * 
         * @param telefono nuevo telefono del usuario.
         * @return BuilderUsuario para poder construir correctamente la instancia.
         */
        public BuilderUsuario setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
        }

        /**
         * Setter de Dirección
         * 
         * @param direccion nueva dirección del usuario.
         * @return BuilderUsuario para poder construir correctamente la instancia.
         */
        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        /**
         * Método que terminaría de construir una instancia de Usuario.
         * 
         * @return Usuario.
         */
        public Usuario Build() {
            return usuario;
        }
    }
}
