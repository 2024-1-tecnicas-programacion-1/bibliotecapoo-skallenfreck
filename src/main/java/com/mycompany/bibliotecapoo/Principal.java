package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {

    /**
     * Metodo inicial que es ejecutado
     *
     * @param args
     *
     * Complejidad tenporal: O(N) Tiempo lineal
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        boolean salir = false;
        while (salir != true) {
            System.out.println("1) Ingresar Libro");
            System.out.println("2) Mostar todos los libros");
            System.out.println("3) Buscar libro");
            System.out.println("4) Marcar libro como leído");
            System.out.println("5) Mostrar libros no leídos");
            System.out.println("¿A que seccion del menú quieres ingresar?");
            String num = sc.next();
            switch (num) {
                case "1":
                    sc.nextLine();
                    System.out.println("Por favor ingrese el título del libro");
                    String titulo = sc.nextLine();
                    System.out.println("Por favor ingrese el autor del libro");
                    String autor = sc.nextLine();
                    System.out.println("Por favor ingrese el género del libro");
                    String genero = sc.nextLine();
                    System.out.println("Por favor ingrese el año de publicación del libro");
                    int anoPublicacion = sc.nextInt();
                    boolean leido = false;
                    Libro libro = new Libro(titulo, autor, anoPublicacion, leido, genero);
                    biblioteca.registrarLibro(libro);
                    break;

                case "2":
                    biblioteca.mostrarLibros();
                    break;
                case "3":
                    System.out.println("Ingrese el título del libro que desea buscar");
                    String palabraBusqueda = sc.next();
                    System.out.println(biblioteca.buscarLibro(palabraBusqueda));
                    break;
                case "4":
                    System.out.println("Ingrese el libro que leyo");
                    String tituloMarcar = sc.next();
                    for (Libro libro2 : biblioteca.getLibros()) {
                        if (libro2.getTitulo().equals(tituloMarcar)) {
                            libro2.marcarLeido();
                        }
                    }
                    break;
                case "5":
                    biblioteca.mostrarLibrosNoLeidos();
                    break;
                default:
                    System.out.println("No existe esa opción en el menú");
                    ;
            }
        }
    }
}