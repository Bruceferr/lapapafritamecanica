package paquete;
import java.util.*;
public class Grupo{
   
    private Seleccion[] grupito;
    private char letra;
    private ArrayList<Partido> partido;

    public Grupo(){
        grupito = new Seleccion[4];
        partido = new ArrayList<Partido>();
    }

    public Grupo(Seleccion[] gru, char letr, ArrayList<Partido> par){
        
        grupito = gru;
        letra = letr;
        partido = par;
    } 

    public Seleccion primerPuesto(){
        Seleccion auxiliar = grupito[0];
        for(int i=1; i<grupito.length; i++){
            if(puntaje(grupito[i])>=puntaje(auxiliar)){
                if(puntaje(grupito[i])==puntaje(auxiliar)){
                    if(golesFavor(grupito[i])>golesFavor(auxiliar)){
                        auxiliar=grupito[i];
                    }
                }
                else{
                    auxiliar=grupito[i];
                }
                    
            }
        }    
        return auxiliar;
    }
    
    public Seleccion segundoPuesto(){
        Seleccion auxiliar = grupito[0];
        Seleccion auxiliar2 = grupito[0];
        for(int i=1; i<grupito.length; i++){
            if(puntaje(grupito[i])>=puntaje(auxiliar)){
                if(puntaje(grupito[i])==puntaje(auxiliar)){
                    if(golesFavor(grupito[i])>golesFavor(auxiliar)){
                        auxiliar=grupito[i];
                    }
                }
                else{
                    auxiliar=grupito[i];
                }
                    
            }
        }    
        for(int ii=1; ii<grupito.length; ii++){
            if(puntaje(grupito[ii])>puntaje(auxiliar2) && grupito[ii]!=auxiliar){
                auxiliar2 = grupito[ii];
            }
        }
    
        return auxiliar2;
    }
    
    
    public int golesFavor(Seleccion a){
        int contador = 0;
        for(Partido x : partido){
            if(x.getSeleccionA().getNombre().equalsIgnoreCase(a.getNombre())){
                contador+=x.getGseleccionA();
            }
            else{
                if(x.getSeleccionB().getNombre().equalsIgnoreCase(a.getNombre())){
                contador+=x.getGseleccionB();
            }
            }
        }
        
        return contador;
    
    }
    
    public int golesContra(Seleccion b){
        int contador = 0;
        for(Partido x : partido){
            if(x.getSeleccionA().getNombre().equalsIgnoreCase(b.getNombre())){
                contador+=x.getGseleccionB();
            }
            else{
                if(x.getSeleccionB().getNombre().equalsIgnoreCase(b.getNombre())){
                contador+=x.getGseleccionA();
                }   
            }
        }
    
        return contador;
    
    }
    
    public int partidosGanados(Seleccion a){
        int contador = 0;
        for(Partido x : partido){
            if(x.getGanador().equalsIgnoreCase(a.getNombre())){
                contador++;
            }
        }
        return contador;
    }
    
    public int partidosEmpatados(Seleccion b){
        int contador = 0;
        for(Partido x : partido){
            if(x.getSeleccionA().getNombre().equalsIgnoreCase(b.getNombre())){
                if(x.getGanador().equalsIgnoreCase("empate")){
                    contador++;
                }
            }
            else{
                if(x.getSeleccionB().getNombre().equalsIgnoreCase(b.getNombre())){
                    if(x.getGanador().equalsIgnoreCase("empate")){
                        contador++;
                    }
                }
            }
        }
        return contador;
    }
    
    public int partidosPerdidos(Seleccion c){
        
        int a = -1*(partidosGanados(c)+partidosEmpatados(c));
        return 3+a;
    }

        
    
    public Seleccion[] getGrupito() {
        return grupito;
    }

    public void setGrupito(Seleccion[] grupito) {
        this.grupito = grupito;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public ArrayList<Partido> getPartido() {
        return partido;
    }

    public void setPartido(ArrayList<Partido> partido) {
        this.partido = partido;
    }
    
    public int puntaje(Seleccion a){
        int b = partidosGanados(a)*3 + partidosEmpatados(a)*1;
        return b;
    }

    

}