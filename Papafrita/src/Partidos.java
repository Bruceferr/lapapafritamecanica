import java.util.*;
public class Partidos extends Jugadores  {
    
    Scanner entrada = new Scanner(System.in);
    
    private ArrayList<Jugadores> goles=new ArrayList<Jugadores>();
    private int dia;
    private int mes;
    private int anio=2018;
    private int hora;
    private int minuto;
    private String estadio;
    private String ciudad;
    private String resultado;
    private ArrayList <Selecciones> equipos= new ArrayList<>(1);

    public Partidos() {
    }
    public void aniadirSelecciones(Selecciones a, Selecciones b){
        equipos.add(a);
        equipos.add(b);     
    }
    
    public void insertar(Jugadores j) {
        goles.add(j);
    }
 
    public ArrayList<Jugadores> getLista() {
        return goles;
    }

    public void setLista(ArrayList<Jugadores> goles) {
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(mes == 06){
            if((dia >13)&&(dia<31)){
                this.dia=dia;
            }
        }
        if(mes == 07){
            if((dia >0)&&(dia<16)){
                this.dia=dia;
            }
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
         if((mes==06) || (mes==07)) {    
            this.mes = mes;
        }
    }

    public int getAnio() {
        return anio;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
         if((hora <25) && (hora >-1)) {    
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if((minuto <61) && (minuto >-1)) {    
            this.minuto = minuto;
        }
    }

    public String getEstadio() {
        return estadio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudadyEstadio() {
        int x=0;
        do{
            System.out.println("1/ Rostov Arena");
            System.out.println("2/ Spartak Stadium");
            System.out.println("3/ Luzhniki Stadium");
            System.out.println("4/ Nizhny Novgorod Stadium");
            System.out.println("5/ Samara Arena");
            System.out.println("6/ Kazan Arena");
            System.out.println("7/ Saint Petersburg Stadium");
            System.out.println("8/ Mordovia Arena");
            System.out.println("9/ Ekaterinburg Arena");
            System.out.println("10/ Kaliningrad Stadium");
            System.out.println("11/ Volgogrado Arena");
            System.out.println("12/ Fisht Stadium");  
            
            x = entrada.nextInt();
            
            switch(x){
                case 1: 
                    estadio = "Rostov Arena";
                    ciudad = "Rostov del Don";
                    break;                  
                case 2:
                    estadio = "Spartak Stadium";
                    ciudad = "Moscu";
                    break;
                case 3:
                    estadio = "Luzhniki Stadium";
                    ciudad = "Moscu";
                    break;
                case 4:
                    estadio = "Nizhny Novgorod Stadium";
                    ciudad = "Nizhny Novgorod";
                    break;
                case 5:
                    estadio = "Samara Arena";
                    ciudad = "Samara";
                    break;
                case 6:
                    estadio = "Kazan Arena";
                    ciudad = "Kazan";
                    break;
                case 7:
                    estadio = "Saint Petersburg Stadium";
                    ciudad = "San Petersburgo";
                    break;
                case 8:
                    estadio = "Mordovia Arena";
                    ciudad = "Saransk";
                    break;
                case 9:
                    estadio = "Ekaterinburg Arena";
                    ciudad = "Ekaterinburgo";
                    break;
                case 10:
                    estadio = "Kaliningrad Stadium";
                    ciudad = "Kaliningrado";
                    break;
                case 11:
                    estadio = "Volgogrado Arena";
                    ciudad = "Volgogrado";
                    break;
                case 12:
                    estadio = "Fisht Stadium";
                    ciudad = "Sochi";
                    break;
            }
        }while((x<1)&&(x>12));
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado, Selecciones s) {
        if(resultado.equalsIgnoreCase("Empate")){
            
        }
        if(resultado.equalsIgnoreCase("Ganador")){
        
            this.resultado="El ganador es "+ s.getNombre();
            
        }
    }
    
    public void mostrarGoles(){
        for (Jugadores actual : goles){
            System.out.println();
            System.out.println(actual.toString());
        }
    }
    
    public void mostrarEquipos(){
        for (Selecciones actual : equipos){
            System.out.println();
            System.out.println(actual.toString());
        }
    } 
}