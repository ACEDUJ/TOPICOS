import java.util.*;
/**
 * Write a description of class Profesor here.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class Profesor extends Persona{
    private String titulo;
    private Cargo[] cargos;
    
    public Profesor(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha,
                    String p_titulo, Cargo[] p_cargo){
                        super(p_dni,p_nombre,p_apellido,p_fecha);
                        this.setTitulo(p_titulo);
                        this.setCargo(p_cargo);
    }
        
    private void setTitulo(String p_titulo){
     this.titulo=p_titulo;
    }
    
    private void setCargo(Cargo[] p_cargos){
     this.cargos= p_cargos;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public Cargo[] getCargo(){
        return this.cargos;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println(this.getTitulo());
        this.listarCargos();
        System.out.println("** Sueldo Total: " + this.sueldoTotal() + " **");
    }
    
    public void listarCargos(){
        System.out.println("-***** Cargos Asignados *****-");
        System.out.println("---------------------------------------");
        Cargo[] aux_cargo = this.getCargo();
        
        for(int i=0;i<3;i++){
            if(aux_cargo[i]!=null){
             aux_cargo[i].mostrarCargo();
            }
        }
    }
    
    public double sueldoTotal(){
        double aux_sueldo = 0.0;
        Cargo[] aux_cargo = this.getCargo();
        for(int i=0;i<3;i++){
            if(aux_cargo[i]!=null){
             aux_sueldo = aux_sueldo + aux_cargo[i].sueldoDelCargo();
            }
        }
        
        return aux_sueldo;
    }
    
    public String mostrarLinea(){
        return ("DNI: "+this.getDni() +" - Nombre:"+ this.apeYnom() +" - Sueldo Total:"+ this.sueldoTotal());
    }
    
}
