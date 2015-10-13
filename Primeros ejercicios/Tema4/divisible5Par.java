/**
 * dice si es par o divisible por 5
 *
 *  Jose Navarro Ortiz
 */

public class divisible5Par{
  public static void main(String[] args) {
  
  System.out.println("Este programa te dira si el numero es par o divisible por 5");
  System.out.println("Introducce un numero");
  int numero = Integer.parseInt(System.console().readLine());
  if((numero % 5) == 0 && (numero % 2)==0){
    System.out.println("el numero es divisible por 5 y es par");
    }
  if((numero % 5) != 0 && (numero % 2) != 0){
    System.out.println("el numero no es divisible por 5 y no es par");
    }
  if((numero % 5) == 0 && (numero % 2) != 0){
    System.out.println("el numero es divisible por 5 y no es par");
    }
  if((numero % 5) != 0 && (numero % 2)==0){
    System.out.println("el numero no es divisible por 5 y es par");
    }
    }
  }
