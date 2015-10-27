/**
 * Introduce un  numero y te lo mostrara el reves el programa
 *
 *  Jose Navarro Ortiz
 */

public class numeroAlReves{
  public static void main(String[] args) {
    
    System.out.println("Introduce un  numero y te lo mostrara el reves el programa");
    System.out.println("Introduce un  numero");
    int numero= Integer.parseInt(System.console().readLine());
    String numerostr = Integer.toString(numero);
    
    for (int i=(numerostr.length()-1);i>=0;i--){
      System.out.print(numerostr.charAt(i));
      }
  
    


  }
}
