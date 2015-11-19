/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class Ejer4{
  public static void main(String[] args) {
  
      System.out.println("hace el cuadrado y cubo de los numeros aleatorios del array");
      int [] numero= new int [20];
      
      System.out.print("NUMERO       CUADRADO       CUBO");
      System.out.println();
      
      
      for(int i =0;i<20;i++){
          
          numero[i]=((int)(Math.random()*100));
          System.out.print(numero[i]+"      ");
           System.out.print((numero[i]*numero[i])+"       ");
           System.out.print((numero[i]*numero[i]*numero[i]));
           System.out.println();
      }
      
      
  }
}
