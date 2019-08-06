import java.util.*;
/**
 * La Clase Empleado posee los atributos de: cuil, apellido, nombre, sueldo basico y año de ingreso.
 * <p>
 * 
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (08.2016)
 */
public class Empleado extends Persona {
    //Atributos
    private long cuil;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    
    //Constructor
    public Empleado(int p_dni,String p_nombre,String p_apellido,Calendar p_fechaN,
                    long p_cuil, double p_importe, int p_anioI){
        super(p_dni,p_nombre,p_apellido,p_fechaN);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anioI);
    }
    
    //int p_dni, String p_nombre, String p_apellido, Calendar p_fecha
    public Empleado(int p_dni,String p_nombre,String p_apellido,Calendar p_fechaN,Calendar p_fechaI,
                    long p_cuil, double p_importe){
        super(p_dni,p_nombre,p_apellido,p_fechaN);
        this.setCuil(p_cuil);
        this.setFechaIngreso(p_fechaI);
        this.setSueldoBasico(p_importe);
    }
    
    //Setters
    private void setCuil(long p_cuil){
        this.cuil=p_cuil;
    }
   
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico=p_importe;
    }
    private void setAnioIngreso(int p_anio){
        Calendar fecha=new GregorianCalendar();
        fecha.set(p_anio, 0, 1);
        this.setFechaIngreso(fecha);
    }
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso=p_fecha;
    }
    
    //Getters
    /**
     * el accesor getCuil() devuelve el numero de cuil del empleado
     * @return valor nuumerico de tipo long.
     */
    public long getCuil(){
        return this.cuil;
    }
    
    /**
     * el accesor getSueldoBasico() devuelve el sueldo basico  del empleado
     * @return valor numerico de tipo double.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    /**
     * el accesor getAnioIngreso() devuelve el año de ingreso del empleado
     * @return valor numerico de tipo int.
     */
    public int getAnioIngreso(){
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    /**
     * el accesor getAnioIngreso() devuelve la fecha de ingreso del empleado
     * @return valor tipo Calendar.
     */
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    /**
     * el método antiguedad Utiliza la Clase Calendar para devolver la antiguedad del <i>empleado</i> en base a la
     * fecha actual.
     */
    public int antiguedad(){
        Calendar fechaHoy=new GregorianCalendar();
        int anioHoy=fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioIngreso();
    }
    
    /**
     * Método descuento.
     * Calcula el descuento correspondiente al 2% del sueldoBasico, mas la suma de $12 de 
     * seguro de vida.
     */
    private double descuento(){
        double dosPorCiento=this.getSueldoBasico() * 0.02;
        return dosPorCiento + 12;
    }
    
    /**
     * Método adicional.
     * Calcula, en base a la antiguedad, una asignacion que se realiza sobre el sueldoBasico.
     */
    private double adicional(){
        if(this.antiguedad() < 2){
            return this.getSueldoBasico() * 0.02;
        }
        else if((this.antiguedad() >= 2) && (this.antiguedad() < 10)){
            return this.getSueldoBasico() * 0.04;
        }
        else {
            return this.getSueldoBasico() * 0.06;
        }
    }
    
    /**
     * Método sueldoNeto.
     * @return Calcula, <i>sueldoBasico</i> mas <i>adicional</i> menos <i>descuento</i>.
     */
    public double sueldoNeto(){
        return this.getSueldoBasico() + this.adicional() - this.descuento();
    }
    
        //     /**
        //      * Método nomYape.
        //      * @return Concatena <i>nombre</i> y <i>apellido</i> y lo devuelve como un <i>String</i>.
        //      */
        //     public String nomYape(){
        //         return this.getNombre() + " " + this.getApellido();
        //     }
        //     
        //         /**
        //      * Método apeYnom.
        //      * @return Concatena <i>apellido</i> y <i>nombre</i> y lo devuelve como un <i>String</i>.
        //      */
        //     public String apeYnom(){
        //         return this.getApellido() + " " + this.getNombre();
        //     }
    
    /**
     * Método mostrar.
     * <p>
     * Imprime por pantalla los datos del <i>empleado</i>.
     */
    public void mostrar(){
          //         System.out.println("Nombre y Apellido: " + this.nomYape() + ".");
        super.mostrar();
        System.out.println("CUIL: " + this.getCuil() + " - Antiguedad: " + this.antiguedad() + " años de servicio.");
        System.out.println("Sueldo neto: $" + this.sueldoNeto());
    }
    
    /**
     * Método mostrarLinea.
     * @return Concatena <i>cuil</i>, <i>apeYNom</i>, <i>sueldoNeto</i>. Lo devuelve como 
     * un <i>String</i>.
     */
    public String mostrarLinea(){
        return this.getCuil() + " " + super.apeYnom() + " .......... $" + this.sueldoNeto();
    }
    
    public boolean esAniversario(){
        Calendar fechaHoy=new GregorianCalendar();
        return (fechaHoy.get(Calendar.MONTH) == this.getFechaIngreso().get(Calendar.MONTH)) && (fechaHoy.get(Calendar.DATE) == this.getFechaIngreso().get(Calendar.DATE));
    }
}