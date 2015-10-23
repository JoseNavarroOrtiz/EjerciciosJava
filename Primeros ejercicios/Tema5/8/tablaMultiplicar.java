7/**
 * Este programa realiza la tabla de multiplicar de un numero
 *
 * @author 
 */

public class tablaMultiplicar{
  public static void main(String[] args) {
  
    System.out.println("Este programa realiza la tabla de multiplicar de un numero");
    int numero = Integer.parseInt(System.console().readLine());
    int contador = 0;
    System.out.println("\n");
    while(contador <= 10){
      System.out.println(contador + " x " + numero + " = " + (contador*numero));
      contador++;
      
      
      }
    
    }
  }
