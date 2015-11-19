/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class Ejer5{
  public static void main(String[] args) {
  
      System.out.println("Introduce numeros en el array");
      int [] numero= new int [10];
      int maximo=0;
      int minimo=20000;
     
      for(int i =0;i<10;i++){
          numero[i]=Integer.parseInt(System.console().readLine());
          if(numero[i]<minimo){
            minimo=numero[i];
          }
          if(numero[i]>maximo){
            maximo=numero[i];
          }
      }
      System.out.println("El numero maximo es "+maximo);
      System.out.println("El numero minimo es "+minimo);
      
  }
}
