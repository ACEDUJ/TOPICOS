import java.util.*;
/**
 * Write a description of class Cargo here.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class Cargo{
   private String nombreCargo;
   private double sueldoBasico;
   private int anioIngreso;
   private int horasDeDocencia;
   
   public Cargo(String p_nombre, double p_sueldo, int p_anio, int p_horas){
       this.setNombreCargo(p_nombre);
       this.setSueldoBasico(p_sueldo);
       this.setAnioIngreso(p_anio);
       this.setHorasDeDocencia(p_horas);
   }
   
   private void setNombreCargo(String p_nombre){
    this.nombreCargo=p_nombre;
   }
   
   
   private void setSueldoBasico(double p_sueldo){
    this.sueldoBasico=p_sueldo;
   }
   
   private void setAnioIngreso(int p_anio){
    this.anioIngreso=p_anio;
   }
   
   private void setHorasDeDocencia(int p_horas){
    this.horasDeDocencia=p_horas;
   }
   
   public String getNombreCargo(){
       return this.nombreCargo; 
   }
   
   public double getSueldoBasico(){
       return this.sueldoBasico; 
   }
   
   public int getAnioIngreso(){
       return this.anioIngreso; 
   }
   
   public int getHorasDeDocencia(){
       return this.horasDeDocencia; 
   }
   
   public int antiguedad(){
       Calendar fechaHoy= new GregorianCalendar();
       return ( fechaHoy.get(Calendar.YEAR)- this.getAnioIngreso());
    }
   
   private double adicionalXantiguedad(){
       double adicional;
       adicional= (this.getSueldoBasico() / 100) * this.antiguedad();
       return adicional;
   
   }
   
   public double sueldoDelCargo(){
       return (this.getSueldoBasico()+ this.adicionalXantiguedad());
   }
   
   public void mostrarCargo(){
       System.out.println(this.getNombreCargo() +" - Sueldo Basico: "+this.getSueldoBasico()+" - Sueldo Cargo: "+ this.sueldoDelCargo() +"– Antiguedad: "+this.antiguedad() +" años");
       System.out.println("Horas Docencia: "+this.getHorasDeDocencia());
   }
   
}
