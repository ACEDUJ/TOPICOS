import java.util.*;
/**
 * Write a description of class Facultad here.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class Facultad{
    private String nombre;
    private ArrayList <Profesor> profesores;
    
    public Facultad(String p_nombre,ArrayList <Profesor> p_profesores){
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }
    
    public Facultad(String p_nombre,Profesor p_profesor){
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList());
        this.adicionProfesor(p_profesor);
    }
    
    public void adicionProfesor(Profesor p_profesor){
        this.getProfesores().add(p_profesor);
    }
    
    private void setNombre(String t_nombre){
        this.nombre = t_nombre;
    }
    
    private void setProfesores(ArrayList <Profesor> t_profesores){
        this.profesores = t_profesores;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList <Profesor> getProfesores(){
        return this.profesores;
    }
    
    public void aniadirProfesor(){}
    
    public void nominaProfesores(){
        Iterator it_profesores = this.getProfesores().iterator();
      System.out.println("*************** Nómina Facultad: "+ this.getNombre());
      System.out.println("------------------------------------------------------------------");
      while(it_profesores.hasNext()) {
         Profesor t_profe = (Profesor)it_profesores.next();
         System.out.println(t_profe.mostrarLinea());
      }
      System.out.println("------------------------------------------------------------------");  
    }
    
    public double totalAPagar(){
        double t_totalSueldos = 0.0;
        Iterator it_profesores = this.getProfesores().iterator();
        while(it_profesores.hasNext()) {
         Profesor t_profe = (Profesor) it_profesores.next();
         t_totalSueldos =t_totalSueldos +  t_profe.sueldoTotal();
      }
      return   t_totalSueldos;
    }
    
    public void listarProfesorCargos(){
        Iterator it_profesores = this.getProfesores().iterator();
        System.out.println("***** Detalle de Profesores y cargos de Facultad: FaCENA *****");
        System.out.println("--------------------------------------------------------------------------------");
        while(it_profesores.hasNext()) {
         Profesor t_profe = (Profesor)it_profesores.next();
         t_profe.mostrar();
         System.out.println("------------------ **** -------------------");
        }
        System.out.println("** Sueldo Total: "+ this.totalAPagar() +"**");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Hay "+ this.getProfesores().size() +" profesores");
        
    }
}
