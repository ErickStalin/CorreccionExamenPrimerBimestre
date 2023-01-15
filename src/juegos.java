public class juegos extends productoraJue {
    public juegos(String nombreJue, String generoJue, int anio, String productoraJue, String paisDesarrollo, String clasificacion, int anioLanzamiento) {
        super(nombreJue, generoJue, anio, productoraJue, paisDesarrollo, clasificacion, anioLanzamiento);
        mostrarDatosJuego();
    }
    @Override
    public void mostrarDatosJuego(){
        System.out.println("Nombre del juego: "+getNombreJue());
        System.out.println("Genero del juego: "+getGeneroJue());
        System.out.println("Año del juego: "+getAnio());
        System.out.println("Nombre de la productora: "+getProductoraJue());
        System.out.println("Pais de desarrollo: "+getPaisDesarrollo());
        System.out.println("Clasificacion del juego: "+getClasificacion());
    }
}
