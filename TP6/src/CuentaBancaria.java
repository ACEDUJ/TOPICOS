/**
 * Abstract class CuentaBancaria - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class CuentaBancaria{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    public CuentaBancaria(int p_nroCuenta, double p_saldo, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    //Setters
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta=p_nroCuenta;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo=p_saldo;
    }

    private void setTitular(Persona p_titular){
        this.titular=p_titular;
    }
    
    //Getters
    /**
     * el accesor getNroCuenta devuelve el numero de cuenta.
     * @return valor de tipo entero.
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    /**
     * el accesor getSaldo devuelve el saldo de la cuetna.
     * @return valor de tipo real.
     */
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
     * El accesor getTitular() devuelve el titular de la cuenta.
     * @return tipo persona.
     */
    public Persona getTitular(){
        return this.titular;
    }
    
    /**
     * El método depositar() suma al saldo actual un importe recibido.
     * @param p_importe valor de tipo real que representa el importe recibido.
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    public void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
     /**
     * El método mostrar() imprime por pantalla los datos de la cuenta.
     */
    public void mostrar(){
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - Saldo: $" + this.getSaldo());
        System.out.println("Titular: " + titular.nomYape());
    }
}
