/**
 * Introduce un numero y dira si es primo o no
 *
 *  Jose Navarro Ortiz
 */
 
public class primo{
  public static void main(String[] args) {
  
      System.out.println("Introduce un numero y dira si es primo o no");
      System.out.println("Introduce un numero");
      int numero = Integer.parseInt(System.console().readLine());
      int contador = 2;
      boolean esPrimo = true;
      
      if((numero==1)||(numero==2)||(numero==3)){
        System.out.println("El numero es primo");
      }else{
        while((contador < numero) && (esPrimo)){
          if(numero % contador ==0){
            esPrimo = false;
              
          }else{
            esPrimo = true;
           }
          contador++;
          }
          if(esPrimo){
          System.out.println("El numero es primo");
          }else{
          System.out.println("El numero no es primo");
          }
        }        
       
    }
  }
