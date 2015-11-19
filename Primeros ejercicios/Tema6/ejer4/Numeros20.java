/**
 * Muestra 20 numeros aleatorios entre el 0 y el 10
 *
 *  Jose Navarro Ortiz
 */

public class Numeros20{
  public static void main(String[] args) {
  
    System.out.println("Muestra 20 numeros aleatorios entre el 0 y el 10");
    for(int i =0;i<20;i++){
      System.out.print((int)(Math.random()*11)+" ");
      }
  }
}
  
