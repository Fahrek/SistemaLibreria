package sistemalibreria;

import java.io.PrintWriter;

public class Libro 
{
    private String ISBN;
    private String titulo;
    private String autor;
    private double precio;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, double precio) {
        this.ISBN   = ISBN;
        this.titulo = titulo;
        this.autor  = autor;
        this.precio = precio;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void imprime() {
        System.out.println("ISBN: "   + this.getISBN() 
                      + " | Titulo: " + this.getTitulo() 
                      + " | Autor: "  + this.getAutor() 
                      + " | Precio: " + this.getPrecio() + "€");
    }
    
    public void imprime(PrintWriter salida) {
        salida.println("ISBN: "   + this.getISBN() 
                      + " | Titulo: " + this.getTitulo() 
                      + " | Autor: "  + this.getAutor() 
                      + " | Precio: " + this.getPrecio() + "€");
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + titulo + ", Autor=" + autor + ", Precio=" + precio + '}';
    }
}
