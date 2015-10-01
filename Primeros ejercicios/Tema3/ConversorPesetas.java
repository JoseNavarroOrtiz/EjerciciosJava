/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class ConversorPesetas {
  public static void main(String[] args) {
  
    String numero="";
  double euros = 166.386;
  double pesetas = 0;
  
  
  
    System.out.println("introduzca el numero de pesetas que quieres convertir en euros");
    numero = System.console().readLine();
    pesetas = Double.parseDouble(numero);
    
    
    double total = (pesetas/euros); 
    System.out.printf("La conversion de pesetas a euros es %.2f",total);
    
  
   }
  }
  
