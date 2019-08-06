import java.util.*;
/**
 * Write a description of class Delegacion here.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class Delegacion extends Visitante{
    private ArrayList <Individuo> integrantes;
    
    public Delegacion(String p_nombre,Calendar p_fechaVisita, Individuo p_individuo){
        super(p_nombre,p_fechaVisita);
        this.setIntegrantes(new ArrayList());
        this.inscribirIndividuo(p_individuo);
    }
    
    public Delegacion(String p_nombre,Calendar p_fechaVisita, ArrayList <Individuo> p_integrantes){
        super(p_nombre,p_fechaVisita);
        this.setIntegrantes(p_integrantes);
    }
    
    private void setIntegrantes(ArrayList <Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    
    public ArrayList <Individuo> getIntegrantes(){
        return this.integrantes;
    }
    
    
    public double entrada(){
        double precioActualIndv = 10.0;
        double descuento = 0.1;
        return (this.cantidadDeIntegrantes()*precioActualIndv)*(1-descuento);
    }
    
    public void inscribirIndividuo(Individuo p_individuo){
        this.getIntegrantes().add(p_individuo);
    }
    
    public int cantidadDeIntegrantes(){
        int contadorIntegrantes = 0;
        for(Individuo indv:this.getIntegrantes()){
            contadorIntegrantes++;
            }
       return contadorIntegrantes;
    }
    
    public String tipoVisitante(){
        return "Delegacion";
    }
    
    public void mostrar(){
        System.out.println("----------------------------------------");
        System.out.println("Delegación: " + this.getNombre());
        System.out.println("Integrantes");
        for(Individuo indv:this.getIntegrantes()){
            indv.mostrar();
        }
        System.out.println("Cantidad de Integrantes: " + this.cantidadDeIntegrantes() );  
        System.out.println("----------------------------------------");  
    }
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        boolean fechasIguales = ( 
        this.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR) &&
        this.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH) &&
        this.getFechaVisita().get(Calendar.DATE) == p_fecha.get(Calendar.DATE));
        
        if(this.tipoVisitante()==p_visitante && fechasIguales){
        this.mostrar(); 
       }
       
    }
}
    
    
    
    
   

