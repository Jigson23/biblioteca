package modelo;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean prestado;
    private ArrayList<String> tipoLibro;

    public Libro() {
    }

    // Constructor
    public Libro(String titulo, String autor, String ISBN, boolean prestado, ArrayList<String> tipoLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prestado = prestado;
        this.tipoLibro = tipoLibro;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public ArrayList<String> getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(ArrayList<String> tipoLibro) {
        this.tipoLibro = tipoLibro;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", prestado=" + prestado +
                ", tipoLibro=" + tipoLibro +
                '}';
    }
}
