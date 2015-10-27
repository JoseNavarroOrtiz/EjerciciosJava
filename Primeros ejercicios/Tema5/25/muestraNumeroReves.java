/**
 * Introduce un  numero y te lo mostrara el reves el programa
 *
 *  Jose Navarro Ortiz
 */

public class numeroAlReves{
  public static void main(String[] args) {
    
    System.out.print("Introduce un  numero y te lo mostrara el reves el programa");
    System.out.print("Introduce un  numero");
    int numero= Integer.parseInt(System.console().readLine());
    String numerostr=Integer.toString(numero);
    
    System.out.println(numerostr.substring(0));
    
    
    


  }
}
