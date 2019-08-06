
/**
 * Write a description of class SemiExclusivo here.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class SemiExclusivo extends Cargo{
  private int horasDeInvestigacion;
    
    
    public SemiExclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horas, int p_horasInv){
        super(p_nombre,p_sueldo,p_anio,p_horas);
        this.setHorasDeInvestigacion(p_horasInv);
    }
    
    private void setHorasDeInvestigacion(int p_horasInv){
        this.horasDeInvestigacion= p_horasInv;
    }
    
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----");
        System.out.println("Horas investigación: "+ this.getHorasDeInvestigacion());
    }
}
