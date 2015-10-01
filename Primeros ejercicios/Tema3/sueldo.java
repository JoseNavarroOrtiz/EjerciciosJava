/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class sueldo{
  public static void main(String[] args) {
    
  
  
    double hSemanales = 0;
    
    String numero ="";
    
    System.out.println("Introduce las horas semanales que ha trabajado");
    numero = System.console().readLine();
    hSemanales = Double.parseDouble(numero);
    
    double resultado = (hSemanales*12);
    
    System.out.println("La total de la factura es " + resultado);
  
    
    
   }
  }
