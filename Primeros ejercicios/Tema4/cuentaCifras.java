/**
 * Realiza un cuenta las cifras del numero que introduzcas
 *
 *  Jose Navarro Ortiz
 */

public class cuentaCifras{
  public static void main(String[] args) {
    System.out.println("Este progrma contara las cifras del numero que introduzcas,maximo 5 cifras");
    System.out.println("Introduce un numero");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    if(numero <= 99999){
    
      if((numero >= 10000)&&(numero<=99999)||(numero <= -10000)&&(numero>= -99999)){
      System.out.println("el numero de cifras es cinco");
      }
      if ((numero >= 1000)&&(numero<10000)||(numero <= -1000)&&(numero> -10000)){
      System.out.println("El numero de cifras es cuatro");
      
      }
      if ((numero >= 100)&&(numero<1000)||(numero <= -100)&&(numero> -1000)){
      System.out.println("El numero tiene tres cifras");
      
      }
      if ((numero >= 10)&&(numero<100)||(numero <= -10)&&(numero> -100)){
      System.out.println("El numero de cifras es dos");
      
      }
      if ((numero >= 0)&&(numero< 10)||(numero <= -1)&&(numero > -10)){
      System.out.println("El numero de cifras es una");
      
      }
    }else{
      System.out.println("<el numero es mayor a 5 cifras");
      }
  
    }
  }
