/**
 * Escribe la base y el exponente y calculare la potencia
 *
 *  Jose Navarro Ortiz
 */
 
public class muestraPotencia{
  public static void main(String[] args) {
  
      System.out.println("Introduce la base y el exponente y se mostrara por pantalla la sucesion de potencias");
      System.out.println("Introduce la base");
      int base = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce el exponente");
      int exponente = Integer.parseInt(System.console().readLine());
      int contador = 1;
      while (exponente != contador){
        System.out.println(base + "/" + contador);
        contador++;
        
        }
      System.out.println(base + "/" + contador);
    }
  }
