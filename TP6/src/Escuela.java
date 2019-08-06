import java.util.*;
/**
 * Write a description of class Escuela here.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class Escuela
{
   public static void main(){
       Scanner texto = new Scanner(System.in).useDelimiter("\n");
       String t_nombre=" ";
       String t_apellido = " ";
       int t_dni=0;
       int t_lu=0;
       double t_nota1 = 0.0;
       double t_nota2 = 0.0;
       Calendar t_fecha = new GregorianCalendar();
       Calendar t_fecha2 = new GregorianCalendar();
       boolean error = true;
       int t_diaN=0;
       int t_mesN=0;
       int t_anioN=0;
       char decision ='s';
       int opc;
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
        
         t_diaN=0;
              t_mesN=0;
              t_anioN=0;
                do{
                try{
                 System.out.println("Ingreso Datos del Alumno");
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
                 
                 System.out.print("ingrese numero de Libreta Universitaria :");
                 t_lu= texto.nextInt();
                 
                 System.out.println("Ingrese nota 1");
                 t_nota1=texto.nextDouble();
                 
                 System.out.println("Ingrese nota 2");
                 t_nota2=texto.nextDouble();
                 
                 System.out.println("Alumno INGRESADO");
                 error=false;
                 }
                catch(Exception e){
                    System.out.println("Ingreso erroneo Vuelva a ingresar datos");
                    texto.next();
                    error=true;
                }
             }while(error);
             t_fecha2.set(t_anioN, (t_mesN - 1), t_diaN);
               //      t_fecha.set(t_anioN, (t_mesN - 1), t_diaN);
             Alumno alumno1= new Alumno(t_dni,t_nombre,t_apellido,t_fecha2,t_lu);
                
               //      Alumno alumno1= new Alumno(t_dni,t_nombre,t_apellido,t_fecha,t_lu);
             alumno1.setNota1(t_nota1);
             alumno1.setNota2(t_nota2);
             
             alumno1.mostrar();
        
        break;
        
        
        
            default: System.out.println("Entrada No Permitida");
        }
        
        
        System.out.println("s para continuar,otra tecla para terminar");
        decision=texto.next().charAt(0);
        }
    }
}
