package patronesEstructurales.virtualProxy;

public class Main {
    public static void main(String[] args) {
        // Usuario con permiso de accesibilidad.
        Usuario admin = new Usuario(5);
        IServicio servicio = new ProxyServicio(admin);

        try {
            servicio.leer();
            servicio.escribir();
            servicio.actualizar();
            servicio.eliminar();
            System.out.println("Tu usuario es ADMIN!");
        } catch (UnsupportedOperationException uoe) {
            System.out.printf("Tu usuario on rango %d no cuenta con los permisos necesarios.\n",
                    admin.getNivelṔermiso());
        }

        // Usuario sin permiso de accesibilidad.
        Usuario userBajo = new Usuario(2);
        IServicio servicio2 = new ProxyServicio(userBajo);
        try {
            servicio2.leer();
            servicio2.actualizar();
            servicio2.escribir();
            servicio2.eliminar();
            System.out.println("Tu usuario es aAdmin");
        } catch (UnsupportedOperationException e) {
            System.out.printf("Tu usuario on rango %d no cuenta con los permisos necesarios.\n",
                    userBajo.getNivelṔermiso());
        }
    }
}
