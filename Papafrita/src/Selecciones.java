import java.util.*;
public class Selecciones {
    
    Scanner entrada = new Scanner (System.in);
    
    private String nombre;
    private String confederacion;
    private int posicion;
    private int ranking;
    private String eliminacion;
    private boolean campeon;

    public Selecciones() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConfederacion() {
        return confederacion;
    }

    public void setConfederacion(String confederacion) {
        this.confederacion = confederacion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int pisicion) {
        this.posicion = pisicion;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getEliminacion() {
        return "Esta seleccion fue llego hasta " + eliminacion;

    }

    public void setEliminacion(String eliminacion) {
        this.eliminacion = eliminacion;
    }

    
    public String toString (){ 
        if(campeon==true){
           return "Campeon del Mundo; Nombre "+ nombre +", Confederacion "+ confederacion + ", Posicion"+ posicion + ", Ranking"+ ranking + "Esta seleccion fue llego hasta " + eliminacion;   
        }else{
         return "Nombre "+ nombre +", Confederacion "+ confederacion + ", Posicion"+ posicion + ", Ranking"+ ranking + "Esta seleccion fue llego hasta " + eliminacion;
        }   
    }   
}