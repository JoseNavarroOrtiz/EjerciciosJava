/**
 * Este programa muestra el numero que introduzcas al reves
 *
 *  Jose Navarro Ortiz
 */
 
public class muestraNumeroReves{
  public static void main(String[] args) {
  
    System.out.println("Este programa muestra el numero que introduzcas al reves");
    System.out.println("Introduce un numero");
    int numero = Integer.parseInt(System.console().readLine());
    String texto = "";
  
    texto=Integer.toString(numero);
    System.out.print(texto.length());
    
      
    
  
    }
  }
