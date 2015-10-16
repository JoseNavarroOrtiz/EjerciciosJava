/**
 * Bucle do-while que te pregunta si quieres terminar o no
 *
 * @author 
 */

public class TerminaPregunta {
    
  public static void main(String[] args) {
        
    int numero;
    String respuesta="";
      
    do {
      System.out.print("Dime un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero % 2 == 0) {// comprueba si el número introducido es par
        System.out.println("Qué bonito es el " + numero);
      }
      
      System.out.println("Quieres que el programa acabe? contesta s/n");
      respuesta = System.console().readLine();
     }while ((numero % 2 == 0)|| (respuesta.equals("n")));
      
      
  }
}
