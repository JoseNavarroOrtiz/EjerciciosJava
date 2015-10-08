/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class diaSemana{
  public static void main(String[] args) {
  
  System.out.println("Introduce un numero y te dire el dia de la semana que es");
  
  int dia = Integer.parseInt(System.console().readLine());
  
  
  switch (dia){
    case 1:
      System.out.println("El primer dia es el lunes");
      break;
    
    case 2:
      System.out.println("El segundo dia es el martes");
      break;
    
    case 3:
      System.out.println("El tercer dia es el miercoles");
      break;
      
    case 4:
      System.out.println("El cuarto dia es el jueves");
      break;
      
    case 5:
      System.out.println("El quinto dia es el viernes");
      break;
      
    case 6:
      System.out.println("El sexto dia es el sabado");
      break;
    
    default:
      System.out.println("El septimo dia es el domingo");
    
      
    
    
    
    }
  
  
  
  
  
  
  
    }
  }
  
