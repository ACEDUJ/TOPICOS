import java.util.*;
/**
 * Write a description of class Zoologico here.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class Zoologico{
 private  String nombre;
 private ArrayList <Visitante> visitantes;
 
 public Zoologico(String p_nombre){
    this.setNombre(p_nombre);
    this.setVisitantes(new ArrayList());
    }
 
 public Zoologico(String p_nombre, Visitante p_visitante){
    this.setNombre(p_nombre);
    this.setVisitantes(new ArrayList());
    this.nuevoVisitante(p_visitante);
    }
 
 public Zoologico(String p_nombre, ArrayList <Visitante> p_visitantes){
    this.setNombre(p_nombre);
    this.setVisitantes(p_visitantes);
    }
 
 private void setNombre(String p_nombre){
     this.nombre=p_nombre;
 }
 
 
 public String getNombre(){
     return this.nombre;
 }
 
 private void setVisitantes(ArrayList <Visitante> p_visitantes){
     this.visitantes= p_visitantes;
 }
 
 public ArrayList <Visitante> getVisitantes(){
     return this.visitantes;
 }
 
 public void nuevoVisitante(Visitante p_visitante){
     this.getVisitantes().add(p_visitante);
    }
 
 public void listaTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
     for(Visitante vis:this.getVisitantes()){
        vis.listarPorFecha(p_fecha,p_tipoVisitante);
        }
    }
 
 public void listaVisitantePorFecha(Calendar p_fecha){
      boolean fechasIguales;
      for(Visitante vis:this.getVisitantes()){
      fechasIguales = ( 
        vis.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR) &&
        vis.getFechaVisita().get(Calendar.MONTH) == p_fecha.get(Calendar.MONTH) &&
        vis.getFechaVisita().get(Calendar.DATE) == p_fecha.get(Calendar.DATE));
        
       if(fechasIguales){
        vis.mostrar();
        }
    } 
 }
 
 public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){
     boolean diaRango = false;
     boolean mesRango = false;
     boolean anioRango = false;
     boolean visitaEnRango = false;
     double recaudador= 0.0;
     for(Visitante vis:this.getVisitantes()){
         diaRango = (p_fechaDesde.get(Calendar.DATE) <= vis.getFechaVisita().get(Calendar.DATE) && 
                                      vis.getFechaVisita().get(Calendar.DATE)<= p_fechaHasta.get(Calendar.DATE));
         mesRango = p_fechaDesde.get(Calendar.MONTH) <=  vis.getFechaVisita().get(Calendar.MONTH) &&
                                      vis.getFechaVisita().get(Calendar.MONTH)<= p_fechaHasta.get(Calendar.MONTH);
         anioRango =p_fechaDesde.get(Calendar.YEAR) <=  vis.getFechaVisita().get(Calendar.YEAR) && 
                                     vis.getFechaVisita().get(Calendar.YEAR)<= p_fechaHasta.get(Calendar.YEAR);
         
         visitaEnRango = (diaRango && mesRango && anioRango);
         if(visitaEnRango){
         recaudador = recaudador + vis.entrada();
        }
    }
    return recaudador;
}
}
