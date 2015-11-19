/**
 * Este programa te dira el factorial del numero que introduzcas
 *
 *  Jose Navarro Ortiz
 */

public class factorial{
  public static void main(String[] args) {
  
  System.out.println("Este programa te dira el factorial del numero que introduzcas");
  System.out.println("Introduce un numero");
  int numero=Integer.parseInt(System.console().readLine());
  int contador=1;
  int solucion=1;
  while(contador<numero){
    solucion=(solucion*contador);
    contador++;
    }
  System.out.println("El factorial del numero "+numero+" es "+solucion);
  }
}
