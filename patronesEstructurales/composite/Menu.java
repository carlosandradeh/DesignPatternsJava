package patronesEstructurales.composite;

import java.util.ArrayList;

public class Menu implements IMenu {
    private ArrayList<IMenu> menus;

    public Menu() {
        this.menus = new ArrayList<IMenu>();
    }

    public boolean open() {
        System.out.println("Open!");
        return true;
    }

    public boolean close() {
        System.out.println("Close!");
        return true;
    }

    public void addMenu(IMenu menu) {
        menus.add(menu);
    }

    public IMenu getMenu(int posicion) {
        return menus.get(posicion);
    }
}
