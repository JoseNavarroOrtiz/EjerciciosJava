/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class salario{
  public static void main(String[] args) {
  
    System.out.println("Calculara el salario solo introduciendo las horas trabajadas");
    System.out.println("Cuantas horas has trabajado?");
    
    double horas = Double.parseDouble(System.console().readLine());
    if(horas <= 40){
      System.out.println("Su salario es " + (horas * 12));
      }else {
        System.out.println("Su salario es " + ((40 *12)+((horas-40) * 16)));
        }
    
  
    }
  }
