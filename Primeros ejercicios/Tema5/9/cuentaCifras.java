/**
 * realiza la media de numeros positivos
 *
 *  Jose Navarro Ortiz
 */

public class cuentaCifras{
  public static void main(String[] args) {
  
  
  String numerostr="AB";
  
  System.out.println("Este programa te dice cuantas cifras tiene un numero");
  System.out.println("Introduce un numero");
  int numero = Integer.parseInt(System.console().readLine());
  
  numerostr=Integer.toString(numero);//cambia un entero a un string
  System.out.print(numerostr.length());//la longitud del String
  //System.out.println(numerostr.charAt(2));
  //System.out.println(numerostr.substring(0));//saca el numero completo.si le pones una coma despues del cero y pone un numero te va sacando por orden los numeros
  
  }
}
