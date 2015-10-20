/**
 * pinta una piramide con un simbolo dentro introduciendo la altura y el caracter con el que quieres pintarlo.
 *
 *  Jose Navarro Ortiz
 */

public class piramideConCaracter{
  public static void main(String[] args) {
  
      System.out.println("Este programa pintara una piramide con un simbolo dentro introduciendo la altura y el caracter con el que quieres pintarlo");
  
      System.out.println("Introduce la altura");
      int altura = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce un caracter");
      String caracter = System.console().readLine();
      
      int contador = 0;
      int numeroCaracter = 0;
      numeroCaracter = altura;
      while (contador!=altura){
        
        
        while(numeroCaracter>0){
         
          System.out.print(caracter);
          
          while(numeroCaracter>1){
            System.out.println();
            numeroCaracter--;
          }
        }
        
        contador++;
        
        }
    }
  }
