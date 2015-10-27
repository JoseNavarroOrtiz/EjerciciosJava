/*
 * realiza una serie de calculos media de los impares, el mayor de los pares, cuenta los numeros y se utilizara un valor negativo para salir 
 *
 *  Jose Navarro Ortiz
 */
 
public class intento2{
  public static void main(String[] args) {
  
    System.out.println("Este programa te realizara media impares,mayor de los pares,");
    System.out.println(",cuenta numeros introducidos y introduce un negativo para salir");
    
    double numero = 0;
    double mediaImpares = 0;
    double mayorPares=0;
    double contador =0;
    do{
      System.out.println("Introduce un numero");
      numero=Double.parseDouble(System.console().readLine());
      if (numero % 2 !=0 ){
        mediaImpares=mediaImpares+numero;
      }else{
        if(mayorPares<numero){
          mayorPares = numero;
        } 
      }
      contador++;
    }while(numero>=0);
    System.out.println("La media de los impares es "+ (mediaImpares/contador) );
    System.out.println("El numero mayor es "+mayorPares);
    System.out.println("Los numeros que se han introducido es "+ contador);
  }
}
