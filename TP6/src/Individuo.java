import java.util.*;
/**
 * Write a description of class Individuo here.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class Individuo extends Visitante{
    private Persona persona;
    
    public Individuo(String p_nombre, Calendar p_fecha, Persona p_persona){
        super(p_nombre,p_fecha);
        this.setPersona(p_persona);
    }
    
    private void setPersona(Persona p_persona){
        this.persona=p_persona;
    }
    
    public Persona getPersona(){
        return this.persona;
    }
    
    public void mostrar(){
        persona.mostrar();
    }
    
    public double entrada(){
        return 10.0;
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
    
    public String tipoVisitante(){
        return "Individuo";
    }
}
