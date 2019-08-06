import java.util.*;
/**
 * Write a description of class VentadeEntradas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VentadeEntradas{
    public static void main(){
        Scanner texto = new Scanner(System.in).useDelimiter("\n");
        int numVisitante;
    ArrayList t_delegacion = new ArrayList();
    String cadenaTipo=" ";
    String t_nomDelegacion;
    
     Calendar t_fechaN = new GregorianCalendar();
     Calendar t_fechaV = new GregorianCalendar();
        int t_diaN=0;
       int t_mesN=0;
       int t_anioN=0;
       int t_diaV=0;
       int t_mesV=0;
       int t_anioV=0;
       char decision ='s';
       int opc=1;
       String t_nombreFacultad;
       String t_nombre=" ";
       String t_apellido = " ";
       int t_dni=0;
       String t_nombreZoo= " ";
       System.out.println("Ingrese nombre del ZOOLOGICO");
    t_nombreZoo = texto.next();
    Zoologico zoologico = new Zoologico(t_nombreZoo);
    while(decision=='s' || decision=='S'){
        System.out.println("1- ingresar un visitante");
        System.out.println("2- Listar Visitantes (TIPO/FECHA)");
        System.out.println("3- Listar Visitantes (FECHA)");
        System.out.println("4- Obtener Recaudacion");
        System.out.println("ingrese opcion");
        opc=texto.nextInt();
        switch(opc){
            case 1: 
    
                    System.out.println("1- ingresar un Individuo");
                    System.out.println("2- ingresar una Delegacion");
                    numVisitante=texto.nextInt();
                
                if(numVisitante==1){
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
                            System.out.print("ingrese anio de Visita :");
                            t_anioV= texto.nextInt();
                            System.out.print("ingrese mes de Visita :");
                            t_mesV= texto.nextInt();
                            System.out.print("ingrese dia de Visita :");
                            t_diaV= texto.nextInt();
                            
                            t_fechaN.set(t_anioN, t_mesN, t_diaN);
                            t_fechaV.set(t_anioV, t_mesV, t_diaV);
                            Persona persona = new Persona(t_dni,t_nombre,t_apellido,t_fechaN);
                            Individuo individuo = new Individuo(persona.apeYnom(),t_fechaV,persona);
                            zoologico.nuevoVisitante(individuo);
                        
                }
                else if(numVisitante==2){
                    
                    
                    System.out.print("ingrese Nombre de la Delegacion :");
                            t_nomDelegacion=texto.next();
                            System.out.print("ingrese anio de Visita :");
                            t_anioV= texto.nextInt();
                            System.out.print("ingrese mes de Visita :");
                            t_mesV= texto.nextInt();
                            System.out.print("ingrese dia de Visita :");
                            t_diaV= texto.nextInt();
                            decision='s';
                    while(decision=='s' || decision=='S'){
                    System.out.print("INGRESO DE UN INTEGRANTE DE "+t_nomDelegacion);
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
                            
                            
                            t_fechaN.set(t_anioN, t_mesN, t_diaN);
                            
                            Persona personaD = new Persona(t_dni,t_nombre,t_apellido,t_fechaN);
                            Individuo individuoD =new  Individuo(personaD.apeYnom(),t_fechaV,personaD);
                    
                    t_delegacion.add(individuoD);
                    System.out.println("s para Ingresar otro integrante a la delegacion");
                    decision=texto.next().charAt(0);
                    }
                    t_fechaV.set(t_anioV, t_mesV, t_diaV);
                    Delegacion delegacion = new Delegacion(t_nomDelegacion,t_fechaV, t_delegacion);
                    zoologico.nuevoVisitante(delegacion);
                }
                else{
                    System.out.println("Ingreso Incorrecto");
                }
            break;
            
            case 2:
                System.out.print("LISTADO DE VISITANTES POR TIPO/FECHA DE VISITA");
                        System.out.println("SELECCIONE TIPO:");
                        System.out.println("1- Individuo");
                    System.out.println("2- Delegacion");
                    opc=texto.nextInt();
                    if(opc==1){cadenaTipo="Individuo"; 
                    }
                    else if(opc==2){cadenaTipo="Delegacion"; 
                    }
                
                        System.out.print("ingrese anio de Visita :");
                            t_anioV= texto.nextInt();
                            System.out.print("ingrese mes de Visita :");
                            t_mesV= texto.nextInt();
                            System.out.print("ingrese dia de Visita :");
                            t_diaV= texto.nextInt();
                            
                            t_fechaV.set(t_anioV, t_mesV, t_diaV);
                            zoologico.listaTipoVisitantePorFecha(t_fechaV,cadenaTipo);
            break;
            case 3:
                System.out.print("LISTADO DE VISITANTES POR FECHA DE VISITA");
                    System.out.print("ingrese anio de Visita :");
                            t_anioV= texto.nextInt();
                            System.out.print("ingrese mes de Visita :");
                            t_mesV= texto.nextInt();
                            System.out.print("ingrese dia de Visita :");
                            t_diaV= texto.nextInt();
                            t_fechaV.set(t_anioV, t_mesV, t_diaV);
                            
                         zoologico.listaVisitantePorFecha(t_fechaV);
                         
                
            break;
            case 4:
            Calendar t_fechaDesde = new GregorianCalendar();
            Calendar t_fechaHasta = new GregorianCalendar();
                System.out.print("RECAUDACION POR RANGO");
                System.out.print("FECHA DESDE");
                        System.out.print("ingrese anio de Visita :");
                            t_anioV= texto.nextInt();
                            System.out.print("ingrese mes de Visita :");
                            t_mesV= texto.nextInt();
                            System.out.print("ingrese dia de Visita :");
                            t_diaV= texto.nextInt();
                            t_fechaDesde.set(t_anioV, t_mesV, t_diaV);
                        System.out.print("FECHA HASTA");
                        System.out.print("ingrese anio de Visita :");
                            t_anioV= texto.nextInt();
                            System.out.print("ingrese mes de Visita :");
                            t_mesV= texto.nextInt();
                            System.out.print("ingrese dia de Visita :");
                            t_diaV= texto.nextInt();
                            t_fechaHasta.set(t_anioV, t_mesV, t_diaV);
                            System.out.println("La recaudacion es :");
                            System.out.println("$"+zoologico.recaudacion(t_fechaDesde,t_fechaHasta));
            break;
            default: System.out.println("Ingreso erroneo");
        }
        
        System.out.println("s para para realizar otra accion sobre el Zoologico");
                    decision=texto.next().charAt(0);
    }
    
    
    }
   
}
