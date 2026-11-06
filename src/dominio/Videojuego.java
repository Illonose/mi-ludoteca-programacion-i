package dominio;

import java.util.Objects;

public class Videojuego {

    public static final int PUNTUACION_MINIMA = 0;
    public static final int PUNTUACION_MAXIMA = 10;

    private String titulo;
    private String plataforma;
    private int puntuacion;

    public Videojuego(String titulo, String plataforma, int puntuacion) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        if (esPuntuacionValida(puntuacion)) {
            this.puntuacion = puntuacion;
        } else {
            this.puntuacion = PUNTUACION_MINIMA;
        }
    }

    public static boolean esPuntuacionValida(int puntuacion) {
        return puntuacion >= PUNTUACION_MINIMA && puntuacion <= PUNTUACION_MAXIMA;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        if (esPuntuacionValida(puntuacion)) {
            this.puntuacion = puntuacion;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Videojuego otro = (Videojuego) obj;
        return Objects.equals(titulo, otro.titulo)
                && Objects.equals(plataforma, otro.plataforma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, plataforma);
    }

    @Override
    public String toString() {
        return titulo + " (" + plataforma + ") - Puntuación: " + puntuacion + "/" + PUNTUACION_MAXIMA;
    }
}