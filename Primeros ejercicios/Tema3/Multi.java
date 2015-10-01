/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class Multi{
  public static void main(String[] args) {
    
  String numero="";
  double pnumero=0;
  double snumero=0;
  
  
  
    System.out.println("introduzca el primer numero");
    numero = System.console().readLine();
    pnumero = Double.parseDouble(numero);
    
    System.out.println("introduzca el segundo numero");
    numero = System.console().readLine();
    snumero = Double.parseDouble(numero);
    double total = (snumero*pnumero); 
    System.out.printf("El resultado de la multiplicacion es %.2f",total);
  
    
   }
  }
