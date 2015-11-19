/**
 * muestra por pantalla todos los numeros desde 2 hasta 100
 *
 *  Jose Navarro Ortiz
 */

public class muestraNumerosPantalla{
  public static void main(String[] args) {
  
      System.out.println("Muestra por pantalla todos los primos desde 2 hasta 100");
      
      int contador = 1;
      boolean esPrimo = true;
      
      
        while((contador <=100) && (esPrimo)){
          if(numero % contador ==0){
            esPrimo = false;
              
          }else{
            esPrimo = true;
           }
          contador++;
          
          if(esPrimo){
          System.out.println(contador);
          }
        }        
  }
}
