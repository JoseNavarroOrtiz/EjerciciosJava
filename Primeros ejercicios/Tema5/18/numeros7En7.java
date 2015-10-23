/**
 * Dira el numero de enteros que hay entre dos numeros introducidos por teclado, de 7 en 7.
 *
 *  Jose Navarro Ortiz
 */

public class numeros7En7{
  public static void main(String[] args) {
  
      System.out.println("Dira el numero de enteros que hay entre dos numeros introducidos por teclado, de 7 en 7.");
      System.out.println("Introduce el primer numero");
      int primerNumero = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce el segundo numero");
      int segundoNumero = Integer.parseInt(System.console().readLine());
      int contador = 0;
      contador = primerNumero;
       System.out.println();
       System.out.println("Los numeros son los siguiente:");
      while (segundoNumero >= contador){
       
        System.out.print(", " + contador);
        
        contador = contador+7;
        }
  
  
    }
  }
