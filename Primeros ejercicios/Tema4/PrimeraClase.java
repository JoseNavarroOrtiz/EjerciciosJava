/**
 * 1. Salida por pantalla
 *
 * 1. Escribe una programa que muestre la primera clase del dia por pantalla.
 *
 * 
 */

public class PrimeraClase{
  public static void main(String[] args) {
  
  
  
  System.out.println("Escribe el numero del dia de la semana para saber que toca a primera hora");
  System.out.println("1 Lunes");
  System.out.println("2 Martes");
  System.out.println("3 Miercoles");
  System.out.println("4 Jueves");
  System.out.println("5 Viernes");
  
  int dia = Integer.parseInt(System.console().readLine()); ;
  String nombreSemana = "" ;
  
  
  
  switch(dia){
    case 1:
      nombreSemana = "FOL";
      break;
    case 2:
      nombreSemana = "Programacion";
      break;
    case 3:
      nombreSemana = "Sistemas Informaticos";
      break;
    case 4:
    nombreSemana = "Programacion";
      break;
    case 5:
    nombreSemana = "Bases de Datos";
      break;
      
    default:
    
    }
    if ((dia<=5)&&(dia>=1)){
        System.out.println("Este dia de la semana tenemos a primera hora " + nombreSemana);
      }else {
        System.out.println("Este dia no tienes clase");
      }
  
    }
}
