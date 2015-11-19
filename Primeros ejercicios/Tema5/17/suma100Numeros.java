/**
 * Introduce un numero y dira si es primo o no
 *
 *  Jose Navarro Ortiz
 */
 
public class suma100Numeros{
  public static void main(String[] args) {
  
      System.out.println("Suma los 100 numeros siguientes al numero que introduzcas");
      System.out.println("Introduce un numero");
      int numero = Integer.parseInt(System.console().readLine());
      
      int suma = 0;
      int numero1 = numero + 100;
      int contador = 0;
      
      if(numero>=0){
        numero = (numero) + 100;
      while(numero != contador){
        
        suma = suma + numero1;
        numero1--;
        contador++;
        }
        
      System.out.println("La suma de los numeros es " + suma);
      }else{
        System.out.println("El numero debe ser positivo");
        }
    }
  }
