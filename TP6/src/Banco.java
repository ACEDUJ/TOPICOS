import java.util.*;
/**
 * La clase Banco instancia los tipos de cuenta disponible (CuentCorriente,CuentaBancaria y CuentaDeAhorro) y realiza movimientos en ellas.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    public static void main(){
        
        Calendar fecha1=new GregorianCalendar(1989, 8, 4);
        Persona persona1=new Persona(38714027, "Juan", "Perez", fecha1);
        
//         CuentaBancaria cuentaBancaria1= new CuentaBancaria(98,persona1);
//         System.out.println("Estado de la cuenta luego de depositar $600");
//         cuentaBancaria1.depositar(600);
//         cuentaBancaria1.mostrar();
//         System.out.println("Estado de la cuenta luego de extraer $200");
//         cuentaBancaria1.extraer(200);
//         cuentaBancaria1.mostrar();
//         System.out.println("----------------------");
//         CuentaBancaria cuentaBancaria2= new CuentaBancaria(99,persona1,1000);
//         cuentaBancaria2.mostrar();
//         System.out.println("Estado de la cuenta luego de extraer $200");
//         cuentaBancaria2.extraer(200);
//         cuentaBancaria2.mostrar();
        System.out.println("----------------------");
        CajaDeAhorro cajaDeAhorro1=new CajaDeAhorro(100, persona1);
        cajaDeAhorro1.mostrar();
        System.out.println("Estado de la cuenta luego de intentar extraer $200");
        cajaDeAhorro1.extraer(200);
        if(cajaDeAhorro1.extraer(200)==false){System.out.println(cajaDeAhorro1.xQNoPuedeExtraer(200));}
        System.out.println("Estado de la cuenta luego de depositar $110");
        cajaDeAhorro1.depositar(110);
        cajaDeAhorro1.mostrar();
        cajaDeAhorro1.extraer(10);
        cajaDeAhorro1.extraer(10);
        cajaDeAhorro1.extraer(10);
        cajaDeAhorro1.extraer(10);
        cajaDeAhorro1.extraer(10);
        cajaDeAhorro1.extraer(10);
        cajaDeAhorro1.extraer(10);
        cajaDeAhorro1.extraer(10);
        cajaDeAhorro1.extraer(10);
        cajaDeAhorro1.extraer(10);
        System.out.println("Estado de la cuenta luego de realizar 10 extracciones de $10");
        cajaDeAhorro1.mostrar();
        System.out.println("Si se intenta realizar otra extraccion de $10 :");
        cajaDeAhorro1.extraer(10);
        cajaDeAhorro1.mostrar();
        System.out.println("----------------------");
        CajaDeAhorro cajaDeAhorro2=new CajaDeAhorro(101, persona1, 1500);
        cajaDeAhorro2.mostrar();
        System.out.println("Estado de la cuenta luego de extraer $1500");
        cajaDeAhorro2.extraer(1500);
        cajaDeAhorro2.mostrar();
        System.out.println("Estado de la cuenta luego de extraer $150");
        cajaDeAhorro2.extraer(150);
        cajaDeAhorro2.mostrar();
        System.out.println("----------------------");
        CuentaCorriente cuentaCorriente1=new CuentaCorriente(102, persona1);
        cuentaCorriente1.mostrar();
        System.out.println("Estado de la cuenta luego de depositar $1000");
        cuentaCorriente1.depositar(1000);
        cuentaCorriente1.mostrar();
        System.out.println("Estado de la cuenta luego de extraer $1000");
        cuentaCorriente1.extraer(1000);
        cuentaCorriente1.mostrar();
        System.out.println("Estado de la cuenta luego de intentar extraer $150");
        cuentaCorriente1.extraer(150);
        cuentaCorriente1.mostrar();
        System.out.println("----------------------");
        CuentaCorriente cuentaCorriente2=new CuentaCorriente(107, persona1, 500);
        System.out.println("Estado de la cuenta luego de depositar $1000");
        cuentaCorriente1.depositar(1000);
        cuentaCorriente1.mostrar();
        System.out.println("Estado de la cuenta luego de depositar $1000");
        cuentaCorriente1.extraer(1000);
        cuentaCorriente1.mostrar();
        System.out.println("Estado de la cuenta luego de extraer $150");
        cuentaCorriente1.extraer(150);
        cuentaCorriente1.mostrar();
        
        if(persona1.esCumpleaños()){
            System.out.println("Feliz cumpleaños " + persona1.nomYape() +" !!");
        }
    }
}
