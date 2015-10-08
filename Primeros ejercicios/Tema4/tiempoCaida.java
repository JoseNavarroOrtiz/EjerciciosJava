/**
 * 
 *
 *  Jose Navarro Ortiz
 */

public class tiempoCaida{
  public static void main(String[] args) {
    
    System.out.println("Este programa calculara el tiempo de caida de un objeto");
    System.out.println("Introduce la altura");
    double altura = Double.parseDouble(System.console().readLine());
    double resultadoAltura = ((2 * altura)/9.81);
    System.out.println("El tiempo que tarda en caer es " + (Math.sqrt(resultadoAltura)));                    
                                                        
  
  }
}
