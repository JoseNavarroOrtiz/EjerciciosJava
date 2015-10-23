/**
 * muestra por pantalla todos los numeros desde 2 hasta 100
 *
 *  Jose Navarro Ortiz
 */

public class muestraNumerosPantalla{
  public static void main(String[] args) {
  
      System.out.println("Muestra por pantalla todos los numeros desde 2 hasta 100");
      
      for(int i=2;i<=100;i++){
        if(i%2!=0){
          System.out.print(i+",");
        }
      }
    
  }
}
