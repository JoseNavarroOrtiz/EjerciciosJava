/**
 * Muestra la tira de dos dados hasta que salga el mismo numero en los dos
 *
 *  Jose Navarro Ortiz
 */

public class DosDados{
  public static void main(String[] args) {
  
  System.out.println("Muestra la tira de dos dados hasta que salga el mismo numero en los dos");

  String dado1="";
  String dado2="";
  int numeroDado1=0;
  int numeroDado2=0;
   
    do{
      numeroDado1=(int)(Math.random()*6+1);
      numeroDado2= (int)(Math.random()*6+1);
      System.out.println("el numero del dado uno es "+numeroDado1+" y el numero del dado dos es "+numeroDado2);
    }while(numeroDado1!=numeroDado2);
    System.out.println("el numero que han sacado los dados es " +numeroDado1);
  }
}
