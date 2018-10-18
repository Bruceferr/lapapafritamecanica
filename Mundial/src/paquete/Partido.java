package paquete;
import java.util.*;
public class Partido {
  
    private String fecha;
    private String hora;
    private Seleccion seleccionA;
    private Seleccion seleccionB;
    private int gseleccionA;
    private int gseleccionB;
    private String ciudad;
    private String estadio;
    private String ganador;
    private ArrayList<Jugador> goleador;
    
    public Partido(){
        goleador = new ArrayList<Jugador>();
    }
    
    public Partido(String fe, String ho, Seleccion A, Seleccion B, int gA, 
            int gB, String ciu, String est, String gan, ArrayList<Jugador> gol){
        fecha = fe;
        hora = ho;
        seleccionA = A;
        seleccionB = B;
        gseleccionA = gA;
        gseleccionB = gB;
        ciudad = ciu;
        estadio = est;
        ganador = gan;
        goleador = gol;
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Seleccion getSeleccionA() {
        return seleccionA;
    }

    public void setSeleccionA(Seleccion seleccionA) {
        this.seleccionA = seleccionA;
    }

    public Seleccion getSeleccionB() {
        return seleccionB;
    }

    public void setSeleccionB(Seleccion seleccionB) {
        this.seleccionB = seleccionB;
    }

    public int getGseleccionA() {
        return gseleccionA;
    }

    public void setGseleccionA(int gseleccionA) {
        this.gseleccionA = gseleccionA;
    }

    public int getGseleccionB() {
        return gseleccionB;
    }

    public void setGseleccionB(int gseleccionB) {
        this.gseleccionB = gseleccionB;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public ArrayList<Jugador> getGoleador() {
        return goleador;
    }

    public void setGoleador(ArrayList<Jugador> goleador) {
        this.goleador = goleador;
    }

    
    
}
