/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class conversorMB {
  public static void main(String[] args) {
  
    String numero="";
  double mb = 1024;
  double kb = 0;
  
  
  
    System.out.println("introduzca el numero de kb y se pasara a mb");
    numero = System.console().readLine();
    kb = Double.parseDouble(numero);
    
    
    double total = (kb/mb); 
    System.out.printf("La conversion de kb a mb es %.2f",total);
    
  
   }
  }
  
