package model;

public abstract class Pelicula extends Object{
    private int codigo;
    private int duracion;
    private String nombre;
    private double precio;
    private Categoria categoria;

    public Pelicula(int codigo, int duracion, String nombre, double precio, Categoria categoria) {
        this.codigo =codigo;
        this.duracion= duracion;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria= categoria;
    }

    public abstract String getTipoPelicula();
    

    public abstract String getDetalleEspecifico();

    @Override 
    public  String toString() {
        return "Película {" +
                "Código=" + codigo +
                ", Nombre='" + nombre + '\'' +
                ", Duración='" + duracion + '\'' +
                ", Precio=" + precio +
                ", Categoría='" + categoria.getNombre() + '\'' +
                ", Tipo='" + this.getTipoPelicula() + '\'' +
                ", Detalle='" + this.getDetalleEspecifico() + '\'' +
                '}';
    }

}
