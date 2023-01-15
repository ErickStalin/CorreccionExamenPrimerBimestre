public abstract class productoraJue extends juego {
    String productoraJue, paisDesarrollo, clasificacion;
    int anioLanzamiento;

    public productoraJue(String nombreJue, String generoJue, int anio, String productoraJue, String paisDesarrollo, String clasificacion, int anioLanzamiento) {
        super(nombreJue, generoJue, anio);
        this.productoraJue = productoraJue;
        this.paisDesarrollo = paisDesarrollo;
        this.clasificacion = clasificacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getProductoraJue() {
        return productoraJue;
    }

    public void setProductoraJue(String productoraJue) {
        this.productoraJue = productoraJue;
    }

    public String getPaisDesarrollo() {
        return paisDesarrollo;
    }

    public void setPaisDesarrollo(String paisDesarrollo) {
        this.paisDesarrollo = paisDesarrollo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    public abstract void mostrarDatosJuego();
}
