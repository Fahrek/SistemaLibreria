package sistemalibreria;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Libreria {
    private ArrayList<Libro> libros;
    private String nombre;

    public Libreria() {
    }

    public Libreria(ArrayList<Libro> libros, String nombre) {
        this.libros = libros;
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Libro> filtrarPorAutor() {return tipo;}
    
    public ArrayList<Libro> filtrarPorPrecio() {return tipo;}
    
    public void addLibro(String ISBN, String titulo, String autor, double precio) {
        Libro l = new Libro(ISBN, titulo, autor, precio);
        libros.add(l);
    }
    
    public void imprimirCatalogo() throws IOException {
        System.out.println("¿Desea guardar el catálogo en un fichero de texto?");
        // Leer cadenas por teclado o por archivo
        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine();
        if (respuesta.compareToIgnoreCase("s") == 0) {
            System.out.println("Introduce un nombre para el archivo destino");
            String fileName = sc.nextLine();
            FileWriter escritor = new FileWriter(fileName);
            PrintWriter pw = new PrintWriter(escritor);
            
            Iterator<Libro> it = libros.iterator();
            while (it.hasNext()) {
                Libro l = it.next();
                l.imprime(pw);
            }
            pw.close();
        } // Fin de escritura por fichero
        
        Iterator<Libro> it = libros.iterator();
            while (it.hasNext()) {
                Libro l = it.next();
                l.imprime();
            }
    }
    
    public Libro buscarLibro() {return tipo;}
    
    public Libro borrarLibro() {return tipo;}

    @Override
    public String toString() {
        return "Libreria{" + "libros=" + libros + ", nombre=" + nombre + '}';
    }
}
