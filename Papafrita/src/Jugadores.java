import java.util.*;
public class Jugadores  {
    
    Scanner entrada = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private double altura;
    private double peso;
    private String club;
    private String pais;
    private int debut;
    private String posicion1;
    private String posicion2;
            
    public Jugadores() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if((altura>1.50)||(altura<2.20)){
            this.altura = altura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if((altura>1.50)||(altura<2.20)){
            this.altura = altura;
        }
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        if((debut>1990)||(debut<2018)){
            this.debut = debut;
        }
    }

    public String getPosicion1() {
        return posicion1;
    }

    public void setPosiciones(String p1, String p2) {
        if((p1.equalsIgnoreCase("Arquero"))||(p2.equalsIgnoreCase("Arquero"))){
            posicion1="Arquero";
            posicion2=null;

        } else {
            posicion1=p1;
            posicion2=p2;
        }
    }

    public String getPosicion2() {
        return posicion2;
    }
  
    public String toString(){
    
        return "Nombre "+nombre +", Apellido "+ apellido + ", Altura"+altura+ 
                ", Peso"+ peso +", Club " + club + ", Pais "+ pais + ", Debut "
                + debut + ", Posiciones " + posicion1 + " " +posicion2;
        
    }
}