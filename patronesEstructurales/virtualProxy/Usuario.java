package patronesEstructurales.virtualProxy;

public class Usuario {
    private int nivelPermiso; // 1 -- 5 // 5 : Administrador

    public Usuario(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }

    public void setNivelPermiso(int nivelPermiso) {
        this.nivelPermiso = nivelPermiso;
    }

    public int getNivelṔermiso() {
        return nivelPermiso;
    }
}
