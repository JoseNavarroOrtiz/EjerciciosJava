/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class calculaFactura {
  public static void main(String[] args) {
  
    double bImponible = 0;
    double iva = 0.21 ;
    String numero =0;
    System.out.println("Introduce la base imponible y se realiyara la factura");
    numero = System.console().readline();
    bImponible = Double.parseDouble(numero);
    
    double resultado = (bImponible* iva);
    
    System.out.println("La total de la factura es " + (resultado + bImponible));
    
   }
}
