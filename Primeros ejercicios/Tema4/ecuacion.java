/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class ecuacion{
  public static void main(String[] args) {
  
    System.out.println("Este programa resolvera una ecuancion de primer grado");
    System.out.println("Introduce el valor de a");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el valor de b");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a == 0){
     System.out.println("La ecuacion no tiene solucion");
      
    }else{
      System.out.println("El resultado de la ecuacion es " + (-b/a));
      }
  
  
    }
  }
