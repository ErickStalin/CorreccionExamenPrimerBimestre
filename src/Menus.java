import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Menus {

    Scanner entrada = new Scanner(System.in);
    comidas m1 = new comidas("Fritada",5,"Ecuador");
    musica music1 = new musica("Bad Gyal","Pop",23,"King Doudou",2001);
    juegos j1 = new juegos("Call of Duty","Accion",2022,"Activision","España","PEGI",2022);
    public int opcion(){
        int op;
        System.out.println("---MENU---");
        System.out.println("1. VIDEOJUEGOS");
        System.out.println("2. MUSICA");
        System.out.println("3. COMIDAS");
        System.out.println("0. SALIR");
        System.out.print("Ingrese la opcion que desea: ");
        op = entrada.nextInt();
        return op;
    }
    public void ejer1(){
        List miLista1 = new ArrayList();
        miLista1.add(j1);
        imptimir1((ArrayList) miLista1);
    }
    public void ejer2(){
        List miLista2 = new ArrayList();
        miLista2.add(music1);
        imptimir2((ArrayList) miLista2);
    }
    public void ejer3(){
        List miLista3  = new ArrayList();
        miLista3.add(m1);
        imptimir3((ArrayList) miLista3);
    }
    static void imptimir3(ArrayList lista3){
        for(int i = 0; i < lista3.size(); i++){
            comidas n1 = (comidas) lista3.get(i);
            n1.mostrarUno();
            System.out.println("");
        }
    }
    static void imptimir2(ArrayList lista2){
        for(int i = 0; i < lista2.size(); i++){
            musica n1 = (musica) lista2.get(i);
            n1.mostrarDatosMusica();
            System.out.println("");
        }
    }
    static void imptimir1(ArrayList lista1){
        for(int i = 0; i < lista1.size(); i++){
            juegos n1 = (juegos) lista1.get(i);
            n1.mostrarDatosJuego();
            System.out.println("");
        }
    }

}
