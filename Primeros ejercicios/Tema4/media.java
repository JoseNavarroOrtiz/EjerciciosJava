/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class media{
  public static void main(String[] args) {
  
      System.out.println("Este programa calcula la media de 3 numeros");
      System.out.println("Introduce el primer numero");
      double primerNumero = Double.parseDouble(System.console().readLine());
      System.out.println("Introduce el segundo numero");
      double segundoNumero = Double.parseDouble(System.console().readLine());
      System.out.println("Introduce el tercer numero");
      double tercerNumero = Double.parseDouble(System.console().readLine());
      System.out.println("el resultado de la media es " + ((primerNumero+segundoNumero+tercerNumero)/3));
      
  
  
    }
  }
