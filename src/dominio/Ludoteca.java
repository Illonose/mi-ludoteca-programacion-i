package dominio;

import java.util.ArrayList;


public class Ludoteca {

    private ArrayList<Videojuego> videojuegos;

    public Ludoteca() {
        videojuegos = new ArrayList<>();
    }


    public void agregar(Videojuego videojuego) {
        if (videojuego != null) {
            videojuegos.add(videojuego);
        }
    }


    public void listar() {
        System.out.print(toString());
    }


    public Videojuego buscarPorTitulo(String titulo) {
        for (Videojuego v : videojuegos) {
            if (v.getTitulo().equals(titulo)) {
                return v;
            }
        }
        return null;
    }


    public boolean eliminarPorTitulo(String titulo) {
        for (int i = 0; i < videojuegos.size(); i++) {
            if (videojuegos.get(i).getTitulo().equals(titulo)) {
                videojuegos.remove(i);
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        String resultado = "";
        for (Videojuego v : videojuegos) {
            resultado += v.toString() + "\n";
        }
        return resultado;
    }
}