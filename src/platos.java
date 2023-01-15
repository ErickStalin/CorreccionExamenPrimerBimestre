public abstract class platos extends PaisComida{
    String nombre;
    double precio;

    public platos(String nombre, double precio, String pais) {
        super(pais);
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public abstract void mostrarUno();
}
