package paquete;
import java.util.*;
public class Eliminacion{
    
    private ArrayList<Partido> partido;
    private Grupo[] octavos;
    private Partido[] cuartos;
    private Partido[] semis;
    private Partido finalazo;
    
    public Eliminacion(){
        partido = new ArrayList<Partido>();
        octavos = new Grupo[8];
        cuartos = new Partido[4];
        semis = new Partido[2];
    }
    
    public Eliminacion(ArrayList<Partido> pa, Grupo[] f, Partido[] cua, Partido[] semi, Partido fin){
        partido = pa;
        octavos = f;
        cuartos = cua;
        semis = semi;
        finalazo = fin;
    }
    
    public void octavos(){
        for(int i = 0; i<octavos.length; i++){
            System.out.println("Grupo " + octavos[i].getLetra() + ":");
            System.out.print(octavos[i].primerPuesto().getNombre() + " ");
            System.out.print(octavos[i].segundoPuesto().getNombre() + "\n");
        }
    }
    
    public void cuartos(){
        for(int i = 0; i<cuartos.length; i++){
            System.out.println(cuartos[i].getGanador());
        }
    }
    
    public void semis(){
        for(int i = 0; i<semis.length; i++){
            System.out.println(semis[i].getGanador());
        }
    }

    public void finalazo(){
        System.out.println(finalazo.getGanador());
    }

}
