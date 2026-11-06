package presentacion;

import dominio.Ludoteca;
import dominio.Videojuego;

public class Main {

    public static void main(String[] args) {
        Ludoteca ludoteca = new Ludoteca();

        System.out.println("=== Ludoteca vacía ===");
        System.out.println("[" + ludoteca + "]");

        Videojuego zelda = new Videojuego("Zelda: Tears of the Kingdom", "Switch", 10);
        Videojuego hades = new Videojuego("Hades", "PC", 9);
        Videojuego minecraft = new Videojuego("Minecraft", "PC", 8);

        ludoteca.agregar(zelda);
        ludoteca.agregar(hades);
        ludoteca.agregar(minecraft);

        System.out.println("\n=== Contenido de la ludoteca ===");
        System.out.print(ludoteca);

        System.out.println("\n=== Búsquedas ===");
        mostrarBusqueda(ludoteca, "Hades");
        mostrarBusqueda(ludoteca, "Tetris");

        System.out.println("\n=== Eliminación (ampliación) ===");
        System.out.println("¿Eliminado \"Hades\"? " + ludoteca.eliminarPorTitulo("Hades"));
        System.out.println("¿Eliminado \"Tetris\"? " + ludoteca.eliminarPorTitulo("Tetris"));
        System.out.print(ludoteca);

        System.out.println("\nEl objeto hades sigue existiendo: " + hades);
    }

    private static void mostrarBusqueda(Ludoteca ludoteca, String titulo) {
        Videojuego encontrado = ludoteca.buscarPorTitulo(titulo);
        if (encontrado != null) {
            System.out.println("Buscar \"" + titulo + "\": encontrado -> " + encontrado);
        } else {
            System.out.println("Buscar \"" + titulo + "\": no existe en la ludoteca");
        }
    }
}