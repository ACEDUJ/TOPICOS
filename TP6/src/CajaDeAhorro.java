
/**
 * Write a description of class CajaDeAhorro here.
 * 
 * @author (Joaquin Cruz Acevdo Duprat) 
 * @version (16.10)
 */
public class CajaDeAhorro extends CuentaBancaria{
    private int extraccionesPosibles = 10;
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta,p_titular);
    }
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta,p_saldo,p_titular);
    }
    
    private void setExtraccionesPosibles(int p_extPosibles){
        this.extraccionesPosibles = p_extPosibles;
    }
    
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    public boolean extraer(double p_importe){
        boolean valor;
         if(puedeExtraer(p_importe)==true){
            super.extraccion(p_importe);
            this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
            valor=true;
        }
        else{
            valor=false;
            }
        return valor;
    }
    
    private boolean puedeExtraer(double p_importe){
        return (this.getExtraccionesPosibles()>0 && p_importe<=this.getSaldo());
    }
    
    public String xQNoPuedeExtraer(double p_importe){
        String aviso= " ";
        if(this.getExtraccionesPosibles()==0){
                aviso =" No tiene habilitada mas extracciones! ";
            }
            
        if(this.getSaldo()-p_importe < 0){
               aviso= aviso +"/n"+" No puede extraer mas que el saldo!";
            }
        
        return aviso;
    }
    
    public void mostrar(){
        System.out.println("Caja de Ahorro -");
        super.mostrar();
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}
