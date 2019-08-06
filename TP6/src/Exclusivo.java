
/**
 * Write a description of class Exclusivo here.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class Exclusivo extends Cargo{
    private int horasDeInvestigacion;
    private int horasDeExtension;
    
    
    public Exclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horas,
                     int p_horasInv, int p_horasExt){
        super(p_nombre,p_sueldo,p_anio,p_horas);
        this.setHorasDeInvestigacion(p_horasInv);
        this.setHorasDeExtension(p_horasExt);
    }
    
    private void setHorasDeInvestigacion(int p_horasInv){
        this.horasDeInvestigacion= p_horasInv;
    }
    
    private void setHorasDeExtension(int p_horasExt){
        this.horasDeExtension= p_horasExt;
    }
    
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    public int getHorasDeExtension(){
        return this.horasDeExtension;
    }
    
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo----");
        System.out.println("Horas investigación: "+ this.getHorasDeInvestigacion());
        System.out.println("Horas extensión: "+ this.getHorasDeExtension());
    }
}

