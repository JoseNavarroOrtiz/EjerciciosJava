/**
 * Introduce un numero y dira si es primo o no
 *
 *  Jose Navarro Ortiz
 */
 
public class mediaHasta10000{
  public static void main(String[] args) {
  
  System.out.println("Este programa realiza la media de los numeros positivos que introduzcas,para terminar marca un numero negativo o llega a 10000");
    
    int suma = 0;
    int contador =0;
    int contador2=0;
    int numero = 0;
    
    while ((contador <10000)&&(numero>=0)){
      
      System.out.println("Introduce un numero");
      numero = Integer.parseInt(System.console().readLine());
    
      if(numero>=0){
        contador=contador+numero;
        suma = suma + numero;
        contador2++;
      }
    }
    System.out.println("La media seria " + ((suma/contador2)));
    }
  }
