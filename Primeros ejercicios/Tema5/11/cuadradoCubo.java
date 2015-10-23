/**
 * Este programa muestra el cubo y el cuadrado de un numero
 *
 * @author 
 */

public class cuadradoCubo{
  public static void main(String[] args) {
  
      System.out.println("Este programa muestra el cubo y el cuadrado de un numero en cm");
      System.out.println("Introduce un numero");
      int numero = Integer.parseInt(System.console().readLine());
      int contador =0;
      
      while(contador < 5){
      System.out.println("El cuadrado del numero "+ numero+" es " + numero*numero+ " cm² y el cubo es " + (numero*numero*numero)+ "cm³");
      numero++;
      contador++;
      }
    
    }
  }
