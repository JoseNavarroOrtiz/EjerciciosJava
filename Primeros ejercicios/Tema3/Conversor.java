/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class Conversor {
  public static void main(String[] args) {
  
    String numero="";
  double euros = 0;
  double pesetas = 166.386;
  
  
  
    System.out.println("introduzca el numero de euros que quieres convertir en pesetas");
    numero = System.console().readLine();
    euros = Double.parseDouble(numero);
    
    
    double total = (euros*pesetas); 
    System.out.printf("La conversion de euros a pesetas es %.2f",total);
    
  
   }
  }
  
