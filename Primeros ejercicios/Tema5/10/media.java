/**
 * realiza la media de numeros positivos
 *
 *  Jose Navarro Ortiz
 */

public class media{
  public static void main(String[] args) {
  
    System.out.println("Este programa realiza la media de los numeros positivos que introduzcas,para terminar marca un numero negativo");
    
    double suma = 0;
    double contador =0;
    
    double numero = 0;
     System.out.println("Introduce un numero");
      numero = Integer.parseInt(System.console().readLine());
    
    while (numero >= 0){
       contador++;
      suma = suma + numero;
      
      System.out.println("Vuelve a introducir otro numero");
      numero = Integer.parseInt(System.console().readLine());
  
     
    
    }
    if(contador>0){
     System.out.println("La media seria " + ((suma/contador)));
    }else{
     System.out.println("El numero no tiene media"); 
    }
    }
  }
