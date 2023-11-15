package control;

import modelo.Biblioteca;
import modelo.Libro;

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


}
