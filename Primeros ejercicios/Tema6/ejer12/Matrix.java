/**
 * llena la pantalla de caracteres
 *
 *  Jose Navarro Ortiz
 */

public class Matrix{
  public static void main(String[] args) {
  
  System.out.println("Este programa llena la pantalla de caracteres");
  int numero=0;
  char caracter=' ';
    while(numero>=0){
    caracter=(char)((int)((Math.random()*95)+32));
    System.out.print(caracter+" ");
    }
  }
}
