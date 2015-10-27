/*
 * realiza una serie de calculos media de los impares, el mayor de los pares, cuenta los numeros y se utilizara un valor negativo para salir 
 *
 *  Jose Navarro Ortiz
 */
 
public class operaciones{
  public static void main(String[] args) {

    
    System.out.println("Este programa realiza una serie de calculos ");
    System.out.println("como la media de los impares, el mayor de los pares, cuenta los numeros y se utilizara un valor negativo para salir");
    double sumaMedia =0;
    double contador = 0;
    double mayorPares=0;
    double cuentaNumeros =0;

      do{
      System.out.println("Introduce un numero");
      numero = Double.parseDouble(System.console().readLine());
      
            if(numero% 2 == 0){
                if(numero>mayorPares){
                  mayorPares= numero;
                }
            }else{
              sumaMedia = sumaMedia + numero;
              contador++;
            } 
             
            cuentaNumeros++;    
      }while(numero >= 0);
      
      
            System.out.println("La media de los impares es "+ (sumaMedia/contador) );
            System.out.println("El numero mayor es "+mayorPares);
            System.out.println("Los numeros que se han introducido es "+ contador);
      
  }
}
