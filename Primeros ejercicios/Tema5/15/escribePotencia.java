/**
 * Escribe la base y el exponente 
 *
 *  Jose Navarro Ortiz
 */
 
public class escribePotencia {
  public static void main(String[] args) {
  
      System.out.println("Introduce la base y el exponente y se mostrara por pantalla la sucesion de potencias");
      System.out.println("Introduce la base");
      int base = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce el exponente");
      int exponente = Integer.parseInt(System.console().readLine());
      int contador =1;
      while(contador<=exponente){
          System.out.println(base +"|" + contador+ "|");
          contador++;
        
      }
    }
  }
