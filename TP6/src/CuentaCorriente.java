
/**
 * Write a description of class CuentaCorriente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaCorriente extends CuentaBancaria{
     private double limiteDescubierto=500;
     
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta,p_saldo,p_titular);
    }
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta,p_titular);
    }
    
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto=p_limite;
    }
    
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     * el método extraer evalua si el tituar se encuentra en condiciones de realizar
     * una extraccion.
     */
    public void extraer(double p_importe){
        boolean valor;
        if(puedeExtraer(p_importe)==true){
            super.extraccion(p_importe);
            valor= true;
        }
        else{
            valor= false;
        }
    }
    
    public String xQNoPuedoExtraer(double p_importe){
        String aviso= " ";
        if(p_importe > this.getSaldo() + limiteDescubierto){
                aviso ="El importe de extraccion sobrepasa el limite de descubierto!";
            }

        return aviso;
    }
    
    /**
     * el método puedeExtraer() devuelve la evaluacion de la condicion necesaria para
     * la extración.
     * @return valor de tipo boolean.
     */
    private boolean puedeExtraer(double p_importe){
        return (p_importe <= this.getSaldo() + limiteDescubierto);
    }
    
    
}
