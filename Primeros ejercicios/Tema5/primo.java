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
      
      if((numero==1)||(numero==2)||(numero==3)){
        System.out.println("El numero es primo");
      }
      if (numero<0){
        System.out.println("El numero no es positivo");
        }else{
          do{
            if(numero % contador ==0){
              System.out.println("El numero es primo");
              
            }else{
              System.out.println("El numero no es primo");
              contador++;
              }
          }while(contador != numero);
                
            
          
        
      }
    
    
    }
  }
