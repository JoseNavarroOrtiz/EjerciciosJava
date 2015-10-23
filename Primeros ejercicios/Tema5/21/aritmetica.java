/*
 * realiza una serie de calculos media de los impares, el mayor de los pares, cuenta los numeros y se utilizara un valor negativo para salir 
 *
 *  Jose Navarro Ortiz
 */
 
public class aritmetica{be
  public static void main(String[] args) {
  
  
  
  int numero = 0;
  int sumaMedia =0;
  int mediaImpares = (sumaMedia/contador);
  int contador = 0;
  int mayorPares=0;
  int cuentaNumeros =0;
  do{
    if((numero<0)){
    System.out.println("La media de los impares es "+ mediaImpares );
    System.out.println("El numero mayor es "+mayorPares);
    System.out.println("Los numeros que se han introducido es "+ contador);
    }else{
      cuentaNumeros++;
      while(numero % 2 != 0){
        sumaMedia = sumaMedia + numero;
        contador++;
      } 
      while(numero% 2 == 0){
        if(numero>mayorPares){
         mayorPares= numero;
        } 
        
      }
     
     }
    }while(numero>=0);
  
    }
  }
