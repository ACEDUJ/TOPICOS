import java.util.*;
/**
 * La Clase Persona, tiene como atributos DNI, Nombre, Apellido, Año nacimiento.
 * Importa la clase java.util, para utilizar GregorianCalendar.
 * 
 * @author (Joaquin Cuz Acevedo Duprat) 
 * @version (08.2016)
 */
public class Persona
{
    //Atributos
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    
    //Constructor
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    
    //Setters
    private void setDni(int p_dni){
        this.nroDni = p_dni;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setAnioNacimiento(int p_anio){
        Calendar fechaHoy = new GregorianCalendar();
        fechaHoy.set(p_anio, 0, 1);
        this.setFechaNacimiento(fechaHoy);
    }
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento=p_fecha;
    }
    
    //Getters
    public int getDni(){
        return  this.nroDni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getAnioNacimiento(){
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    /**
     * Método edad.
     * @return Cantidad de años cumplidos a la fecha, de la diferencia entre año de nacimiento a la del
     * equipo ya que utiliza la Clase Calendar.
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        if(fechaHoy.get(Calendar.MONTH) > this.getFechaNacimiento().get(Calendar.MONTH)){
            return fechaHoy.get(Calendar.YEAR) - (this.getFechaNacimiento().get(Calendar.YEAR) );
        }
        else if((fechaHoy.get(Calendar.MONTH) == this.getFechaNacimiento().get(Calendar.MONTH)) 
                && fechaHoy.get(Calendar.DATE) < this.getFechaNacimiento().get(Calendar.DATE)){
            return fechaHoy.get(Calendar.YEAR) - (this.getFechaNacimiento().get(Calendar.YEAR) );
        }
        else{
            return fechaHoy.get(Calendar.YEAR) - this.getFechaNacimiento().get(Calendar.YEAR) - 1;
        }
    }
    
    /**
     * Método nomYape.
     * @return Nombre y Apellido concatenados en un solo String.
     */
    public String nomYape(){
        return (this.getNombre() +" " + this.getApellido());
    }
    
     /**
     * Método apeYnom.
     * @return Apellido y Nombre concatenados en un solo String.
     */
    public String apeYnom(){
        return (this.getApellido() +" " + this.getNombre());
    }
    
    /**
     *Método mostrar.
     *@return Imprime por pantalla los datos de la persona (Nombre y Apellido, DNI y Edad).
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYape());
        System.out.println("DNI: " + this.getDni() + ". Edad: " + this.edad());
    }
    
    /**
     * el metodo esCumpleaños() evalua si el la fecha actual coincide con la fecha de nacimiento y retorna dicho valor.
     * @return valor de tipo <i>boolean</i>.
     */
    public boolean esCumpleaños(){
        Calendar fechaHoy=new GregorianCalendar();
        return (fechaHoy.get(Calendar.MONTH)==this.getFechaNacimiento().get(Calendar.MONTH))&&(fechaHoy.get(Calendar.DATE)==this.getFechaNacimiento().get(Calendar.DATE));
    }
}