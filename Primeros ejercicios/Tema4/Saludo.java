/**
 * Ejemplo de un menú con switch
 *
 * @author Luis José Sánchez
 */

public class Saludo{
  public static void main(String[] args) {
  
  System.out.println("Introduce la hora que quieras y te saldra un saludo de pendiendo de la misma");
  int hora = Integer.parseInt(System.console().readLine());
  
  if ((hora > 0) && (hora < 25)){
    if ((hora > 5)&&(hora < 13)){
      System.out.println("Buenos dias");
    
    }
    if ((hora > 12)&&(hora < 21)){
      System.out.println("Buenas tardes");
    }
  
    
    if ((hora > 20)||(hora < 6)){
      System.out.println("Buenas noches");
    
    }
  }
  
  }
}
