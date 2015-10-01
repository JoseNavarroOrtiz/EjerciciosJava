/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class areaCono{
  public static void main(String[] args) {
    
  
  
    double radio = 0;
    double altura = 0; 
    String numero ="";
    double pi = 3.1416;
    
    System.out.println("Introduce el radio del area del cono");
    numero = System.console().readLine();
    radio = Double.parseDouble(numero);
    System.out.println("Introduce la altura del cono");
    numero = System.console().readLine();
    altura = Double.parseDouble(numero);
    
    double resultado = ((pi*(radio*radio)*altura)/3);
    
    System.out.printf("El area del cono es %.2f",resultado);
  
    
    
   }
  }
