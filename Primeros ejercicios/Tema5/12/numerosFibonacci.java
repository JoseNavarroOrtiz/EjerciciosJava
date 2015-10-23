/**
 * pinta en pantalla los numero Fibonacci hasta el numero que introduzcas 
 *
 *  Jose Navarro Ortiz
 */

public class numerosFibonacci{
  public static void main(String[] args) {
  
      System.out.println("Introduce el numero hasta el que quieres que llegue los numeros Fibonacci");
      int numero = Integer.parseInt(System.console().readLine());
      int contador = 0;
      int primerF =0;
      int segundoF=1;
      int suma = 0;
      int aux = 0;
      if(numero < 0){
      System.out.println("No existen numeros Fibonacci");
      }
      while(numero>contador){
        aux=primerF;
        primerF=segundoF;
        segundoF=aux+segundoF;
        System.out.println(" "+segundoF);
        contador++;
        
        }
  
     
    
    }
  
  }
