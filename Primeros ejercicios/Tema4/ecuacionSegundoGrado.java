/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class ecuacionSegundoGrado{
  public static void main(String[] args) {
  
    System.out.println("Este programa resolvera una ecuancion de segundo grado");
    System.out.println("Introduce el valor de a");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduce el valor de b");
    double b = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el valor de c");
    double c = Double.parseDouble(System.console().readLine());
    double discriminante= ((b*b)-(4*a*c));
  
      if((discriminante<=0)||(a==0)){
        System.out.println("La ecuacion no tiene resultado");
      } else {
        System.out.println("el resultado de la ecuacion es "+ (-b+((Math.sqrt(discriminante))/(2*a))));
        System.out.println("el resultado de la ecuacion es "+ (-b-((Math.sqrt(discriminante))/(2*a))));
        
        } 
      
      }
    }
      
