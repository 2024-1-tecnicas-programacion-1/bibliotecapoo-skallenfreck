package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

/**
 * Clase Biblioteca
 *
 * @author fresn
 */
public class Biblioteca {

    private LinkedList<Libro> libros;

    /**
     * Método constructor que inicializa los atributos de la clase
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Biblioteca() {
        this.libros = new LinkedList<>();
    }

    /**
     * Método que añade un objeto Libro en la lista libros
     *
     * @param libro
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Método que busca un objeto Libro en la lista libros por medio del titulo
     *
     * @param palabraBusqueda
     * @return libro del que pertenece el título // "No hay libros con datos
     * parecidos"
     *
     * Complejidad temporral: O(N) Tiempo lineal
     */
    public String buscarLibro(String palabraBusqueda) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroBusqueda = libros.get(i);
            String titulo = libroBusqueda.getTitulo();
            if (palabraBusqueda.equals(titulo)) {
                return libroBusqueda.mostrarInformacion();
            }
        }
        return "No hay libros con datos parecidos";
    }

    /**
     * Método que imprime por pantalla todos los objetos Libros en la lista
     * libros
     *
     * Complejidad temporal: O(N) Tiempo lineal
     */
    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca:");
        for (int i = 0; i < libros.size(); i++) {
            Libro libroBusqueda = libros.get(i);
            System.out.println(libroBusqueda.mostrarInformacion());
        }
    }

    /**
     * Metodo que imprime por pantalla todos los objetos Libros que tengan false
     * en su atribto leido en la lista libros
     *
     * Complejidad temporal: O(N) Tiempo lineal
     */
    public void mostrarLibrosNoLeidos() {
        System.out.println("Los libros no leídos en la biblioteca:");
        for (int i = 0; i < libros.size(); i++) {
            Libro libroBusqueda = libros.get(i);
            if (libroBusqueda.getleido() == false) {
                System.out.println(libroBusqueda.mostrarInformacion());
            }
        }

    }

    /**
     * Método para tener el valor de libros
     *
     * @return libros
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public LinkedList<Libro> getLibros() {
        return libros;
    }
}

