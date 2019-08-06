import java.util.*;
/**
 * La clase empresa instancia un objeto del tipo Persona y otro objeto del tipo Empleado,
 * Muestra los valores actuales de sus respectivos atributos.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class Empresa{
   public static void main(){
       Scanner texto = new Scanner(System.in).useDelimiter("\n");
       String t_nombre=" ";
       String t_apellido = " ";
       int t_dni=0;
       int t_lu=0;
       double t_nota1 = 0.0;
       double t_nota2 = 0.0;
       Calendar t_fecha = new GregorianCalendar();
       Calendar t_fechaIngreso = new GregorianCalendar();
       Calendar t_fechaN2 = new GregorianCalendar();
       boolean error = true;
       int t_diaN=0;
       int t_mesN=0;
       int t_anioN=0;
       char decision ='s';
       int opc;
       int t_anioI=0;
       int t_mesI=0;
       int t_diaI=0;
       long t_cuil=0;
       double t_importe=0.0;
       
             while(decision=='s' || decision=='S'){
        System.out.println("1 - ingresar Persona");
        System.out.println("2 - ingresar Alumno");
        System.out.println("ingrese opcion");
        opc=texto.nextInt();
        
        
        switch(opc){
        
        case 1:
        
           do{
                try{
                 System.out.println("Ingreso Datos de la Persona");
                 System.out.print("ingrese DNI :");
                 t_dni= texto.nextInt();
                 System.out.print("ingrese apellido :");
                 t_apellido=texto.next();
                 System.out.print("ingrese nombre :");
                 t_nombre=texto.next();
                 
                 System.out.print("ingrese anio de Nacimento :");
                 t_anioN= texto.nextInt();
                 System.out.print("ingrese mes de Nacimento :");
                 t_mesN= texto.nextInt();
                 System.out.print("ingrese dia de Nacimento :");
                 t_diaN= texto.nextInt();
                
                 System.out.println("Persona INGRESADA");
                 error=false;
                 }
                catch(Exception e){
                System.out.println("Ingreso erroneo Vuelva a ingresar datos");
                texto.next();
                error=true;
                }
             }while(error);
             t_fecha.set(t_anioN, (t_mesN - 1), t_diaN);
             
             Persona persona1= new Persona(t_dni,t_nombre,t_apellido,t_fecha);
             persona1.mostrar();
        
        break;
        
        case 2:
        do{
            try{
             System.out.println("Ingreso Datos del Empleado");
             System.out.print("ingrese DNI :");
             t_dni= texto.nextInt();
             System.out.print("ingrese apellido :");
             t_apellido=texto.next();
             System.out.print("ingrese nombre :");
             t_nombre=texto.next();
             
             System.out.print("ingrese anio de Nacimento :");
             t_anioN= texto.nextInt();
             System.out.print("ingrese mes de Nacimento :");
             t_mesN= texto.nextInt();
             System.out.print("ingrese dia de Nacimento :");
             t_diaN= texto.nextInt();
             
             //cuil
             System.out.print("ingrese CUIL :");
             t_cuil=texto.nextLong();
             
             //fecha de Ingreso
             System.out.print("ingrese anio de Ingreso :");
             t_anioI= texto.nextInt();
             System.out.print("ingrese mes de Ingreso :");
             t_mesI= texto.nextInt();
             System.out.print("ingrese dia de Ingreso :");
             t_diaI= texto.nextInt();
             //sueldo basico
             System.out.print("ingrese Sueldo Basico :");
             t_importe= texto.nextDouble();
            
             System.out.println("Empleado INGRESADO");
             error=false;
             }
            catch(Exception e){
             System.out.println("Ingreso erroneo Vuelva a ingresar datos");
             texto.next();
             error=true;
            }
     }while(error);
     t_fechaIngreso.set(t_anioI, (t_mesI - 1), t_diaI);
     t_fechaN2.set(t_anioN, (t_mesN - 1), t_diaN);
     
     Empleado empleado1= new Empleado(t_dni,t_nombre,t_apellido,t_fechaN2,t_fechaIngreso,t_cuil,t_importe);
     empleado1.mostrar();
        
        break;
        
        
        
            default: System.out.println("Entrada No Permitida");
        }
        
        
        System.out.println("s para continuar,otra tecla para terminar");
        decision=texto.next().charAt(0);
        }
    }
   
}
