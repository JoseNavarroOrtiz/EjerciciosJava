/**
 * realiza la media de numeros positivos
 *
 *  Jose Navarro Ortiz
 */

public class media{
  public static void main(String[] args) {
  
    System.out.println("Este programa realiza la media de los numeros positivos que introduzcas,para terminar marca un numero negativo");
    
    int suma = 0;
    int contador =0;
    
    int numero = 0;
    
    while (numero >= 0){
      
      System.out.println("Introduce un numero");
      numero = Integer.parseInt(System.console().readLine());
    
      if(numero>=0){
      contador++;
      suma = suma + numero;
      }else{
      System.out.println("La media seria " + ((suma/contador)));
      }
    }
  
  
    }
  }
