/**
 * Te dice la ultima cifra del numero que introduzcas
 *
 *  Jose Navarro Ortiz
 */

public class ultimoNumero{
  public static void main(String[] args) {
    System.out.println("Te dice la ultima cifra del numero que introduzcas");
    System.out.println("Introduce un numero");
    int numero = Integer.parseInt(System.console().readLine());
    
    
      if(numero < 0){
        numero = -numero;
        }
      System.out.println("La ultima cifra es " + (numero % 10));
      
  
    
  }
}
  
