/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class Ejer6{
  public static void main(String[] args) {
  
      System.out.println("Introduce numeros en el array");
      int [] numero= new int [15];
     int actual=0;
     
     
      for(int i =0;i<15;i++){
          numero[i]=Integer.parseInt(System.console().readLine());
      }
      actual=numero[14];
       System.out.print(actual+" ");
       int primero= numero[0];
       System.out.print(primero+" ");
      
      for(int j=0;j<13;j++){
        numero[j]=numero[j+1];
       
        System.out.print(numero[j]+" ");
      }
      numero[0]=actual;
     
  }
}
