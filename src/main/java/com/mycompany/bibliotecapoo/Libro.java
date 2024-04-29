package com.mycompany.bibliotecapoo;

import java.util.Calendar;

/**
 * Clase Libro
 *
 * @author fresn
 */
public class Libro {

    private String titulo;
    private String autor;
    private String genero;
    private int anoPublicacion;
    private boolean leido;

    Calendar cal = Calendar.getInstance();
    private int year = cal.get(Calendar.YEAR);

    /**
     * Método constructor para inicialiizar los atributos de la clase
     *
     * @param titulo
     * @param autor
     * @param anoPublicacion
     * @param leido
     * @param genero
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Libro(String titulo, String autor, int anoPublicacion, boolean leido, String genero) {

        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacion = anoPublicacion;
        this.leido = leido;

    }

    /**
     * Método para tener el valor de la variable leido
     *
     * @return leido
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public boolean getleido() {
        return leido;
    }

    /**
     * Método para tener el valor de la variable titulo
     *
     * @return titulo
     *
     * Complejidad teporal: O(1) Tiempo constante
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método que imprime las variables titulo, autor, anoPublicacion y genero
     *
     * @return String "Título: ["+titulo+"], Autor: ["+autor+"], Año de
     * publicación: ["+anoPublicacion+"], Género: ["+genero+"]"
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String mostrarInformacion() {
        return "Título: [" + titulo + "], Autor: [" + autor + "], Año de publicación: [" + anoPublicacion + "], Género: [" + genero + "]";
    }

    /**
     * Método que cambia el valor de la variable leido por true
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void marcarLeido() {
        this.leido = true;
    }

    /**
     * Método que verifica si el libro se considera antiguo o no
     *
     * @return true // false
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public boolean esAntiguo() {
        return (year - anoPublicacion) > 50;
    }
}
