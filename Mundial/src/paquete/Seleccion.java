package paquete;

public class Seleccion {
  
    private Jugador[] equipo;
    private String nombre;
    private String confederacion;
    private char letragrupo;
    private int posicionbol;
    private int rankingfifa;
    private boolean campeon;
    private int eliminado;
    
    public Seleccion(){
        equipo = new Jugador[23];   
    }
    
    public Seleccion(Jugador[] e, String no, String con, char l, int pos, 
            int ran, boolean cam, int el){
        equipo = e;
        nombre = no;
        confederacion = con;
        letragrupo = l;
        posicionbol = pos;
        rankingfifa = ran;
        campeon = cam;
        eliminado = el;
    }

    public Jugador[] getEquipo() {
        return equipo;
    }

    public void setEquipo(Jugador[] equipo) {
        this.equipo = equipo;
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

    public char getLetragrupo() {
        return letragrupo;
    }

    public void setLetragrupo(char letragrupo) {
        this.letragrupo = letragrupo;
    }

    public int getPosicionbol() {
        return posicionbol;
    }

    public void setPosicionbol(int posicionbol) {
        this.posicionbol = posicionbol;
    }

    public int getRankingfifa() {
        return rankingfifa;
    }

    public void setRankingfifa(int rankingfifa) {
        this.rankingfifa = rankingfifa;
    }

    public boolean isCampeon() {
        return campeon;
    }

    public void setCampeon(boolean campeon) {
        this.campeon = campeon;
    }

    public int getEliminado() {
        return eliminado;
    }

    public void setEliminado(int eliminado) {
        this.eliminado = eliminado;
    }
    
    
    
}

