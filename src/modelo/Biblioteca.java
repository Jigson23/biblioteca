package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {

    private List<Libro> libros = new ArrayList<>();

    public void agregarlibro(Libro libro) {
        this.libros.add(libro);
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        /* TODO lo mismo
        List<Libro> list = new ArrayList<>();

        for (Libro libro: libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isPrestado()){
                list.add(libro);
            }
        }

        return list;

         */

        return
                this.libros.stream()
                .filter(libro -> libro.getTitulo().contains(titulo) && !libro.isPrestado())
                .collect(Collectors.toList());
    }

    public void prestarLibro(String ISBN) {
        for (Libro libro: libros) {
            if (libro.getISBN().equals(ISBN) && !libro.isPrestado()) {
                libro.setPrestado(true);
            }
        }
    }

    //TODO TAREA
    public void devolverLibro(String ISBN) {
        for (Libro libro : libros) {
            if (libro.getISBN().equals(ISBN) && libro.isPrestado()) {
                libro.setPrestado(false);
                break;
            }
        }
    }


    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("ISBN: " + libro.getISBN());
            System.out.println("Prestado: " + (libro.isPrestado() ? "Sí" : "No"));
            System.out.println("----------------------");
        }
    }
}

