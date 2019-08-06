import java.util.*;
/**
 * La clase Alumno define el tipo Alumnom,que cuenta con los atributos necesarios para identificar un alumno a partir de su
 * libreta universitaria, nombre, apellido, y las notas que sacó en una instancia determinada.
 * 
 * @author (Joaquin Cruz ) 
 * @version (05.06.2016)
 */
public class Alumno extends Persona{
        private int lu;
        private double nota1;
        private double nota2;
        
        //CONSTRUCTOR
        public Alumno(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha,int p_lu){
            super(p_dni,p_nombre, p_apellido, p_fecha);
            this.setLu(p_lu);
        }
        
        //------------SETTERS---------------
        private void setLu(int p_lu){
             this.lu = p_lu;
            }
        
        public void setNota1(double p_nota){
            this.nota1 = p_nota;
        }
        
        public void setNota2(double p_nota){
            this.nota2 = p_nota;
        }
    
        //------------------GETTERS---------------
        
        public int getLu(){
            return this.lu;
        }
    
         
        public double getNota1(){
            return this.nota1;
        }
        
        public double getNota2(){
            return this.nota2;
        }
        
        //Otros Métodos
        /**
        * @Returns valor booleano
        * El método aprueba devuelve un valor booleano evaluando el valor de verdad de tres condiciones necesarias:
        * <p>
        * (1) El promedio de notas es igual o mayor a 7.
        * <p>
        * (2) La primer nota es igual o mayor a 6.
        * <p>
        * (3) La segunda nota es igual o mayor a 6.
        * <p>
        * de ser verdaderas las tres condiciones se devuelve un valor TRUE.
        */ 
        private boolean aprueba(){
            return (this.promedio() >= 7 && this.getNota1() >= 6.0 && this.getNota2() >= 6.0 );
        }
        
        private String leyendaAprueba(){
         if(this.aprueba() == true ){
            return "APROBADO";}
            else{
            return "DESAPROBADO";
            }
        }
        
        /**
         * El método promedio recibe las dos notas del alumno y calcula el promedio.
         */
        public double promedio(){
            return ( this.nota1 + this.nota2 ) / 2.0 ;
        }
        
        
        /**
         * El método mostrar se encarga de la impresión por pantalla de los datos del alumno.
         */
        public void mostrar(){
          super.mostrar();
          System.out.println("LU: "+this.getLu() +" Notas: " + this.getNota1() + "-" + this.getNota2());
          System.out.println("Promedio : "+this.promedio() + "-" + this.leyendaAprueba());
          
        }
}
