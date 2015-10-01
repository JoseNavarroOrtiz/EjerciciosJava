/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class conversorKB {
  public static void main(String[] args) {
  
    String numero="";
  double mb = 0;
  double kb = 1024;
  
  
  
    System.out.println("introduzca el numero de mb y se pasara a kb");
    numero = System.console().readLine();
    mb = Double.parseDouble(numero);
    
    
    double total = (mb*kb); 
    System.out.printf("La conversion de mb a kb es %.2f",total);
    
  
   }
  }
  
