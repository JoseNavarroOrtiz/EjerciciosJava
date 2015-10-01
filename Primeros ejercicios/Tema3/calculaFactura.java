/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class calculaFactura{
  public static void main(String[] args) {
    
  
  
  double bImponible = 0;
    double iva = 0.21 ;
    String numero ="";
    
    System.out.println("Introduce la base imponible y se realizara la factura");
    numero = System.console().readLine();
    bImponible = Double.parseDouble(numero);
    
    double resultado = (bImponible* iva);
    
    System.out.println("La total de la factura es " + (resultado + bImponible));
  
    
    
   }
  }
