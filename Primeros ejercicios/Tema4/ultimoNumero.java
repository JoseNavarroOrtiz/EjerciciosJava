/**
 * Te dice la ultima cifra del numero que introduzcas
 *
 *  Jose Navarro Ortiz
 */

public class ultimoNumero{
  public static void main(String[] args) {
    System.out.println("Te dice la ultima cifra del numero que introduzcas");
    System.out.println("Introduce un numero");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    if(numero <= 99999){
    
      if((numero >= 10000)&&(numero<=99999)||(numero <= -10000)&&(numero>= -99999)){
      System.out.println("la ultima cifra es " + (numero % 10));
      }
      if ((numero >= 1000)&&(numero<10000)||(numero <= -1000)&&(numero> -10000)){
      System.out.println("La ultima cifra es " + (numero% 10));
      
      }
      if ((numero >= 100)&&(numero<1000)||(numero <= -100)&&(numero> -1000)){
      System.out.println("La ultima cifra es " + (numero % 10));
      
      }
      if ((numero >= 10)&&(numero<100)||(numero <= -10)&&(numero> -100)){
      System.out.println("La ultima cifra es " + (numero % 10));
      
      }
      if ((numero >= 0)&&(numero< 10)||(numero <= -1)&&(numero > -10)){
      System.out.println("La ultima cifra es " + numero);
      
      }
  
    }else{
      System.out.println("El numero es mayor a 5 cifras");
      }
  }
}
  
