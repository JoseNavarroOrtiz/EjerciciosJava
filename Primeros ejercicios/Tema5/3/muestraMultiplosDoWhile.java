/**
 * Muestra numeros multiplos de 5 de 0 a 100
 *
 * @author 
 */

public class muestraMultiplosDoWhile{
  public static void main(String[] args) {
  
  System.out.println("Este programa mostrara los multiplos de 5 de 0 a 100");
  int multiplo5 =-5 ;
  
  
    do {
    multiplo5 += 5; 
    if (multiplo5 % 5 == 0){
    System.out.println(multiplo5);
    }
  }while (multiplo5 < 100);
        
    
  }
}
