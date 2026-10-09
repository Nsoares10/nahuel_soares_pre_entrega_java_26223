package model;

public class PeliculaRomance extends Pelicula {

    private int escenasDeBeso;

    public PeliculaRomance(int codigo, int duracion, String nombre, double precio, Categoria categoria, int escenasDeBeso) {
        super(codigo, duracion, nombre, precio, categoria);
        this.escenasDeBeso = escenasDeBeso;
    }

    public int getEscenasDeBeso() {
        return this.escenasDeBeso;
    } 

    public void getEscenasDeBeso(int escenasDeBeso) {
        this.escenasDeBeso = escenasDeBeso;
    }

    @Override
    public String getTipoPelicula() {
        return "Romance";
    }

    @Override 
    public String getDetalleEspecifico() {
        return "Escenas de beso en la pelicuila: " + escenasDeBeso;
    }

    @Override 
    public String toString() {
        return super.toString() + " [Género Romance]";
    }

}
