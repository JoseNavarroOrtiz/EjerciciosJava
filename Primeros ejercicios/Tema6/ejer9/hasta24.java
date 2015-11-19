/**
 * Este programa te dice numeros aleatorios pares hasta que aparezca el 24
 *
 *  Jose Navarro Ortiz
 */

public class hasta24{
  public static void main(String[] args) {
  
  System.out.println("Este programa te dice numeros aleatorios pares hasta que aparezca el 24");
  int numero=0;
  int contador=0;
    do{
      numero=((int)(Math.random()*51*2));
      System.out.print(numero+" ");
      contador++;
    }while(numero!=24);
    System.out.println("\n La cantidad de numeros que han salido ha sido "+contador);
  }
}
