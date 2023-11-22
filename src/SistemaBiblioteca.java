import control.BibliotecaController;
import modelo.Biblioteca;
import vista.MenuPrincipal;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        BibliotecaController controller = new BibliotecaController(new Biblioteca());
        controller.cargarData();
        MenuPrincipal menuPrincipal = new MenuPrincipal(controller);
        menuPrincipal.menu();
    }
}
