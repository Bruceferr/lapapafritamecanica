import java.util.*;
public class Grupos extends Partidos {
    
    private char letra;
    private ArrayList <Partidos> grupo = new ArrayList<>(8);
    private int empatados;
    private int ganados;
    
    public Grupos() {
        
    }
    public void contador() {
        empatados=0;
        ganados=0;
        for (Partidos actual : grupo){
            if((actual.getResultado()).equalsIgnoreCase("Empate")){
                empatados++;
            }else {
                 ganados++;
            }
        }  
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public ArrayList<Partidos> getGrupo() {
        return grupo;
    }

    public void setGrupo(ArrayList<Partidos> grupo) {
        this.grupo = grupo;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }   
}