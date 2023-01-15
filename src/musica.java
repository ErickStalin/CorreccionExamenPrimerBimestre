public class musica extends productora{
    public musica(String nombre, String genero, int edad, String nomPro, int anioPro) {
        super(nombre, genero, edad, nomPro, anioPro);
        mostrarDatosMusica();
    }
    @Override
    public void mostrarDatosMusica(){
        System.out.println("Nombre del musico: "+getNombre());
        System.out.println("Genero de musica: "+getGenero());
        System.out.println("Edad del musico: "+getEdad() );
        System.out.println("Nombre de la productora: "+getNomPro());
        System.out.println("Año de la productora: "+getAnioPro());
    }
}
