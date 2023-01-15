public class comidas extends platos{
    public comidas(String comida, double precio , String pais){
        super(comida, precio, pais);
        mostrarUno();
    }
    @Override
    public void mostrarUno(){
        System.out.println("Comida: "+ getNombre());
        System.out.println("Pais: "+ getPais());
        System.out.println("Precio: "+ getPrecio());
    }
}
