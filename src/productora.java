public abstract class productora extends musico {
    String nomPro;
    int anioPro;

    public productora(String nombre, String genero, int edad, String nomPro, int anioPro) {
        super(nombre, genero, edad);
        this.nomPro = nomPro;
        this.anioPro = anioPro;
    }

    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    public int getAnioPro() {
        return anioPro;
    }

    public void setAnioPro(int anioPro) {
        this.anioPro = anioPro;
    }

    public abstract void mostrarDatosMusica();
}
