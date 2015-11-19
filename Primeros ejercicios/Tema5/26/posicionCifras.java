/**
 * Este programa te mostrar todos los numeros menores al que introduzcas en primer lugar y no divisibles por el segundo numero que introduzcas
 *
 *  Jose Navarro Ortiz
 */

public class posicionCifras{
  public static void main(String[] args) {
  //patra contar de izquierda a derecha habra que darle la vuelta al numero y al mostrarlo
  // se severa de iyquierda a derecha.para darle la vuelta mirar los ejercicios del profesor
    System.out.println("Este programa deberas introducir un numero y ");
    System.out.println("te mostrara las posiciones en las que esta el numero que has introducido");
    System.out.println("Introduce el numero que quieras que lea");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el numero que quieras que te diga la posicion");
    int posicion = Integer.parseInt(System.console().readLine());
    String numerostr = Integer.toString(numero);
    int contador=numerostr.length();
    System.out.println();
    while(contador>0){
      if(numero%10==posicion){
        System.out.println(contador+ " posicion");
      }
      numero=numero/10;
      contador--;
    }
  
  
  
  }
}
