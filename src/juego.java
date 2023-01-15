public class juego {
    String nombreJue, generoJue;
    int anio;

    public juego(String nombreJue, String generoJue, int anio) {
        this.nombreJue = nombreJue;
        this.generoJue = generoJue;
        this.anio = anio;
    }

    public String getNombreJue() {
        return nombreJue;
    }

    public void setNombreJue(String nombreJue) {
        this.nombreJue = nombreJue;
    }

    public String getGeneroJue() {
        return generoJue;
    }

    public void setGeneroJue(String generoJue) {
        this.generoJue = generoJue;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
