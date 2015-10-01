/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class Conversor {
  public static void main(String[] args) {
  
    double euros = 0; 
    double pesetas = (166.386* euros);
    String numero;
    
    
    System.out.println("Introduzca la cantidad en euros que quieres convertir en pesetas");
    numero = System.console().readline();
    euros = Double.parseDouble(numero);
    System.out.print("La cantidad de" + euros + "en pesetas es " + pesetas);
    
  
   }
  }
  
