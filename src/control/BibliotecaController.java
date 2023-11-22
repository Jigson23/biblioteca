package control;

import modelo.Biblioteca;
import modelo.Libro;
import util.Util;

import java.util.List;

public class BibliotecaController {
    private Biblioteca biblioteca;

    public BibliotecaController(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public List<Libro> buscarPorTitulo(final String titulo){
        return this.biblioteca.buscarPorTitulo(titulo);
    }

    public void prestarLibro(String ISBN) {
        this.biblioteca.prestarLibro(ISBN);
    }

    public void devolverLibro(String ISBN) {
        this.biblioteca.devolverLibro(ISBN);
    }

    public void mostrarLibros() {
        this.biblioteca.mostrarLibros();
    }

    public void agregarlibro(final Libro libro) {
        biblioteca.agregarlibro(libro);
    }

    public void cargarData() {
        biblioteca.agregarlibro(new Libro("c++", "Jigson", Util.randomAlphanumericString(5), false,"Programacion"));
        biblioteca.agregarlibro(new Libro("c++ 2.0", "Jigson", Util.randomAlphanumericString(5), false,"Programacion"));
        biblioteca.agregarlibro(new Libro("Lengua", "Jigson", Util.randomAlphanumericString(5), false,"Literatura"));
    }


}
