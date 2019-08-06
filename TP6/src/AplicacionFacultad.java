import java.util.*;
/**
 * Write a description of class AplicacionFacultad here.
 * 
 * @author (Joaquin Cruz Acevedo Duprat) 
 * @version (16.10)
 */
public class AplicacionFacultad{
    public static void main(){
        Scanner texto = new Scanner(System.in).useDelimiter("\n"); 
        //crear el/los cargo(s)
        Cargo[] t_cargos = new Cargo[3];
        Calendar t_fechaN = new GregorianCalendar();
        int t_diaN=0;
       int t_mesN=0;
       int t_anioN=0;
       char decision ='s';
       int opc=1;
       String t_nombreFacultad;
       String t_titulo;
       String t_nombre=" ";
       String t_apellido = " ";
       int t_dni=0;
       int numcargo=1;
       String t_nombreCargo;
       double t_sueldoBasico;
       int t_anioIngreso;
       int t_horasDocencia;
       int t_horasInvestigacion;
       int t_horasExtension;
       
       
        	System.out.println("INGRESE NOMBRE DE LA FACULTAD");
	t_nombreFacultad= texto.next();
	
	System.out.println("AVISO: PARA COMENZAR CON LA GESTION DEBE EXISTIR AL MENOS UN PROFESOR");





			System.out.println("Ingrese Titulo");
			t_titulo=texto.next();
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
		
		for(int i=0;i<=2;i++){
			System.out.println("1  - crear cargo ");
			System.out.println("2  - crear cargo semi-Exclusivo");
			System.out.println("3  - crear cargo Exclusivo");
			System.out.println("ingrese opcion");
			numcargo=texto.nextInt();
    		switch(numcargo){
    		
        		case 1:
        			System.out.println("nombre de cargo");
        			t_nombreCargo=texto.next();
        			System.out.println("sueldo basico");
        			t_sueldoBasico=texto.nextDouble();
        			System.out.println("anio de ingreso");
        			t_anioIngreso=texto.nextInt();
        			System.out.println("horas de docencia");
        			t_horasDocencia=texto.nextInt();
        			Cargo cargo = new Cargo(t_nombreCargo, t_sueldoBasico, t_anioIngreso, t_horasDocencia);
        			t_cargos[i]=cargo;
        		break;
        		
        		case 2:
        			System.out.println("nombre de cargo");
        			t_nombreCargo=texto.next();
        			System.out.println("sueldo basico");
        			t_sueldoBasico=texto.nextDouble();
        			System.out.println("anio de ingreso");
        			t_anioIngreso=texto.nextInt();
        			System.out.println("horas de docencia");
        			t_horasDocencia=texto.nextInt();
        			System.out.println("horas de investigacion");
        			t_horasInvestigacion=texto.nextInt();
        			Cargo cargoSemi = new SemiExclusivo(t_nombreCargo, t_sueldoBasico, 
        			                                   t_anioIngreso, t_horasDocencia, 
        			                                   t_horasInvestigacion);
        			t_cargos[i]=cargoSemi;			
        		
        		break;
        		
        		case 3:
        			System.out.println("nombre de cargo");
        			t_nombreCargo=texto.next();
        			System.out.println("sueldo basico");
        			t_sueldoBasico=texto.nextDouble();
        			System.out.println("anio de ingreso");
        			t_anioIngreso=texto.nextInt();
        			System.out.println("horas de docencia");
        			t_horasDocencia=texto.nextInt();
        			System.out.println("horas de investigacion");
        			t_horasInvestigacion=texto.nextInt();
        			System.out.println("horas de extension");
        			t_horasExtension=texto.nextInt();
        			Cargo cargoExclusivo = new Exclusivo(t_nombreCargo, t_sueldoBasico, 
        			                                   t_anioIngreso, t_horasDocencia, 
        			                                   t_horasInvestigacion,t_horasExtension);
        			t_cargos[i]=cargoExclusivo;		
        		break;
        		
        		default: System.out.println("NO HUBO INGRESO");
    		}
		
		
		}
		
		t_fechaN.set(t_anioN, (t_mesN - 1), t_diaN);
		
		Profesor profesor = new Profesor(t_dni,t_nombre,t_apellido,t_fechaN,t_titulo,t_cargos);
		
		Facultad facultad = new Facultad(t_nombreFacultad, profesor); 
		
    while(decision=='s' || decision == 'S'){		
    		
    	System.out.println("1 - ingresar un Profesor a la facultad");
    	System.out.println("2 - nomina Profesores");
    	System.out.println("3 - Listar Profesores");
    	System.out.println("Ingrese opcion");
    	opc=texto.nextInt();
    	
    	switch(opc){
    	
        	case 1:
        	
        			System.out.println("Ingrese Titulo");
        			t_titulo=texto.next();
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
        		
        		for(int i=0;i<=2;i++){
        			System.out.println("1  - crear cargo ");
        			System.out.println("2  - crear cargo semi-Exclusivo");
        			System.out.println("3  - crear cargo Exclusivo");
        			System.out.println("ingrese opcion");
			        numcargo=texto.nextInt();
            		switch(numcargo){
            		
                		case 1:
                			System.out.println("nombre de cargo");
                			t_nombreCargo=texto.next();
                			System.out.println("sueldo basico");
                			t_sueldoBasico=texto.nextDouble();
                			System.out.println("anio de ingreso");
                			t_anioIngreso=texto.nextInt();
                			System.out.println("horas de docencia");
                			t_horasDocencia=texto.nextInt();
                			Cargo cargo = new Cargo(t_nombreCargo, t_sueldoBasico, t_anioIngreso, 
                			                        t_horasDocencia);
                			t_cargos[i]=cargo;
                		break;
                		
                		case 2:
                			System.out.println("nombre de cargo");
                			t_nombreCargo=texto.next();
                			System.out.println("sueldo basico");
                			t_sueldoBasico=texto.nextDouble();
                			System.out.println("anio de ingreso");
                			t_anioIngreso=texto.nextInt();
                			System.out.println("horas de docencia");
                			t_horasDocencia=texto.nextInt();
                			System.out.println("horas de investigacion");
                			t_horasInvestigacion=texto.nextInt();
                			Cargo cargoSemi = new SemiExclusivo(t_nombreCargo, t_sueldoBasico, 
        			                                   t_anioIngreso, t_horasDocencia, 
        			                                   t_horasInvestigacion);
                			t_cargos[i]=cargoSemi;			
                		
                		break;
                		
                		case 3:
                			System.out.println("nombre de cargo");
                			t_nombreCargo=texto.next();
                			System.out.println("sueldo basico");
                			t_sueldoBasico=texto.nextDouble();
                			System.out.println("anio de ingreso");
                			t_anioIngreso=texto.nextInt();
                			System.out.println("horas de docencia");
                			t_horasDocencia=texto.nextInt();
                			System.out.println("horas de investigacion");
                			t_horasInvestigacion=texto.nextInt();
                			System.out.println("horas de extension");
                			t_horasExtension=texto.nextInt();
                			Cargo cargoExclusivo = new Exclusivo(t_nombreCargo, t_sueldoBasico, 
        			                                   t_anioIngreso, t_horasDocencia, 
        			                                   t_horasInvestigacion,t_horasExtension);
                			t_cargos[i]=cargoExclusivo;		
                		break;
                		
                		default: System.out.println("NO HUBO INGRESO");
            		}
        		
        		
        		}
        		
        		t_fechaN.set(t_anioN, (t_mesN - 1), t_diaN);
        		
        		profesor = new Profesor(t_dni,t_nombre,t_apellido,t_fechaN,t_titulo,t_cargos);
        		
        		facultad.adicionProfesor(profesor);	
        	
        	break;
        	
        	case 2:
        	facultad.nominaProfesores();
        	break;
        	
        	case 3:
        	facultad.listarProfesorCargos();
        	break;
        	
        	default: System.out.println("Ingreso Erroneo");
    	
    	}
    	
    	System.out.println("Desea realizar otra accion? afirmativo 's' , otra tecla para terminar");
    	decision= texto.next().charAt(0);
    	}
        
    
    
    }
}
