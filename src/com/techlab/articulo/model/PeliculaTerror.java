package model;

public class PeliculaTerror extends Pelicula {

    private int jumpscares;

    public PeliculaTerror(int codigo, int duracion, String nombre, double precio, Categoria categoria, int jumpscares) {
        super(codigo, duracion, nombre, precio, categoria);
        this.jumpscares = jumpscares;
    }

    public int getJumpscares() {
        return this.jumpscares;
    }

    public void setJumpscares(int jumpscares) {
        this.jumpscares = jumpscares;
    }

    @Override 
    public String getTipoPelicula() {
        return "Terror";
    }

    @Override 
    public String getDetalleEspecifico() {
        return "Cantidad de Jumpscares: " + jumpscares;
    }

    @Override 
    public String toString() {
        return super.toString() + " [Género Terror]";
    }

}
