/**
 * Uso de variables enteras
 *
 * Jose Navarro
 */
 
public class Ope{
  public static void main(String[] args) {
    
  String numero="";
  double pnumero=0;
  double snumero=0;
  
  
    System.out.println("Se meteran por pantalla dos numeros y se realizaran");
    System.out.println("suma, resta, division y multiplicacion de esos dos numeros");
    System.out.println("introduzca el primer numero");
    numero = System.console().readLine();
    pnumero = Double.parseDouble(numero);
    
    System.out.println("introduzca el segundo numero");
    numero = System.console().readLine();
    snumero = Double.parseDouble(numero);
    double total = (snumero*pnumero); 
    
    System.out.println("El resultado de la suma es " + (pnumero+snumero));
    System.out.println("El resultado de la resta es " + (pnumero-snumero));
    System.out.println("El resultado de la division es "+ (pnumero/snumero));
    System.out.printf("El resultado de la multiplicacion es %.2f",total);
    
   }
  }
