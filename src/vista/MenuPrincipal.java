package vista;

import control.BibliotecaController;
import modelo.Libro;
import util.Util;

import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    private BibliotecaController controller;
    private Scanner scanner;

    public MenuPrincipal(BibliotecaController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("******************************** Bienvenido a la Biblioteca ***************************");
            System.out.println("1. Agregar Libro");
            System.out.println("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el scaner
            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                default:
                    System.out.println("Opcion no válida, intenta nuevamente");
            }
        } while (opcion != 0);

    }

    private void agregarLibro() {
        System.out.println("Ingresa el Titulo de libro: ");
        String titulo = scanner.nextLine();

        System.out.println("Ingresa el Autor de libro: ");
        String autor = scanner.nextLine();

        System.out.println("Ingresa el Tipo de libro: ");
        String tipo = scanner.nextLine();

        String ISBN = Util.randomAlphanumericString(5);

        Libro libro = new Libro(titulo, autor, ISBN, false, tipo);

        controller.agregarlibro(libro);
    }

    public void buscarPorTitulo() {
        List<Libro> libros = controller.buscarPorTitulo("A");

    }
}
