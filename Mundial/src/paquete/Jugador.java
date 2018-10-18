package paquete;

public class Jugador {
    
    private String nombre;
    private String apellido;
    private String fechanac;
    private double altura;
    private double peso;
    private String paism;
    private String aniodebut;
    private String[] posicion;
    
    public Jugador(){
        posicion = new String[2];
    }
    
    public Jugador(String n, String a, String f, double al, double p, String pm,
            String ad, String[] pos){
        nombre = n;
        apellido = a;
        fechanac = f;
        altura = al;
        peso = p;
        paism = pm;
        aniodebut = ad;
        posicion = pos;
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

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPaism() {
        return paism;
    }

    public void setPaism(String paism) {
        this.paism = paism;
    }

    public String getAniodebut() {
        return aniodebut;
    }

    public void setAniodebut(String aniodebut) {
        this.aniodebut = aniodebut;
    }

    public String[] getPosicion() {
        return posicion;
    }

    public void setPosicion(String[] posicion) {
        this.posicion = posicion;
    }
    
    
}
