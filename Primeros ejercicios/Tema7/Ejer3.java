/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class Ejer3{
  public static void main(String[] args) {
  
      System.out.println("Introduce 10 numeros en el array, despues se mostraran de manera inversa");
      int [] num= new int [10];
      
      for(int i =0;i<10;i++){
          System.out.println("Introduce un numero");
          num[i]=Integer.parseInt(System.console().readLine());
      }
      for(int j=9;j>=0;j--){
          System.out.print(num[j]+" ");
      }
      
  }
}
